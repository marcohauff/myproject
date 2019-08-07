package com.marco.firstspring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbconnection {

            public void mainMethod2() {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://database.gc.lab.ingenico.com:5432/bsp", "bsp_user", "s3cr3t")) {

            System.out.println("Java JDBC PostgreSQL Example");
            // When this class first attempts to establish a connection, it automatically loads any JDBC 4.0 drivers found within
            // the class path. Note that your application must manually load any JDBC drivers prior to version 4.0.
//          Class.forName("org.postgresql.Driver");

            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
            System.out.println("Reading usertable...");
            System.out.printf("%-30.30s  %-30.30s%n", "Name", "Password");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM usertable2");
            while (resultSet.next()) {
                System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("name"), resultSet.getString("pwd"));
            }

        } /*catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC driver not found.");
            e.printStackTrace();
        }*/ catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}
package com.marco.firstspring;

import java.sql.*;

public class dbconnectioninput {


    public void mainMethod3() {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://database.gc.lab.ingenico.com:5432/bsp", "bsp_user", "s3cr3t")) {

            Statement statementX = connection.createStatement();

// new data into database

            statementX.execute("INSERT INTO usertable2 (ID,NAME,PWD) VALUES (30, 'xhauff', 12345 )");

 // call DB connection method to validate if it worked correctly

            dbconnection xx = new dbconnection();
            xx.mainMethod2();


        } catch (SQLException e) {
            System.out.println("Connection failure read.");
            e.printStackTrace();
        }

    }
}
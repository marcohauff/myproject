package com.marco.firstspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import javax.swing.*;

import static java.lang.System.out;

//Service is a Spring command. Commandline runner is an interface and needs to be called.
@Service
public class openinsscherm implements CommandLineRunner {

    //@override is a java command. You might not need it but is currently best practice

    @Override
    public void run(String... args) throws Exception {



        Object[] options = {"Gambling",
                "Open DB connection",
                "push data into DB",
                "TH call"};
        Integer Choice = JOptionPane.showOptionDialog(null,
                "Which app do you want to use?",
                "Marco's Apps",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);

        out.println(Choice);

        // choice 0 goes to Marco2 method

        if (Choice.equals(0)){
            Marco2 m = new Marco2();
            m.mainMethod();}

        // choice 1 goes to dbconnection method

        if (Choice.equals(1)){
            dbconnection x = new dbconnection();
            x.mainMethod2();}

        if (Choice.equals(2)){
            dbconnectioninput x = new dbconnectioninput();
            x.mainMethod3();}

        if (Choice.equals(3)){
           SendJason y = new SendJason();
           y.Post_JSON();}

        else {out.println("not yet available");}
    }
}


package com.marco.firstspring;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;


public class Marco2 {


    public void mainMethod() {

        JOptionPane.showMessageDialog(null, "Lets start");

        String username = JOptionPane.showInputDialog("Username");
        String password = JOptionPane.showInputDialog("Password");

        if (username.equals("x") && password.equals("y")) {

            JOptionPane.showMessageDialog(null, "Correct");

        } else {

            JOptionPane.showMessageDialog(null, "Wrong userid & password");
        }


        Scanner keyboard = new Scanner(System.in);
        out.print("enter an number from 1 to 10  ");

        int InputNumber = keyboard.nextInt();
        int RandomNumber = new Random().nextInt(10) + 1;

        while (InputNumber != RandomNumber) {


            out.println("You Lost!");
            out.println("The winning number was  ");
            out.println(RandomNumber);
            out.println("Try Again");

            out.print("enter an number from 1 to 10  ");
            InputNumber = keyboard.nextInt();
            RandomNumber = new Random().nextInt(10) + 1;

//            int InputNumber2 = keyboard.nextInt();

//            int RandomNumber = new Random().nextInt(10) + 1;
        }

        out.print(" you win");
        keyboard.close();


    }

}
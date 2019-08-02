
import javax.swing.*;

import static java.lang.System.out;


public class openinsscherm {

    public static void main(String[] args) {



//        Object[] options = {"Gambling",
//                "Util 1",
//                "Util 2"};
//        JOptionPane.showOptionDialog(null,
//                "Which app do you want to use?",
//                "Marco's Apps",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.QUESTION_MESSAGE,
//                null,
//                options,
//                options[2]);


        Object[] options = {"Gambling",
                "Util 1",
                "Util 2"};
        Integer Choice = JOptionPane.showOptionDialog(null,
                "Which app do you want to use?",
                "Marco's Apps",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);

        out.println(Choice);

        if (Choice.equals(0)){
            Marco2 m = new Marco2();
            m.mainMethod();}



            else {out.println("not yet available");}

        }




    }


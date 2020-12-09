package com.example.foodieapp;

import android.util.Patterns;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Utiels {

    public static boolean passwordValidateCheck(String password){
        /*
        3.4.1	The account password shall be
        at least 9 characters,
        a letter,
        with at least one digit,
        and without any space
        */
        boolean lenghtOfPsswrord=false;// length checking
        boolean digit=false;//digit checking
        boolean letter=false;
        boolean emptySpace=false;// empty space checking
        if (password.length()>=9) {
            lenghtOfPsswrord=true;
            for (int i = 0; i < password.length(); i++) {

                if (Character.isDigit(password.charAt(i))) {// check if it is a digit
                    digit = true;
                }
                if (Character.isLetter(password.charAt(i))){// check if it is a character
                    letter=true;
                }
                if (Character.isWhitespace(password.charAt(i))) {//check if it is a
                    emptySpace = true;
                }

            }
            return (lenghtOfPsswrord&&letter&&digit&&!emptySpace);

        }else
            return false;

    }
    public static  boolean emailValidationSignIn(String email)throws IOException {
        File nFile= new File("");
        Scanner read=new Scanner(nFile);

        if(!email.isEmpty()&& Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            /*
            * if it is not empty
            * AND
            * if it is in the java class for checking if it is an emails or not
            */



            return true;
        }else{// empty email
            return false;
        }


    }



}

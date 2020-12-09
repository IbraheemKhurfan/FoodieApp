package com.example.foodieapp;

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



}

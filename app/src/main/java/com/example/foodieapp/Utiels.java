package com.example.foodieapp;

import android.util.Patterns;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
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
        if(!email.isEmpty()&& Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            /*
            * if it is not empty
            * AND
            * if it is in the java class for checking if it is an emails or not
            */
            File nFile= new File("Data.txt");//Go check email
            if(!nFile.exists())// if it is not there
                nFile.createNewFile();
            Scanner read=new Scanner(nFile);//read From file
            while(read.hasNext()){//go on all emails
                read.nextInt();//ID
                read.next();//Name
                if(email.equals(read.next())){// if email is found return false
                    return false;
                }
            }
            return true;
        }else{// empty email
            return false;
        }


    }
    public static void addUser(String name,String email,String password,String gender ) throws IOException{
        int id=name.hashCode()+email.hashCode()+password.hashCode()+gender.hashCode();
        if(id<=0){
            throw new IllegalArgumentException("ID invalid");
        }
        ArrayList<Account> arr= new ArrayList<Account>();
        Account acc=new Account(id,name,email,password,gender);
        File nFile= new File("Data.txt");
        FileWriter out=new FileWriter(nFile);
        if(!nFile.exists())// if it is not there
            nFile.createNewFile();
        Scanner in=new Scanner(nFile);//read From file
        while(in.hasNext()){//reading all accounts
            int readID=in.nextInt();
            String readName=in.next();
            String readEmail=in.next();
            String readPassword=in.next();
            String readGender=in.next();
            arr.add(new Account(readID,readName,readEmail,readPassword,readGender));
        }
        //adding the element for array to save it in the file
        arr.add(acc);
        for(int i=0;i<arr.size();i++){
            out.write(arr.get(i).getId()+" ");
            out.write(arr.get(i).getName()+" ");
            out.write(arr.get(i).getEmail()+" ");
            out.write(arr.get(i).getPassword()+" ");
            out.write(arr.get(i).getGender()+" ");
        }
        out.close();


    }




}

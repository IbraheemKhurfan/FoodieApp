package com.example.foodieapp;

import java.util.Scanner;

public class Account {
public static Scanner in = new Scanner(System.in);
    private String name;
    private String email;
    private String password;
   // private image pic;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
       if(name==null){
           throw new NullPointerException("EmptyString");
       }
        this.name = name;
    }

    public void setEmail(String email) {
        if(email==null){
            throw new NullPointerException("EmptyString");
        }
        this.email = email;
    }

    public void setPassword(String password) {
        if(password==null){
            throw new NullPointerException("EmptyString");

       }

    }

    public void setGender(String gender) {
        if(gender==null){
            throw new NullPointerException("EmptyString");
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age<10){
            throw new IllegalArgumentException("Not accpeted value");
        }
        this.age = age;
    }
}

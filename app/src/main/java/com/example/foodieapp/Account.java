package com.example.foodieapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;



public class Account implements Comparable<Account>{
    private int id;
    private String name;
    private String email;
    private String password;
    private String gender;
    //constructor
    public Account(int id,String name,String email,String password,String gender){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.gender=gender;

    }
    //Getters
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
    public int getId(){
        return id;
    }
    //Setters
    public void setId(int id){
        this.id=id;
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
    @Override
    public boolean equals(Object obj) {
        if (obj==null){
            throw new NullPointerException("Null object");
        }if(obj instanceof Account){
            Account ref=(Account)obj;
            return (this.email.equals(ref.getEmail())&&
                    this.gender.equals(ref.getGender())&&
                    this.getName().equals(ref.getName()));
        }else {
            throw new ClassCastException("Worng Class");
        }


    }
    @Override
    public String toString() {
        return "Account: [ ID "+this.id+", Name: "+this.name+", Email: "+this.email+", Password: "+this.password+", Gender: "+this.gender+"]";
    }
    @Override
    public int compareTo(Account ref) {
        if (ref==null){
            throw new NullPointerException("Empty Obj");
        }
        return (this.id-ref.getId());
    }
}

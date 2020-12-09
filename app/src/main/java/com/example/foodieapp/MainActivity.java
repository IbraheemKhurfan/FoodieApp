package com.example.foodieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void testClick(View v){

        TextView see=findViewById(R.id.textView2);


        Intent next=new Intent(MainActivity.this,MainPage.class);
        startActivity(next);


        see.setText("Your email is : "+"\n your password is ");


    }
    public void signIn(View v){
        EditText email= findViewById(R.id.EmailAddress);
        EditText password= findViewById(R.id.Password);
        EditText secondPassword= findViewById(R.id.Password1);
        boolean eamilCheck=false;
        boolean passwordCheck=false;
        boolean passwordSecondCheck=false;

        try {
            if(Utiels.emailValidationSignIn(email.getText().toString())){// if it is validated store it
                eamilCheck=true;
            }else {
                email.setError("Email is not valid ");
            }
        } catch (Exception e) {
            System.out.println("Email problem"+ e);
        }
        if(Utiels.passwordValidateCheck(password.getText().toString())){
            passwordCheck=true;

        }else{
            // if it is not satisfy the password
            password.setError("Password is not valid");
            Toast.makeText(this,"The account password Should be\n" +
                    "At least 9 characters" +
                    "Has at least one letter\n" +
                    "With at least one digit\n" +
                    "Without any space",Toast.LENGTH_LONG).show();
        }
        // check if the second password is same as the first password
        if(password.getText().toString().equals(secondPassword.getText().toString())){
            passwordSecondCheck=true;
        }else{// if it is not
            secondPassword.setError("Passwords are not the same");
        }








    }
    public void ShowPassword(View v){
        Switch sw= findViewById(R.id.switch1);
        EditText password= findViewById(R.id.Password);

        EditText password1= findViewById(R.id.Password1);
        if(!sw.isChecked()){

            Toast.makeText(this,"OFF",Toast.LENGTH_SHORT).show();
            password.setInputType(129);
            password1.setInputType(129);
            password.setTextAppearance(0);
            password.setError("Cnt be here");

            

            password1.setTextAppearance(0);






        }else {

            Toast.makeText(this,"ON",Toast.LENGTH_SHORT).show();
            password.setInputType(8);
            password1.setInputType(8);
            password.setTextAppearance(0);
            password1.setTextAppearance(0);
            password.setTextColor(00000);
            password1.setTextColor(00000);



        }
    }



}
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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void testClick(View v){

        TextView see=findViewById(R.id.textView2);
        EditText password= findViewById(R.id.Password);
        EditText email= findViewById(R.id.EmailAddress);
        Intent next=new Intent(MainActivity.this,MainPage.class);
        startActivity(next);


        see.setText("Your email is : "+email.getText()+"\n your password is "+password.getAutoSizeTextType()+" "+ Utiels.passwordValidateCheck(password.getText().toString()));


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
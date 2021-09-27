package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunctionPlus(View view) {
        EditText num1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText num2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        int result = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());

        goToActivity2(result);
    }

    public void clickFunctionMinus(View view) {
        EditText num1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText num2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        int result = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());

        goToActivity2(result);
    }

    public void clickFunctionTimes(View view) {
        EditText num1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText num2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        int result = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());

        goToActivity2(result);
    }

    public void clickFunctionDivide(View view) {
        EditText num1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText num2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        int result = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());

        goToActivity2(result);
    }

    public void goToActivity2(int result) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("int_value", result);
        startActivity(intent);
    }
}
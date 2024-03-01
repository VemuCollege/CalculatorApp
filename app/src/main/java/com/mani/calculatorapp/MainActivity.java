package com.mani.calculatorapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    //View Components Declaration
    EditText etFirstNumber,etSecondNumber;
    TextView tvResult;
    Button btnAdd,btnSub,btnMul,btnDiv,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // To Create a New Empty Window
        super.onCreate(savedInstanceState);

        // Load XML Design to this Activity
        setContentView(R.layout.activity_main);

        // intiailze View Component

        etFirstNumber = findViewById(R.id.etFirstNumber);
        etSecondNumber = findViewById(R.id.etSecondNumber);

        tvResult  = findViewById(R.id.tvResult);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnClear = findViewById(R.id.btnClear);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnClear.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {


        // Converting EditText value into String
        String firstNumber = etFirstNumber.getText().toString();
        String secondNumber= etSecondNumber.getText().toString();

        // Converting String to Integer

        int fNumber = Integer.parseInt(firstNumber);
        int sNumber = Integer.parseInt(secondNumber);
        int result = 0;


        if (v.getId() == R.id.btnAdd) {

            result = fNumber + sNumber;
            tvResult.setText(""+result);



        } else if (v.getId() == R.id.btnSub) {

            result = fNumber - sNumber;
            tvResult.setText(""+result);


        } else if (v.getId() == R.id.btnMul) {

            result = fNumber * sNumber;
            tvResult.setText(""+result);

        } else if (v.getId() == R.id.btnDiv) {

            result = fNumber / sNumber;
            tvResult.setText(""+result);

        }else if (v.getId() == R.id.btnClear) {

            etSecondNumber.setText("");
            etFirstNumber.setText("");
            tvResult.setText("");

        }
    }
}
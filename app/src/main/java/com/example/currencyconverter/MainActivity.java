package com.example.currencyconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button currencyConvert = findViewById(R.id.currenyConvert);
        EditText amount = findViewById(R.id.textView);
        EditText amountAfterConversion = findViewById(R.id.textView3);

        currencyConvert.setOnClickListener(view -> {
            String amountEntered = amount.getText().toString();
            double amountInRupees = Double.parseDouble(amountEntered);
            String amountObtainedAfterConversion = Double.toString(amountInRupees / 81.23);
            amountAfterConversion.setText(amountObtainedAfterConversion);
        });

    }

}
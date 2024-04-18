package com.msaggik.fifthlessonintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        output = findViewById(R.id.output);
        Bundle bundle = getIntent().getExtras();
        int outputSum = bundle.getInt("sum");

        output.setText("Стоимость комплекта: " + outputSum + " дублей");
    }
}
package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText usd, cad;
    Button transform;
    String cadDollar;
    int cadRate, usdRate, usResult, cadResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cad = findViewById(R.id.txtView1);
        usd = findViewById(R.id.txtView2);
        transform = findViewById(R.id.convert);

        transform.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                cadDollar = cad.getText().toString();
                usd.setText(Integer.parseInt(cadDollar)*0.74+"");

            }

        });



    }
}
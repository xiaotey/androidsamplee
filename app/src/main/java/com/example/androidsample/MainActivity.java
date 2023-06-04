package com.example.androidsample;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertCurrency(View view){
        EditText dollarText = findViewById(R.id.dollarText);
        TextView textView = findViewById(R.id.textView);
        if(!dollarText.getText().toString().equals("")){
            float dollarValue = Float.parseFloat(dollarText.getText().toString());
            float pesoValue = dollarValue * 55.62F;
            textView.setText(String.format(Locale.ENGLISH,"%.2f",pesoValue));
        } else{
            textView.setText(R.string.no_value_string);
        }
    }
}
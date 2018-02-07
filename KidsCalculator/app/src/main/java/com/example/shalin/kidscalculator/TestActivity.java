package com.example.shalin.kidscalculator;

import android.icu.util.ValueIterator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.widget.Toast.LENGTH_LONG;

public class TestActivity extends AppCompatActivity {
    TextView num1, num2, sign;
    EditText ans;
    int number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        num1 = (TextView) findViewById(R.id.textView1);
        num2 = (TextView) findViewById(R.id.textView3);
        sign = (TextView) findViewById(R.id.textView2);
        Random Random1 = new Random();
        number1 = Random1.nextInt(5) + 0;
        Random Random2 = new Random();
        number2 = Random2.nextInt(5) + 0;
        if (number1 >= number2) {
            num1.setText(String.valueOf(number1));
            num2.setText(String.valueOf(number2));
        } else {
            num1.setText(String.valueOf(number2));
            num2.setText(String.valueOf(number1));
        }
        if (number1 % 2 == 0) {
            sign.setText("+");
        } else {
            sign.setText("-");
        }

    }

    public void onCheck(View v) {
        ans = (EditText) findViewById(R.id.editText);
        int answer = Integer.parseInt(ans.getText().toString());
        if (number1 % 2 == 0) {
            if (answer == (number1 + number2)) {
                Toast.makeText(getBaseContext(), "CORRECT ANSWER!!!!!!!!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getBaseContext(), "OOPS WRONG ANSWER, TRY AGAIN!", Toast.LENGTH_LONG).show();
            }
        } else {
            if (answer == (number1 - number2)) {
                Toast.makeText(getBaseContext(), "CORRECT ANSWER!!!!!!!!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getBaseContext(), "OOPS WRONG ANSWER, TRY AGAIN!", Toast.LENGTH_LONG).show();
            }
        }

    }

    public void onNext(View v)
    {
        num1 = (TextView) findViewById(R.id.textView1);
        num2 = (TextView) findViewById(R.id.textView3);
        sign = (TextView) findViewById(R.id.textView2);
        Random Random1 = new Random();
        number1 = Random1.nextInt(5) + 0;
        Random Random2 = new Random();
        number2 = Random2.nextInt(5) + 0;
        if (number1 >= number2) {
            num1.setText(String.valueOf(number1));
            num2.setText(String.valueOf(number2));
        } else {
            num1.setText(String.valueOf(number2));
            num2.setText(String.valueOf(number1));
        }
        if (number1 % 2 == 0) {
            sign.setText("+");
        } else {
            sign.setText("-");
        }

    }

}

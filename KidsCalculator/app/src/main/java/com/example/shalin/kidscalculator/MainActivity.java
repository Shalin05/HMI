package com.example.shalin.kidscalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btLearn(View v)
    {
        Intent intent = new Intent(this, LearnActivity.class);
        startActivity(intent);

    }

    public void btTest(View v)
    {
        Intent intent = new Intent(this,TestActivity.class);
        startActivity(intent);

    }
}

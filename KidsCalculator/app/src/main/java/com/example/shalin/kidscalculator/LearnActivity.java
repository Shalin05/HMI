package com.example.shalin.kidscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

import static java.lang.Math.abs;

public class LearnActivity extends AppCompatActivity {
    LinearLayout linearLayout1,linearLayout2,linearLayout3,linearLayout4;
    GridLayout gridLayout;
    int z,y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        linearLayout1=(LinearLayout)findViewById(R.id.linearlayout1);
        linearLayout2=(LinearLayout)findViewById(R.id.linearlayout2);
        linearLayout3=(LinearLayout)findViewById(R.id.linearlayout3);
        linearLayout4=(LinearLayout)findViewById(R.id.linearlayput4);

                    }
    public void buttonNext(View v)
    {
        TextView num1= (TextView)findViewById(R.id.Number1);
        Random Random1= new Random();
        int number1= Random1.nextInt(5)+0;
        num1.setText(String.valueOf(number1));
        TextView num2 = (TextView)findViewById(R.id.num2);
        Random Random2 = new Random();
        int number2 = Random2.nextInt(5)+0;
        num2.setText(String.valueOf(number2));
        TextView sign = (TextView)findViewById(R.id.t_sign);
        if (number1%2==0)
        {
            sign.setText("+");

        }
        else
        {
            sign.setText("-");
        }
        linearLayout1.removeAllViews();
        for (int i =0; i<number1;i++)
        {
            ImageView image= new ImageView(LearnActivity.this);
            image.setBackgroundResource(R.drawable.apple);
            linearLayout1.addView(image);
        }
        linearLayout2.removeAllViews();
        for (int i =0; i<number2;i++)
        {
            ImageView image= new ImageView(LearnActivity.this);
            image.setBackgroundResource(R.drawable.apple);
            linearLayout2.addView(image);
        }
        TextView answer = (TextView)findViewById(R.id.textView3);
        linearLayout3.removeAllViews();
        linearLayout4.removeAllViews();
        if (number1%2==0)
        {
            answer.setText("ANSWER= "+String.valueOf(number1+number2));
            for (int j=0;j<number1;j++)
            {
                ImageView imageView = new ImageView(LearnActivity.this);
                imageView.setBackgroundResource(R.drawable.apple);
                linearLayout3.addView(imageView);
            }
            for (int j=0;j<number2;j++)
            {
                ImageView imageView = new ImageView(LearnActivity.this);
                imageView.setBackgroundResource(R.drawable.apple);
                linearLayout4.addView(imageView);
            }


            }
        else {
            answer.setText("ANSWER= "+String.valueOf(abs((number1-number2))));
            z=(number1<number2)?number1:number2;
            y=abs(number1-number2);
            for (int j=0;j<y;j++)
            {
                ImageView imageView = new ImageView(LearnActivity.this);
                imageView.setBackgroundResource(R.drawable.apple);
                linearLayout3.addView(imageView);
            }

            for ( int j=0;j<z;j++)
            {
                ImageView imageView = new ImageView(LearnActivity.this);
                imageView.setBackgroundResource(R.drawable.eatenapple);
                linearLayout4.addView(imageView);
            }


        }



    }

}

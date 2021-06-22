package com.example.calcymath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button dot;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button per;
    private Button equal;
    private Button clear;
    private Button back;
    private TextView info;
    private TextView result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '÷';
    private final char PERCENTAGE = '%';
    private final char EQU = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;
    private double k=0;
    private char last;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { info.setText(info.getText().toString() + "."); }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().toString().length() > 0) {
                    compute();
                    ACTION = SUBTRACTION;
                    result.setText(String.valueOf(val1) + "-");
                    info.setText(null);
                }
                else if(ACTION == EQU)
                {
                    val1 = k;
                    ACTION = SUBTRACTION;
                    result.setText(String.valueOf(val1) + "-");
                    info.setText(null);
                }
                else if(result.getText().toString().charAt(result.getText().toString().length()-1) == '+' || result.getText().toString().charAt(result.getText().toString().length()-1)=='-' || result.getText().toString().charAt(result.getText().toString().length()-1)=='x' || result.getText().toString().charAt(result.getText().toString().length()-1)=='÷' || result.getText().toString().charAt(result.getText().toString().length()-1)=='%') {
                        result.setText(result.getText().toString().substring(0, result.getText().toString().length() - 1) + "-");
                        ACTION = SUBTRACTION;
                        info.setText(null);
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().toString().length() > 0) {
                    compute();
                    ACTION = ADDITION;
                    result.setText(String.valueOf(val1) + "+");
                    info.setText(null);
                }
                else if(ACTION == EQU)
                {
                    val1 = k;
                    ACTION = ADDITION;
                    result.setText(String.valueOf(val1) + "+");
                    info.setText(null);
                }
                else if(result.getText().toString().charAt(result.getText().toString().length()-1) == '+' || result.getText().toString().charAt(result.getText().toString().length()-1)=='-' || result.getText().toString().charAt(result.getText().toString().length()-1)=='x' || result.getText().toString().charAt(result.getText().toString().length()-1)=='÷' || result.getText().toString().charAt(result.getText().toString().length()-1)=='%') {
                    result.setText(result.getText().toString().substring(0, result.getText().toString().length() - 1) + "+");
                    ACTION = ADDITION;
                    info.setText(null);
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().toString().length() > 0) {
                    compute();
                    ACTION = MULTIPLICATION;
                    result.setText(String.valueOf(val1) + "x");
                    info.setText(null);
                }
                else if(ACTION == EQU)
                {
                    val1 = k;
                    ACTION = MULTIPLICATION;
                    result.setText(String.valueOf(val1) + "x");
                    info.setText(null);
                }
                else if(result.getText().toString().charAt(result.getText().toString().length()-1) == '+' || result.getText().toString().charAt(result.getText().toString().length()-1)=='-' || result.getText().toString().charAt(result.getText().toString().length()-1)=='x' || result.getText().toString().charAt(result.getText().toString().length()-1)=='÷' || result.getText().toString().charAt(result.getText().toString().length()-1)=='%') {
                    result.setText(result.getText().toString().substring(0, result.getText().toString().length() - 1) + "x");
                    ACTION = MULTIPLICATION;
                    info.setText(null);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().toString().length() > 0) {
                    compute();
                    ACTION = DIVISION;
                    result.setText(String.valueOf(val1) + "÷");
                    info.setText(null);
                }
                else if(ACTION == EQU)
                {
                    val1 = k;
                    ACTION = DIVISION;
                    result.setText(String.valueOf(val1) + "÷");
                    info.setText(null);
                }
                else if(result.getText().toString().charAt(result.getText().toString().length()-1) == '+' || result.getText().toString().charAt(result.getText().toString().length()-1)=='-' || result.getText().toString().charAt(result.getText().toString().length()-1)=='x' || result.getText().toString().charAt(result.getText().toString().length()-1)=='÷' || result.getText().toString().charAt(result.getText().toString().length()-1)=='%') {
                    result.setText(result.getText().toString().substring(0, result.getText().toString().length() - 1) + "÷");
                    ACTION = DIVISION;
                    info.setText(null);
                }
            }
        });

        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().toString().length() > 0) {
                    compute();
                    ACTION = PERCENTAGE;
                    result.setText(String.valueOf(val1) + "%");
                    info.setText(null);
                }
                else if(ACTION == EQU)
                {
                    val1 = k;
                    ACTION = PERCENTAGE;
                    result.setText(String.valueOf(val1) + "%");
                    info.setText(null);
                }
                else if(result.getText().toString().charAt(result.getText().toString().length()-1) == '+' || result.getText().toString().charAt(result.getText().toString().length()-1)=='-' || result.getText().toString().charAt(result.getText().toString().length()-1)=='x' || result.getText().toString().charAt(result.getText().toString().length()-1)=='÷' || result.getText().toString().charAt(result.getText().toString().length()-1)=='%') {
                    result.setText(result.getText().toString().substring(0, result.getText().toString().length() - 1) + "%");
                    ACTION = PERCENTAGE;
                    info.setText(null);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().toString().length() > 0) {
                    if(ACTION != EQU) {
                        compute();
                        ACTION = EQU;
                        result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                        info.setText(null);
                        k = val1;
                        val1 = Double.NaN;
                        val2 = Double.NaN;
                    }
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.NaN;
                val2 = Double.NaN;
                info.setText(null);
                result.setText(null);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length() > 0){
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length()-1));
                }
            }
        });

    }

    private void setupUIViews(){

        one = (Button)findViewById(R.id.bt1);
        zero = (Button)findViewById(R.id.bt0);
        two = (Button)findViewById(R.id.bt2);
        three = (Button)findViewById(R.id.bt3);
        four = (Button)findViewById(R.id.bt4);
        five = (Button)findViewById(R.id.bt5);
        six = (Button)findViewById(R.id.bt6);
        seven = (Button)findViewById(R.id.bt7);
        eight = (Button)findViewById(R.id.bt8);
        nine = (Button)findViewById(R.id.bt9);
        dot = (Button)findViewById(R.id.btdot);
        add = (Button)findViewById(R.id.btadd);
        sub = (Button)findViewById(R.id.btsub);
        mul = (Button)findViewById(R.id.btmul);
        div = (Button)findViewById(R.id.btdiv);
        per = (Button)findViewById(R.id.btp);
        equal = (Button)findViewById(R.id.bteq);
        info = (TextView)findViewById(R.id.display);
        result = (TextView)findViewById(R.id.result);
        clear = (Button)findViewById(R.id.btac);
        back = (Button)findViewById(R.id.btcl);
    }

    private void compute(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(info.getText().toString());

            switch(ACTION){
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case PERCENTAGE:
                    val1 = val1/100 *val2;
                    break;
                case EQU:
                    break;
            }
        }
        else{
            val1 = Double.parseDouble(info.getText().toString());
        }
    }
}
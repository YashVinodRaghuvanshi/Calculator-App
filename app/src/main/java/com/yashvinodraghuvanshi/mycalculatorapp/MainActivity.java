package com.yashvinodraghuvanshi.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    TextView dp_ans, dp_cal;
    ImageView n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;
    ImageView plus, minus, multiply, divide, modulo, equeld, ac, dot;
    String data = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp_ans = findViewById(R.id.display_ans);
        dp_cal = findViewById(R.id.display_calculations);

        n0 = findViewById(R.id.num_0);
        n1 = findViewById(R.id.num_1);
        n2 = findViewById(R.id.num_2);
        n3 = findViewById(R.id.num_3);
        n4 = findViewById(R.id.num_4);
        n5 = findViewById(R.id.num_5);
        n6 = findViewById(R.id.num_6);
        n7 = findViewById(R.id.num_7);
        n8 = findViewById(R.id.num_8);
        n9 = findViewById(R.id.num_9);

        plus = findViewById(R.id.num_add);
        minus = findViewById(R.id.num_minus);
        multiply = findViewById(R.id.num_multiply);
        divide = findViewById(R.id.num_divide);
        modulo = findViewById(R.id.num_modulo);
        equeld = findViewById(R.id.num_equels);
        ac = findViewById(R.id.num_ac);
        dot = findViewById(R.id.num_dot);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dp_cal.setText("");
                dp_ans.setText("");
            }
        });

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+"0");
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+"1");
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+"2");
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+"3");
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+"4");
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+"5");
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+"6");
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+"7");
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+"8");
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+"9");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+"+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+"-");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+"*");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+"/");
            }
        });
        modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+"%");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = dp_cal.getText().toString();
                dp_cal.setText(data+".");
            }
        });

        equeld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = dp_cal.getText().toString();
                data.replaceAll("×","*");
                data.replaceAll("÷","/");
                data.replaceAll("%","/100");


                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult = "";
                Scriptable scriptable = rhino.initStandardObjects();
                finalResult = rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();

                dp_ans.setText(finalResult);
            }
        });



    }
}
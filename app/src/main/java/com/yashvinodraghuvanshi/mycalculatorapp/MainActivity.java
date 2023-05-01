package com.yashvinodraghuvanshi.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView dp_ans, dp_cal;
    ImageView n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;
    ImageView plus, minus, multiply, divide, modulo, equeld, ac;

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



    }
}
package com.example.faide.btnllprog;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button btn1 = new Button(this);
        btn1.setText("1");

        Button btn2 = new Button(this);
        btn2.setText("2");

        Button btn3 = new Button(this);
        btn3.setText("3");

        Button btn4 = new Button(this);
        btn4.setText("4");

        Button btn5 = new Button(this);
        btn5.setText("5");

        Button btn6 = new Button(this);
        btn6.setText("6");

        Button btn7 = new Button(this);
        btn7.setText("7");

        Button btn8 = new Button(this);
        btn8.setText("8");

        Button btn9 = new Button(this);
        btn9.setText("9");

        Button btn10 = new Button(this);
        btn10.setText("10");

        Button btn11 = new Button(this);
        btn11.setText("11");

        Button btn12 = new Button(this);
        btn12.setText("12");

        Button btn13 = new Button(this);
        btn13.setText("13");


        Button btn14 = new Button(this);
        btn14.setText("14");

        Button btn15 = new Button(this);
        btn15.setText("15");

        Button btn16 = new Button(this);
        btn16.setText("16");

        Button btn17 = new Button(this);
        btn17.setText("17");

        Button btn18 = new Button(this);
        btn18.setText("18");

        Button btn19 = new Button(this);
        btn19.setText("19");

        Button btn20 = new Button(this);
        btn20.setText("20");

        ScrollView Scroll = new ScrollView(this);
        Scroll.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));

        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));

        ll.addView(btn1);
        ll.addView(btn2);
        ll.addView(btn3);
        ll.addView(btn4);
        ll.addView(btn5);
        ll.addView(btn6);
        ll.addView(btn7);
        ll.addView(btn8);
        ll.addView(btn9);
        ll.addView(btn10);
        ll.addView(btn11);
        ll.addView(btn12);
        ll.addView(btn13);
        ll.addView(btn14);
        ll.addView(btn15);
        ll.addView(btn16);
        ll.addView(btn17);
        ll.addView(btn18);
        ll.addView(btn19);
        ll.addView(btn20);
        Scroll.addView(ll);
        setContentView(Scroll);

    }
}

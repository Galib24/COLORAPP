package com.example.colorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button b1=(Button)findViewById(R.id.btnRed);
        final Button b2=(Button)findViewById(R.id.btnBlue);
        final Button b3=(Button)findViewById(R.id.btnPink);
        final Button b4=(Button)findViewById(R.id.btnGreen);
        final Button b5=(Button)findViewById(R.id.btnGray);
        final Button b6=(Button)findViewById(R.id.btnYellow);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMyScreencolor(Color.RED);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMyScreencolor(Color.BLUE);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMyScreencolor(0xFFFFC0CB);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMyScreencolor(Color.GREEN);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMyScreencolor(Color.LTGRAY);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMyScreencolor(Color.YELLOW);
            }
        });




    }

    public void setMyScreencolor(int color){
        View view=this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
}
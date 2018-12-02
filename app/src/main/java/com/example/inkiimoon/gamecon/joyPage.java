package com.example.inkiimoon.gamecon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class joyPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joy_page);

        ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton1);

        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);

        ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);

        ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);

        ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);

        ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);

        ImageButton imageButton7 = (ImageButton) findViewById(R.id.imageButton7);

        ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton8);

        final TextView showButtonCick = (TextView) findViewById(R.id.showbuttonclick);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtonCick.setText("UP");
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtonCick.setText("RIGHT");
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtonCick.setText("DOWN");
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtonCick.setText("LEFT");
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtonCick.setText("TRIANGLE");
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtonCick.setText("CIRCLE");
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtonCick.setText("CROSS");
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButtonCick.setText("SQUARE");
            }
        });



    }
}

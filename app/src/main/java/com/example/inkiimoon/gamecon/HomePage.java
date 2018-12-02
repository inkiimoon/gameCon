package com.example.inkiimoon.gamecon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ImageButton pcButton = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton tvButton = (ImageButton) findViewById(R.id.Hello);

        Intent intent = getIntent();

        //รับค่าจาก activity ก่อนหน้า
        String Pin = intent.getStringExtra("Value");
        Log.i("info", Pin);

        //หา id ของ textview
        TextView ShowPin =(TextView) findViewById(R.id.showPin);
        // set ค่าของ pin ที่ได้มาจากหน้า Main
        ShowPin.setText(Pin);

        pcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomePage.this, joyPage.class);
                startActivity(intent1);
            }
        });

        tvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, joyPage.class);
                startActivity(intent);
            }
        });

    }

}

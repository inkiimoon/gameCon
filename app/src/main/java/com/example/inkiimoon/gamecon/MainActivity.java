package com.example.inkiimoon.gamecon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //เรียกใช้ element ต่างๆ บน UI ของ App
        Button okButton = (Button) findViewById(R.id.okButton);
        final EditText pinText = (EditText) findViewById(R.id.pinText);

        //กำหนดว่าปุ่มนี้กดเเล้วจะให้ทำอะไร
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //รับค่าจาก pinText มาเก็บในตัวเเปล
                String number = pinText.getText().toString();
                //เปลี่ยนหน้า ไปอีก activity
                Intent intent = new Intent(MainActivity.this, HomePage.class);
                //ส่งค่าไปยัง activity ที่กำหนด
                intent.putExtra("Value", number);
                //intent  ทำงาน
                startActivity(intent);

            }
        });
    }
}





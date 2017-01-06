package com.example.jeongjeahyeon.sopt03_homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.jeongjeahyeon.sopt03_homework.Ch01.Ch1Activity;
import com.example.jeongjeahyeon.sopt03_homework.Ch02.Ch2Activity;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.ch01);
        btn2 = (Button) findViewById(R.id.ch02);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Ch1Activity.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(MainActivity.this, Ch2Activity.class);
                startActivity(intent2);
            }
        });

    }

}

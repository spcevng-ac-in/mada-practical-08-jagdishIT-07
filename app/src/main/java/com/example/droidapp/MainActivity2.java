package com.example.droidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String s1=intent.getStringExtra(MainActivity.MSG1);
        TextView t=findViewById(R.id.t);
        t.setText(s1);
        TextView t1=findViewById(R.id.t1);
        String s2=intent.getStringExtra(MainActivity.MSG2);
        t1.setText(s2);
        TextView t2=findViewById(R.id.t2);
        String s3=intent.getStringExtra(MainActivity.MSG3);
        t2.setText(s3);
        TextView t3=findViewById(R.id.t3);
        String s4=intent.getStringExtra(MainActivity.MSG4);
        t3.setText(s4);
        TextView t4=findViewById(R.id.t4);
        String s5=intent.getStringExtra(MainActivity.MSG5);
        t4.setText(s5);
        TextView t5=findViewById(R.id.t5);
        String s6=intent.getStringExtra(MainActivity.MSG6);
        t5.setText(s6);

    }
}
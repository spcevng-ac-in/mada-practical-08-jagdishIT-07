package com.example.droidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText name,email,phone,note;
     RadioGroup radioGroup;
     RadioButton r;
     Spinner spinner;
     Button btn;
     String s1,s2,s3,s4,s5,s6;
     int ID;
     public static final String MSG1="msg1";
     public static final String MSG2="msg2";
     public static final String MSG3="msg3";
     public static final String MSG4="msg4";
     public static final String MSG5="msg5";
    public static final String MSG6="msg6";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        note=findViewById(R.id.note);
        radioGroup=findViewById(R.id.radioGroup);
        spinner=findViewById(R.id.spinner);
        btn=findViewById(R.id.btn);
        String[]arr=getResources().getStringArray(R.array.city);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                s6=spinner.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this,"Select Option",Toast.LENGTH_SHORT).show();

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                s1=name.getText().toString();
                intent.putExtra("msg1",s1);

                s2=email.getText().toString();
                intent.putExtra("msg2",s2);

                s3=phone.getText().toString();
                intent.putExtra("msg3",s3);

                s4=note.getText().toString();
                intent.putExtra("msg4",s4);

                ID=radioGroup.getCheckedRadioButtonId();
                r=findViewById(ID);
                s5=r.getText().toString();
                intent.putExtra("msg5",s5);
                

                intent.putExtra("msg6",s6);
                startActivity(intent);
            }
        });

    }
}
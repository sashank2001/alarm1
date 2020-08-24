package com.example.alarm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers =(TextView)findViewById(R.id.alarm);
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent numbersIntent= new Intent(MainActivity.this,alarm.class);
                startActivity(numbersIntent);
            }
        });
        TextView family =(TextView)findViewById(R.id.timer);
        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent familyIntent= new Intent(MainActivity.this,timer.class);
                startActivity(familyIntent);
            }
        });

        TextView colors =(TextView)findViewById(R.id.stopwatch);
        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent colorsIntent= new Intent(MainActivity.this,stopwatch.class);
                startActivity(colorsIntent   );
            }
        });
    }
}

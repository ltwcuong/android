package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ListView1 extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview1);

        TextView textView = findViewById(R.id.tv1);
        TextView textview7 = findViewById(R.id.tv2);
        TextView textview10 = findViewById(R.id.th11);
        Button button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(ListView1.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}

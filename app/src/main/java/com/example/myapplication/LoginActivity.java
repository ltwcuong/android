package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText txtdn,txtpass;
    private Button btndn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtdn=(EditText) findViewById(R.id.txt_dn);
        txtpass=(EditText) findViewById(R.id.txt_pass);
        btndn = (Button) findViewById(R.id.btn_login);
        btndn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(txtdn.getText().toString().equals("admin")&& txtpass.getText().toString().equals("admin")){
                    Toast.makeText(LoginActivity.this,"LOGIN  SUCCESS!!!",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this,"LOGIN FAILED!!!",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}

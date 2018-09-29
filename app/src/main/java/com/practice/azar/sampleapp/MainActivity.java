package com.practice.azar.sampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText user_name_edit ;
    private EditText password_edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_name_edit = findViewById(R.id.txtUsername);
        password_edit = findViewById(R.id.txtPassword);
        Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user_name_edit.getText().toString().equals("a") && password_edit.getText().toString().equals("a")){
                    Intent intent = new Intent(MainActivity.this,success.class);
                    startActivity(intent);

                }
                else{
                    Toast.makeText(MainActivity.this,"Invalid Username and password",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}

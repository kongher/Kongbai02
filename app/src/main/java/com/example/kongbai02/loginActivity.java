package com.example.kongbai02;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {
    TextView tvRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tvRegister = findViewById(R.id.tv_register);
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openRegisterScreen();
            }
        });
    }
    private void openRegisterScreen() {
        Intent intent = new Intent(loginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}
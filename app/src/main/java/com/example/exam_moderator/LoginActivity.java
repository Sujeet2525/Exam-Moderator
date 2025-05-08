package com.example.exam_moderator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Ensure your login layout file name is activity_login.xml

        Button signInButton = findViewById(R.id.btnSignIn); // Login Button
        Button signUpButton = findViewById(R.id.btnSignUp); // Create Profile Button

        signInButton.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, HomePageActivity.class);
            startActivity(intent);
            finish();
        });

        signUpButton.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, Create_ProfileActivity.class);
            startActivity(intent);
        });
    }
}

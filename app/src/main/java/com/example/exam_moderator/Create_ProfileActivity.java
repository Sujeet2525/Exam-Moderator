package com.example.exam_moderator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Create_ProfileActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);

        Button saveProfileButton = findViewById(R.id.btnCreateAccount);

        saveProfileButton.setOnClickListener(view -> {
            Intent intent = new Intent(Create_ProfileActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}

package com.example.firstapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignupActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        EditText nameInput = findViewById(R.id.nameInput);
        EditText emailInput = findViewById(R.id.emailInput);
        EditText passwordInput = findViewById(R.id.passwordInput);
        Button signUpButton = findViewById(R.id.signUpButton);
        TextView googleButton = findViewById(R.id.googleButton);
        TextView logInLink = findViewById(R.id.logInLink);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameInput.getText().toString();
                String email = emailInput.getText().toString();
                String password = passwordInput.getText().toString();
                Log.d("BloomSignup", "name=" + name + " email=" + email + " password=" + password);
                startActivity(new Intent(SignupActivity.this, HomeActivity.class));
            }
        });

        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("BloomSignup", "Google button clicked");
                startActivity(new Intent(SignupActivity.this, HomeActivity.class));
            }
        });

        logInLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

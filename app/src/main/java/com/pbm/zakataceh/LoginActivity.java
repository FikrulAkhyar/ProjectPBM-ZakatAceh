package com.pbm.zakataceh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pbm.zakataceh.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        if (message != null) {
            binding.message.setVisibility(View.VISIBLE);
        }

        binding.linkDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityChangeIntent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(activityChangeIntent);
            }
        });

        binding.btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = binding.username.getText().toString();
                Intent activityChangeIntent;

                if(username.equals("admin")) {
                    activityChangeIntent = new Intent(LoginActivity.this, AdminMainActivity.class);
                }
                else {
                    activityChangeIntent = new Intent(LoginActivity.this, UserMainActivity.class);
                }

                startActivity(activityChangeIntent);
            }
        });
    }
}
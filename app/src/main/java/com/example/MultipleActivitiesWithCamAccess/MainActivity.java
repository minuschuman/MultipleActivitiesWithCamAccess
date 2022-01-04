package com.example.MultipleActivitiesWithCamAccess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnContact, btnHome, btnOpCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContact = findViewById(R.id.btnContact);
        btnHome = findViewById(R.id.btnHome);
        btnOpCamera = findViewById(R.id.btnOpCamera);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iHome = new Intent(MainActivity.this, HomeAct.class);
                startActivity(iHome);
            }
        });
        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent iContact = new Intent(MainActivity.this, ContactAct.class);
                    startActivity(iContact);
            }
        });
        btnOpCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: open camera app
                Intent iCamera = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(iCamera);
            }
        });
    }
}
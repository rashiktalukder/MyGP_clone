package com.rashik.mygpv1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView signIn;
    TextView guest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Initialize();
    }

    private void Initialize() {
        signIn= findViewById(R.id.signInButton);
        guest=findViewById(R.id.textViewGuest);
        Action();
    }

    private void Action() {
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Toast.makeText(MainActivity.this, "Main Act", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,LoginWithPhoneNumber.class);
                startActivity(intent);
            }
        });
        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,GpLandingPage.class);
                startActivity(intent);
            }
        });

    }

}
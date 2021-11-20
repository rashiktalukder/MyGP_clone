package com.rashik.mygpv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class OtpVerifyUser extends AppCompatActivity {

    TextView mobileNumView,changeView,resendView;
    EditText otpNumberText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verify_user);

        Initialize();

    }

    private void Initialize() {

        mobileNumView=findViewById(R.id.numberView);
        changeView=findViewById(R.id.changeView);
        resendView=findViewById(R.id.resendCodeTextView);
        otpNumberText=findViewById(R.id.otpNumberEditText);
        Action();


    }

    private void Action() {

        mobileNumView.setText(String.format("+88 "+getIntent().getStringExtra("mobilenum")));
        changeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OtpVerifyUser.this,LoginWithPhoneNumber.class);
                intent.putExtra("numView",mobileNumView.getText().toString());
                startActivity(intent);
            }
        });
        resendView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                otpNumberText.setText("");
            }
        });
    }
}
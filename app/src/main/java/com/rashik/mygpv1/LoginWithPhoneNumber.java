package com.rashik.mygpv1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.icu.text.DateTimePatternGenerator;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Toast;

public class LoginWithPhoneNumber extends AppCompatActivity {

    EditText phoneNumber;
    Button signIn,verifyButton;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_with_phone_number);

        Initialize();
    }

    public void Initialize() {


        phoneNumber=findViewById(R.id.editTextPhoneNumber);

        signIn=findViewById(R.id.signInButton);
        back=findViewById(R.id.backImageView);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginWithPhoneNumber.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Authentic();


    }

    private void Authentic() {


        signIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String number = phoneNumber.getText().toString().trim();

                if (number.isEmpty() || number.length() != 11) {
                    phoneNumber.setError("empty field or number is > or < 11 chars");

                    return;
                }
//                Intent intent=new Intent(LoginWithPhoneNumber.this,PopUpSignIn.class);
//                startActivity(intent);
                PopUp();

            }

        });
    }

    private void PopUp() {

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View viewPopUpWindow = layoutInflater.inflate(R.layout.popup,null);
        PopupWindow popupWindow = new PopupWindow(viewPopUpWindow, (int) (width * 0.8), (int) (height * 0.5), true);
        popupWindow.showAtLocation(viewPopUpWindow, Gravity.BOTTOM, 0, 0);

        viewPopUpWindow.findViewById(R.id.verifyManuallyButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                viewPopUpWindow.findViewById(R.id.progressBar).setVisibility(View.GONE);
                Intent intent=new Intent(LoginWithPhoneNumber.this,OtpVerifyUser.class);
                intent.putExtra("mobilenum",phoneNumber.getText().toString());
                startActivity(intent);
                popupWindow.dismiss();
            }
        });

//        setContentView(R.layout.popup);
//        verifyButton=findViewById(R.id.verifyManuallyButton);
//        verifyButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(LoginWithPhoneNumber.this,OtpVerifyUser.class);
//               startActivity(intent);
//
//
//            }
//        });
    }
}
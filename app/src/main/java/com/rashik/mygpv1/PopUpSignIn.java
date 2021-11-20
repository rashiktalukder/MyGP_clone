package com.rashik.mygpv1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomappbar.BottomAppBar;

public class PopUpSignIn extends AppCompatActivity {

    private Button verifyManually;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup);
//        Toast.makeText(PopUpSignIn.this, "Dhukse", Toast.LENGTH_LONG).show();
//        Pop();


//        DisplayMetrics dm=new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(dm);
//
//
//        int width=dm.widthPixels;
//        int height=dm.heightPixels;
//        getWindow().setLayout((int) (width*0.6),(int) (height*0.5));
    }

//    private void Pop() {
//
//
//        DisplayMetrics dm=new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(dm);
//
//        int width=dm.widthPixels;
//        int height=dm.heightPixels;
//        LayoutInflater layoutInflater= (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
//        View viewPopUpWindow=layoutInflater.inflate(R.layout.popup,null);
//        PopupWindow popupWindow=new PopupWindow(viewPopUpWindow,(int)(width*0.8),(int)(height*0.5),true);
//        popupWindow.showAtLocation(viewPopUpWindow, Gravity.BOTTOM,0,0);
//
//        Initialize();
//
//    }
//
//    private void Initialize() {
//
//        verifyManually=findViewById(R.id.verifyManuallyButton);
//        verifyManually.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent(PopUpSignIn.this,OtpVerifyUser.class);
//                startActivity(intent);
//            }
//        });
//
//    }


}

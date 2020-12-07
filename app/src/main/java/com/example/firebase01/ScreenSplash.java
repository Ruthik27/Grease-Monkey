package com.example.firebase01;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class ScreenSplash extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    Animation sideAnim, bottomAnim;
    ImageView image;
    TextView app, detail;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        sideAnim = AnimationUtils.loadAnimation(this,R.anim.side_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        image =findViewById(R.id.imageView);
        app = findViewById(R.id.textView2);
        detail = findViewById(R.id.textView3);

        image.setAnimation(sideAnim);
        app.setAnimation(bottomAnim);
        detail.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(ScreenSplash.this, GoogleSignInActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);




    }
}
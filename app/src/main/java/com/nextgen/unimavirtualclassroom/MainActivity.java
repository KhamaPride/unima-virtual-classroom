package com.nextgen.unimavirtualclassroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;
    //animation variables
    Animation topAnim, bottomAnim;
    ImageView image;
    TextView welcomeMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //hooks
        image = findViewById(R.id.image_view);
        welcomeMessage = findViewById(R.id.welcome_message);

        image.setAnimation(topAnim);
        welcomeMessage.setAnimation(bottomAnim);

        //handler method
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,sign_in.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}
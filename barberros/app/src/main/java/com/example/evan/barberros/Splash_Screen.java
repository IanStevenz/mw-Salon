package com.example.evan.barberros;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {
    TextView title_text;
    TextView description;
    private static int splashInterval = 3000;//set waktu lama Splashscreen

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        this.title_text = (TextView)findViewById(R.id.title_text);
        this.description = (TextView)findViewById(R.id.description_text);
        this.title_text.setTypeface(Typeface.createFromAsset(getAssets(), "BreeSerif-Regular.ttf"));
        this.description.setTypeface(Typeface.createFromAsset(getAssets(), "Poppins-Medium.ttf"));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash_Screen.this,Login_Page.class);
                startActivity(i);//Menghubungkan activity splashscreen ke login page dengan intent
                //jeda selesai SplashScreen
                this.finish();
            }
            public void finish(){
                //TODO Auto-generated method sub
            }
        }, splashInterval);
    }
}


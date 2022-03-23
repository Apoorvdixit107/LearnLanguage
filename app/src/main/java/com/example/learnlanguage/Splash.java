
package com.example.learnlanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        Thread thread=new Thread(){
            public void run(){
                try {
                    sleep(4000);

                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally{
                    Intent intent = new Intent(Splash.this,Sign.class);
                    startActivity(intent);
                    finish();
                }
            }
        };thread.start();
    }
}
package com.osmananilozcan.splashscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /*Gözükecek süreyi tanımlayalım. 4000 milisaniye = 4 saniye*/
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Handler kullanacağız çünkü uygulama açılırken arka plan işlemleri yapacağız. Bu örnekte uygulama açılırken yeni bir activity oluşturup onu açacağız.*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
    /*Bundan sonra activity_main.xml'de tasarımımızı yapalım.*/
}

package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000); //istediğiniz değerleri yazabilirsiniz (3000 = 3 saniye)
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    //buraya 3 saniye bittikten sonra ne gerçekleşmesini istiyorsanız onu yazın
                    //örnek olarak diğer activity'e geçmesini söyledim
                    Intent intent = new Intent(MainActivity.this, ActivityBir.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timerThread.start();
    }
}
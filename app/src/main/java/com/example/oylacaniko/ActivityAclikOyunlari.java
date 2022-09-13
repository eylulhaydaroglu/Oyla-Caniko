package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ActivityAclikOyunlari extends AppCompatActivity {

    private RatingBar ratingBarAOKitap,ratingBarAOFilm;
    private Button buttonAOKitap,buttonAOFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aclik_oyunlari);
        ratingBarAOFilm=findViewById(R.id.ratingBarAOFilm);
        ratingBarAOKitap=findViewById(R.id.ratingBarAOKitap);
        buttonAOFilm=findViewById(R.id.buttonAFilm);
        buttonAOKitap=findViewById(R.id.buttonAOKitap);
        buttonAOKitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyK=ratingBarAOKitap.getRating();
                if(gelenOyK>=4)
                    Toast.makeText(ActivityAclikOyunlari.this, "Kız o kadar beğendin mi?", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityAclikOyunlari.this, "Aslında az daha iyiydi be heyecan falan", Toast.LENGTH_LONG).show();
            }
        });
        buttonAOFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyF=ratingBarAOFilm.getRating();
                if(gelenOyF>=3.5)
                    Toast.makeText(ActivityAclikOyunlari.this, "Bu puan domuzun ağzındaki elma için demi?", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityAclikOyunlari.this, "Yarışmacılar bu puana üzüldü aşko", Toast.LENGTH_LONG).show();
            }
        });


    }
}
package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ActivityYuzuklerinEfendisi extends AppCompatActivity {

    private RatingBar ratingBarYEKitap,ratingBarYEFilm;
    private Button buttonYEKitap,buttonYEFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yuzuklerin_efendisi);
        ratingBarYEFilm=findViewById(R.id.ratingBarYEFilm);
        ratingBarYEKitap=findViewById(R.id.ratingBarYEKitap);
        buttonYEFilm=findViewById(R.id.buttonYEFilm);
        buttonYEKitap=findViewById(R.id.buttonYEKitap);
        buttonYEKitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyK=ratingBarYEKitap.getRating();
                if(gelenOyK>=4)
                    Toast.makeText(ActivityYuzuklerinEfendisi.this, "Kıymetlimiss", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityYuzuklerinEfendisi.this, "Sauron fan club mı?", Toast.LENGTH_LONG).show();
            }
        });
        buttonYEFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyF=ratingBarYEFilm.getRating();
                if(gelenOyF>=3)
                    Toast.makeText(ActivityYuzuklerinEfendisi.this, "Beşinci günün şafağı yaklaşmıştır umarım", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityYuzuklerinEfendisi.this, "Galadriel için de mi vermedin be", Toast.LENGTH_LONG).show();
            }
        });


    }
}
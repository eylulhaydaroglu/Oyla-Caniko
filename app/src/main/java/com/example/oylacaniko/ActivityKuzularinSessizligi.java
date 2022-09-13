package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ActivityKuzularinSessizligi extends AppCompatActivity {
    private RatingBar ratingBarKSKitap,ratingBarKSFilm;
    private Button buttonKSKitap,buttonKSFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuzularin_sessizligi);
        ratingBarKSFilm=findViewById(R.id.ratingBarKSFilm);
        ratingBarKSKitap=findViewById(R.id.ratingBarKSKitap);
        buttonKSFilm=findViewById(R.id.buttonKSFilm);
        buttonKSKitap=findViewById(R.id.buttonKSKitap);
        buttonKSKitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyK=ratingBarKSKitap.getRating();
                if(gelenOyK>=3.5)
                    Toast.makeText(ActivityKuzularinSessizligi.this, "Tüylerim diken diken oldu vallahi", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityKuzularinSessizligi.this, "Korkmadın diye kırdıysan haklısın", Toast.LENGTH_LONG).show();
            }
        });
        buttonKSFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyF=ratingBarKSFilm.getRating();
                if(gelenOyF>3.5)
                    Toast.makeText(ActivityKuzularinSessizligi.this, "Hannibal'dan mı korktun ne bu bolluk??", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityKuzularinSessizligi.this, "Bu puandan sonra Hannibal seni yakalar.", Toast.LENGTH_LONG).show();
            }
        });


    }
}
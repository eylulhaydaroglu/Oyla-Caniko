package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ActivitySekerPortakali extends AppCompatActivity {

    private RatingBar ratingBarSPKitap,ratingBarSPFilm;
    private Button buttonSPKitap,buttonSPFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seker_portakali);
        ratingBarSPFilm=findViewById(R.id.ratingBarSPFilm);
        ratingBarSPKitap=findViewById(R.id.ratingBarSPKitap);
        buttonSPFilm=findViewById(R.id.buttonSPFilm);
        buttonSPKitap=findViewById(R.id.buttonSPKitap);
        buttonSPKitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyK=ratingBarSPKitap.getRating();
                if(gelenOyK>=4)
                    Toast.makeText(ActivitySekerPortakali.this, "Senin de portakal fidanına anlattığın hikayeler var mı caniko?", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivitySekerPortakali.this, "Katılmıyorum diyemem :/", Toast.LENGTH_LONG).show();
            }
        });
        buttonSPFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyF=ratingBarSPFilm.getRating();
                if(gelenOyF>=4)
                    Toast.makeText(ActivitySekerPortakali.this, "Güzeldi yaa", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivitySekerPortakali.this, "Olur bu puanlar ya", Toast.LENGTH_LONG).show();
            }
        });


    }
}
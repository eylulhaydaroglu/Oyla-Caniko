package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ActivityAlacakaranlik extends AppCompatActivity {

    private RatingBar ratingBarAKitap,ratingBarAFilm;
    private Button buttonAKitap,buttonAFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alacakaranlik);
        ratingBarAFilm=findViewById(R.id.ratingBarAFilm);
        ratingBarAKitap=findViewById(R.id.ratingBarAKitap);
        buttonAFilm=findViewById(R.id.buttonAFilm);
        buttonAKitap=findViewById(R.id.buttonAKitap);
        buttonAKitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyK=ratingBarAKitap.getRating();
                if(gelenOyK>=4)
                    Toast.makeText(ActivityAlacakaranlik.this, "Umarım küçükken okuduğun içindir hayatım.", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityAlacakaranlik.this, "Hak ettiği bu cidden:/", Toast.LENGTH_LONG).show();
            }
        });
        buttonAFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyF=ratingBarAFilm.getRating();
                if(gelenOyF>=3.5)
                    Toast.makeText(ActivityAlacakaranlik.this, "Edward fan club?", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityAlacakaranlik.this, "Güzel puan canımm", Toast.LENGTH_LONG).show();
            }
        });


    }
}
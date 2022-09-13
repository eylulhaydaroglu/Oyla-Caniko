package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ActivityBaba extends AppCompatActivity {

    private RatingBar ratingBarBKitap,ratingBarBFilm;
    private Button buttonBKitap,buttonBFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baba);
        ratingBarBFilm=findViewById(R.id.ratingBarBFilm);
        ratingBarBKitap=findViewById(R.id.ratingBarBKitap);
        buttonBFilm=findViewById(R.id.buttonBFilm);
        buttonBKitap=findViewById(R.id.buttonBKitap);
        buttonBKitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyK=ratingBarBKitap.getRating();
                if(gelenOyK>=4)
                    Toast.makeText(ActivityBaba.this, "Film iyiyse kitaptan bence de", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityBaba.this, "Aslında az daha iyiydi be", Toast.LENGTH_LONG).show();
            }
        });
        buttonBFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyF=ratingBarBFilm.getRating();
                if(gelenOyF>=4)
                    Toast.makeText(ActivityBaba.this, "Kimse harika abii demeden izlesen puanın yine bu mu olurdu?", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityBaba.this, "Sinematografi yüzünden filmi mi göremedin", Toast.LENGTH_LONG).show();
            }
        });


    }
}
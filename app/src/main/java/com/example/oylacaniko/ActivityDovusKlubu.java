package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ActivityDovusKlubu extends AppCompatActivity {

    private RatingBar ratingBarDKKitap,ratingBarDKFilm;
    private Button buttonDKKitap,buttonDKFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dovus_klubu);
        ratingBarDKFilm=findViewById(R.id.ratingBarDKFilm);
        ratingBarDKKitap=findViewById(R.id.ratingBarDKKitap);
        buttonDKFilm=findViewById(R.id.buttonDKFilm);
        buttonDKKitap=findViewById(R.id.buttonDKKitap);
        buttonDKKitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyK=ratingBarDKKitap.getRating();
                if(gelenOyK>=3.5)
                    Toast.makeText(ActivityDovusKlubu.this, "Sonunu anladıysan bana da anlatsana balım", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityDovusKlubu.this, "Neden olduğunu anlıyorum ama bir daha bak be aşko", Toast.LENGTH_LONG).show();
            }
        });
        buttonDKFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyF=ratingBarDKFilm.getRating();
                if(gelenOyF>=3.5)
                    Toast.makeText(ActivityDovusKlubu.this, "Bu puan Marla'nın sigarasına gelsin", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityDovusKlubu.this, "Brad abiye mi gıcıksın bebiş", Toast.LENGTH_LONG).show();
            }
        });


    }
}
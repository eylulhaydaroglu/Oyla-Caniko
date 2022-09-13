package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ActivityOluOzanlarDernegi extends AppCompatActivity {

    private RatingBar ratingBarOODKitap,ratingBarOODFilm;
    private Button buttonOODKitap,buttonOODFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olu_ozanlar_dernegi);
        ratingBarOODFilm=findViewById(R.id.ratingBarOODFilm);
        ratingBarOODKitap=findViewById(R.id.ratingBarOODKitap);
        buttonOODFilm=findViewById(R.id.buttonOODFilm);
        buttonOODKitap=findViewById(R.id.buttonOODKitap);
        buttonOODKitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyK=ratingBarOODKitap.getRating();
                if(gelenOyK>=3.5)
                    Toast.makeText(ActivityOluOzanlarDernegi.this, "Carpe diem!", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityOluOzanlarDernegi.this, "Önden bir şiir kitabı okusan severdin belki aşkoo", Toast.LENGTH_LONG).show();
            }
        });
        buttonOODFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyF=ratingBarOODFilm.getRating();
                if(gelenOyF>=3.5)
                    Toast.makeText(ActivityOluOzanlarDernegi.this, "John gibi hocamız oldu da okula mı gitmedik??", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityOluOzanlarDernegi.this, "İnanamadım puana", Toast.LENGTH_LONG).show();
            }
        });


    }
}
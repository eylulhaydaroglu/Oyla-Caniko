package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ActivityHobbit extends AppCompatActivity {
    private RatingBar ratingBarHKitap,ratingBarHFilm;
    private Button buttonHKitap,buttonHFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbit);
        ratingBarHFilm=findViewById(R.id.ratingBarHFilm);
        ratingBarHKitap=findViewById(R.id.ratingBarHKitap);
        buttonHFilm=findViewById(R.id.buttonHFilm);
        buttonHKitap=findViewById(R.id.buttonHKitap);
        buttonHKitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyK=ratingBarHKitap.getRating();
                if(gelenOyK>=4)
                    Toast.makeText(ActivityHobbit.this, "Keşke unutup tekrar okusak demi :/", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityHobbit.this, "E sen neye yüksek puan verirsin caniko", Toast.LENGTH_LONG).show();
            }
        });
        buttonHFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyF=ratingBarHFilm.getRating();
                if(gelenOyF>=4)
                    Toast.makeText(ActivityHobbit.this, "Keşke bunları da unutup tekrar izlesemm", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityHobbit.this, "Yüzüğün yok diye kıskandın mı aşkoo" , Toast.LENGTH_LONG).show();
            }
        });


    }
}
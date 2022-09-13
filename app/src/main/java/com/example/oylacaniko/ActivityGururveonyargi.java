package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ActivityGururveonyargi extends AppCompatActivity {

    private RatingBar ratingBarGOKitap,ratingBarGOFilm;
    private Button buttonGOKitap,buttonGOFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gururveonyargi);
        ratingBarGOFilm=findViewById(R.id.ratingBarGOFilm);
        ratingBarGOKitap=findViewById(R.id.ratingBarGOKitap);
        buttonGOFilm=findViewById(R.id.buttonGOFilm);
        buttonGOKitap=findViewById(R.id.buttonGOKitap);
        buttonGOKitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyK=ratingBarGOKitap.getRating();
                if(gelenOyK>=4)
                    Toast.makeText(ActivityGururveonyargi.this, "ilk okuduğumda heyecandan karnıma ağrı girmişti :')", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityGururveonyargi.this, "Alo!? Romantizm düşmanı ile mi görüşüyorum??", Toast.LENGTH_LONG).show();
            }
        });
        buttonGOFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyF=ratingBarGOFilm.getRating();
                if(gelenOyF>=3)
                    Toast.makeText(ActivityGururveonyargi.this, "Ah Darcy ve Lizzy üzümlü keklerim  ", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityGururveonyargi.this, "İnanamıyorum yapma", Toast.LENGTH_LONG).show();
            }
        });


    }
}
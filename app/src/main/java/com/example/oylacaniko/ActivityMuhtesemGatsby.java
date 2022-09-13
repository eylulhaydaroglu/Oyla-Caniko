package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ActivityMuhtesemGatsby extends AppCompatActivity {
    private RatingBar ratingBarMGKitap,ratingBarMGFilm;
    private Button buttonMGKitap,buttonMGFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muhtesem_gatsby);
        ratingBarMGFilm=findViewById(R.id.ratingBarMGFilm);
        ratingBarMGKitap=findViewById(R.id.ratingBarMGKitap);
        buttonMGFilm=findViewById(R.id.buttonMGFilm);
        buttonMGKitap=findViewById(R.id.buttonMGKitap);
        buttonMGKitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyK=ratingBarMGKitap.getRating();
                if(gelenOyK>=4)
                    Toast.makeText(ActivityMuhtesemGatsby.this, "Sende de bir muhteşemlik sezdim aşko", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityMuhtesemGatsby.this, "Ne alaka dediğim yerlerden dolayı katılıyorum", Toast.LENGTH_LONG).show();
            }
        });
        buttonMGFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyF=ratingBarMGFilm.getRating();
                if(gelenOyF>=3.5)
                    Toast.makeText(ActivityMuhtesemGatsby.this, "Daisy beni kanser ettin yavrucum ", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityMuhtesemGatsby.this, "Üzülmüşsündür yine de ya", Toast.LENGTH_LONG).show();
            }
        });


    }
}
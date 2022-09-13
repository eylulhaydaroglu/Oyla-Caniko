package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ActivityHarryPotter extends AppCompatActivity {

    private RatingBar ratingBarHPKitap,ratingBarHPFilm;
    private Button buttonHPKitap,buttonHPFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harry_potter);
        ratingBarHPFilm=findViewById(R.id.ratingBarHPFilm);
        ratingBarHPKitap=findViewById(R.id.ratingBarHPKitap);
        buttonHPFilm=findViewById(R.id.buttonHPFilm);
        buttonHPKitap=findViewById(R.id.buttonHPKitap);
        buttonHPKitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyK=ratingBarHPKitap.getRating();
                if(gelenOyK>=4)
                    Toast.makeText(ActivityHarryPotter.this, "Hala baykuşun ve mektubun gelmedi mi?", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityHarryPotter.this, "Büyü mü yaptılar sana", Toast.LENGTH_LONG).show();
            }
        });
        buttonHPFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyF=ratingBarHPFilm.getRating();
                if(gelenOyF>=4)
                    Toast.makeText(ActivityHarryPotter.this, "Senin de Dobby'in var mı :')", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityHarryPotter.this, "Buyrun Voldemort muydu?", Toast.LENGTH_LONG).show();
            }
        });


    }
}
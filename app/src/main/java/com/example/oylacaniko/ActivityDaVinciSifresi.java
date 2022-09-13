package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ActivityDaVinciSifresi extends AppCompatActivity {

    private RatingBar ratingBarDSKitap,ratingBarDSFilm;
    private Button buttonDSKitap,buttonDSFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_da_vinci_sifresi);
        ratingBarDSFilm=findViewById(R.id.ratingBarDSFilm);
        ratingBarDSKitap=findViewById(R.id.ratingBarDSKitap);
        buttonDSFilm=findViewById(R.id.buttonDSFilm);
        buttonDSKitap=findViewById(R.id.buttonDSKitap);
        buttonDSKitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyK=ratingBarDSKitap.getRating();
                if(gelenOyK>=4)
                    Toast.makeText(ActivityDaVinciSifresi.this, "Büyüyünce dedektif olmak ister misin caniko?", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityDaVinciSifresi.this, "Nesi vardı kız yükselt puanıı", Toast.LENGTH_LONG).show();
            }
        });
        buttonDSFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyF=ratingBarDSFilm.getRating();
                if(gelenOyF>=3.5)
                    Toast.makeText(ActivityDaVinciSifresi.this, "Harika şimdi Mona Lisa dışında bir eserini söyle Da Vinci'nin aşko", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityDaVinciSifresi.this, "Abartıyosunn", Toast.LENGTH_LONG).show();
            }
        });


    }
}
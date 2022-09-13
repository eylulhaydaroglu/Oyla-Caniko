package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ActivityAnneKarenina extends AppCompatActivity {

    private RatingBar ratingBarAKKitap,ratingBarAKFilm;
    private Button buttonAKKitap,buttonAKFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anne_karenina);
        ratingBarAKFilm=findViewById(R.id.ratingBarAKFilm);
        ratingBarAKKitap=findViewById(R.id.ratingBarAKKitap);
        buttonAKFilm=findViewById(R.id.buttonAKFilm);
        buttonAKKitap=findViewById(R.id.buttonAKKitap);
        buttonAKKitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyK=ratingBarAKKitap.getRating();
                if(gelenOyK>=4)
                    Toast.makeText(ActivityAnneKarenina.this, "Tolstoy diye mi doğru söyle", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityAnneKarenina.this, "Rus edebiyatı mı sevmiyorsun bebiş?", Toast.LENGTH_LONG).show();
            }
        });
        buttonAKFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenOyF=ratingBarAKFilm.getRating();
                if(gelenOyF>=4)
                    Toast.makeText(ActivityAnneKarenina.this, "Keira ablamız iyi yine demi?", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ActivityAnneKarenina.this, "İzlerken içim çıktı benim de", Toast.LENGTH_LONG).show();
            }
        });


    }
}
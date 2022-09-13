package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityIki extends AppCompatActivity {

    private Button buttonAclikOyunlari,buttonAlacakaranlik,buttonAnneKarenina,buttonBaba,buttonDaVinciSifresi,buttonDovusKlubu,buttonGururVeOnyargi;
    private Button buttonHarryPotter,buttonHobbit,buttonKuzularinSessizligi,buttonMuhtesemGatsby,buttonOluOzanlarDernegi,buttonSekerPortakali,buttonYuzuklerinEfendisi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iki);
        buttonAclikOyunlari=findViewById(R.id.buttonAclikOyunlari);
        buttonAclikOyunlari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityIki.this, ActivityAclikOyunlari.class);
                startActivity(intent);
            }
        });
        buttonAlacakaranlik=findViewById(R.id.buttonAlacakaranlik);
        buttonAlacakaranlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityIki.this, ActivityAlacakaranlik.class);
                startActivity(intent);
            }
        });
        buttonAnneKarenina=findViewById(R.id.buttonAnneKarenina);
        buttonAnneKarenina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityIki.this, ActivityAnneKarenina.class);
                startActivity(intent);
            }
        });
        buttonBaba=findViewById(R.id.buttonBaba);
        buttonBaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityIki.this, ActivityBaba.class);
                startActivity(intent);
            }
        });
        buttonDaVinciSifresi=findViewById(R.id.buttonDaVinciSifresi);
        buttonDaVinciSifresi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityIki.this, ActivityDaVinciSifresi.class);
                startActivity(intent);
            }
        });
        buttonDovusKlubu=findViewById(R.id.buttonDovusKlubu);
        buttonDovusKlubu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityIki.this, ActivityDovusKlubu.class);
                startActivity(intent);
            }
        });
        buttonGururVeOnyargi=findViewById(R.id.buttonGururVeOnyargi);
        buttonGururVeOnyargi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityIki.this, ActivityGururveonyargi.class);
                startActivity(intent);
            }
        });
        buttonHarryPotter=findViewById(R.id.buttonHarryPotter);
        buttonHarryPotter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityIki.this, ActivityHarryPotter.class);
                startActivity(intent);
            }
        });
        buttonHobbit=findViewById(R.id.buttonHobbit);
        buttonHobbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityIki.this, ActivityHobbit.class);
                startActivity(intent);
            }
        });
        buttonKuzularinSessizligi=findViewById(R.id.buttonKuzularinSessizligi);
        buttonKuzularinSessizligi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityIki.this, ActivityKuzularinSessizligi.class);
                startActivity(intent);
            }
        });
        buttonMuhtesemGatsby=findViewById(R.id.buttonMuhtesemGatsby);
        buttonMuhtesemGatsby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityIki.this, ActivityMuhtesemGatsby.class);
                startActivity(intent);
            }
        });
        buttonOluOzanlarDernegi=findViewById(R.id.buttonOluOzanlarDernegi);
        buttonOluOzanlarDernegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityIki.this, ActivityOluOzanlarDernegi.class);
                startActivity(intent);
            }
        });
        buttonSekerPortakali=findViewById(R.id.buttonSekerPortakali);
        buttonSekerPortakali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityIki.this, ActivitySekerPortakali.class);
                startActivity(intent);
            }
        });
        buttonYuzuklerinEfendisi=findViewById(R.id.buttonYuzuklerinEfendisi);
        buttonYuzuklerinEfendisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityIki.this, ActivityYuzuklerinEfendisi.class);
                startActivity(intent);
            }
        });

    }
}
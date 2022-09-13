package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;


public class ActivityGiris extends AppCompatActivity {

    private Button buttonGiris,buttonKayit;
    private EditText editTextGirisAd,editTextGirisSifre,editTextKayitNo,editTextKayitAd,editTextKayitSifre;
    private ArrayList<String> numara = new ArrayList<String>();
    private ArrayList<String> ad = new ArrayList<String>();
    private ArrayList<String> sifre = new ArrayList<String>();
    private int adNo=0;
    private int sifreNo=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);
        buttonGiris=findViewById(R.id.buttonGiris);
        buttonKayit=findViewById(R.id.buttonKayit);
        editTextGirisAd=findViewById(R.id.editTextGirEmail);
        editTextGirisSifre=findViewById(R.id.editTextGirSifre);
        editTextKayitNo=findViewById(R.id.editTextKayitNo);
        editTextKayitAd=findViewById(R.id.editTextKayitAd);
        editTextKayitSifre=findViewById(R.id.editTextKayitSifre);
        buttonKayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String kayitNo=editTextKayitNo.getText().toString();
                String kayitAd=editTextKayitAd.getText().toString();
                String kayitSifre=editTextKayitSifre.getText().toString();
                numara.add(kayitNo);
                ad.add(kayitAd);
                sifre.add(kayitSifre);

                Log.e("Mesaj","kayıt çalıştı");
                Snackbar.make(view,"Kayıt oldunn",Snackbar.LENGTH_LONG).show();

            }
        });
        buttonGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String girisAd=editTextGirisAd.getText().toString();
                String girisSifre=editTextGirisSifre.getText().toString();

                for(int i=0;i<numara.size();i++){
                    if (girisAd.equals(ad.get(i))){
                        Log.e("Mesaj","i çalıştı");
                        adNo++;
                        for(int j=0;j<numara.size();j++){
                            if (girisSifre.equals(sifre.get(i))){
                                Log.e("Mesaj","j çalıştı");
                                sifreNo++;
                            }else
                                continue;
                        }
                    }else
                        continue;
                }
                if(adNo!= 0 && sifreNo!=0){
                    Log.e("Mesaj","algıladı");
                    Snackbar.make(view,"Giriş yapılıyorr",Snackbar.LENGTH_LONG).show();
                    Intent intent = new Intent(ActivityGiris.this, ActivityIki.class);
                    startActivity(intent);
                }

            }
        });


    }
}
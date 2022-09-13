package com.example.oylacaniko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityBir extends AppCompatActivity {

    private Button buttonKayitOl,buttonGir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bir);
        buttonKayitOl=findViewById(R.id.buttonKayitOl);
        buttonGir=findViewById(R.id.buttonGir);
        buttonKayitOl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ActivityBir.this, ActivityKayit.class);
                startActivity(intent);

            }
        });
        buttonGir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ActivityBir.this, ActivityGir.class);
                startActivity(intent);

            }
        });
    }
}
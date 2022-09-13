package com.example.oylacaniko;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class ActivityKayit extends AppCompatActivity {

    private EditText editTextKayitEmail,editTextKayitSifre;
    private String txtEmail,txtSifre;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit);
        editTextKayitEmail=findViewById(R.id.editTextKayitEmail);
        editTextKayitSifre=findViewById(R.id.editTextKayitSifre);
        mAuth=FirebaseAuth.getInstance();

    }
    public void kayitOl(View v){

        txtEmail=editTextKayitEmail.getText().toString();
        txtSifre=editTextKayitSifre.getText().toString();
        if(!TextUtils.isEmpty(txtEmail)&& !TextUtils.isEmpty(txtSifre)){
             mAuth.createUserWithEmailAndPassword(txtEmail,txtSifre)
                     .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                         @Override
                         public void onComplete(@NonNull Task<AuthResult> task) {
                             if(task.isSuccessful()) {
                                 Log.e("Mesaj", "oldu");
                                 Toast.makeText(ActivityKayit.this, "Hoşgeldin aramızaa", Toast.LENGTH_SHORT).show();
                                 Intent intent = new Intent(ActivityKayit.this, ActivityIki.class);
                                 startActivity(intent);
                             }
                             else
                                 Toast.makeText(ActivityKayit.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                         }
                     });
        }else
            Toast.makeText(this, "Email ya da şifreyi boş bırakma be aşkom.", Toast.LENGTH_SHORT).show();
    }
}
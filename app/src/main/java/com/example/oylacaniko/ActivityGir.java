package com.example.oylacaniko;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ActivityGir extends AppCompatActivity {
    private EditText editTextGirEmail,editTextGirSifre;
    private String txtEmail,txtSifre;
    private FirebaseAuth mAuth;
    private FirebaseUser mUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gir);
        editTextGirEmail=findViewById(R.id.editTextGirEmail);
        editTextGirSifre=findViewById(R.id.editTextGirSifre);
        mAuth=FirebaseAuth.getInstance();
    }
    public void GirisYap(View view){

        txtEmail=editTextGirEmail.getText().toString();
        txtSifre=editTextGirSifre.getText().toString();
        if(!TextUtils.isEmpty(txtEmail)&& !TextUtils.isEmpty(txtSifre)){

            mAuth.signInWithEmailAndPassword(txtEmail,txtSifre)
                    .addOnSuccessListener(this, new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {

                            mUser=mAuth.getCurrentUser();
                            Toast.makeText(ActivityGir.this, "Hoşgeldin tekrarr", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ActivityGir.this, ActivityIki.class);
                            startActivity(intent);
                        }
                    }).addOnFailureListener(this, new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(ActivityGir.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
        }else
            Toast.makeText(this, "Email ya da şifreyi boş bırakma be aşkom.", Toast.LENGTH_SHORT).show();
    }
}
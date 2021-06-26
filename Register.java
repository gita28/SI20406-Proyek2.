package com.example.splashscrreen;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    EditText mEmail, mName, mPassword, mPhone;
    Button mregister;
    TextView mLoginHere;

    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        mEmail = findViewById(R.id.email);
        mLoginHere = findViewById(R.id.loginhere);
        mName = findViewById(R.id.name);
        mPassword = findViewById(R.id.password);
        mPhone = findViewById(R.id.phone);
        mregister = findViewById(R.id.register);

        fAuth = FirebaseAuth.getInstance();

        if (fAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(), Register.class));
            finish();
        }

        mregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)){
                    mEmail.setError("email tidak boleh kosong");
                    return;
                }

                if (TextUtils.isEmpty(password)){
                    mPassword.setError("Password tidak boleh kosong");
                    return;
                }

                if (password.length() < 8){
                    mPassword.setError("minimum password 8");
                    return;
                }

                fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {

                            Toast.makeText(Register.this, "User Created", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        }else {
                            Toast.makeText(Register.this, "Error !" + task.getException().getMessage(),Toast.LENGTH_LONG).show();

                        }

                    }
                });

            }
        });
        mLoginHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Login.class));
            }

        });

    }
}
package com.example.splashscrreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Westernf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_westernf);
    }

    public void taco(View view) {
        Intent intent = new Intent(Westernf.this, Taco.class);
        startActivity(intent);
    }

    public void Burger(View view) {
        Intent intent = new Intent(Westernf.this, Burger.class);
        startActivity(intent);
    }

    public void Pizza(View view) {
        Intent intent = new Intent(Westernf.this, Pizza.class);
        startActivity(intent);
    }

    public void ffries(View view) {
        Intent intent = new Intent(Westernf.this, FFries.class);
        startActivity(intent);
    }
}
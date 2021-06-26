package com.example.splashscrreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Drinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
    }

    public void Icetea(View view) {
        Intent intent = new Intent(Drinks.this, Icetea.class);
        startActivity(intent);
    }

    public void Lemonjus(View view) {
        Intent intent = new Intent(Drinks.this, LemonJus.class);
        startActivity(intent);
    }

    public void Cocacola (View view) {
        Intent intent = new Intent(Drinks.this, Cocacola.class);
        startActivity(intent);
    }
}
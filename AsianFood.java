package com.example.splashscrreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AsianFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asian_food);
    }

    public void Bulgogi (View view) {
        Intent intent = new Intent(AsianFood.this, Bulgogi.class);
        startActivity(intent);
    }

    public void Sushi (View view) {
        Intent intent = new Intent(AsianFood.this, Sushi.class);
        startActivity(intent);
    }

    public void Baechukim (View view) {
        Intent intent = new Intent(AsianFood.this, Baechukimchi.class);
        startActivity(intent);
    }

    public void teriyaki(View view) {
        Intent intent = new Intent(AsianFood.this, teriyaki.class);
        startActivity(intent);
    }
}
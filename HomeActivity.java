package com.example.splashscrreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_home);
    }
    public void indonesia(View view){
        Intent intent = new Intent(HomeActivity.this, IdFood.class);
        startActivity(intent);
    }

    public void westernf(View view){
        Intent intent = new Intent(HomeActivity.this, Westernf.class);
        startActivity(intent);
    }

    public void asianf(View view) {
        Intent intent = new Intent(HomeActivity.this, AsianFood.class);
        startActivity(intent);
    }

    public void Baechukim(View view) {
        Intent intent = new Intent(HomeActivity.this, Baechukimchi.class);
        startActivity(intent);
    }

    public void Sate(View view) {
        Intent intent = new Intent(HomeActivity.this, SateKambing.class);
        startActivity(intent);
    }

    public void Pizza(View view) {
        Intent intent = new Intent(HomeActivity.this, Pizza.class);
        startActivity(intent);
    }

    public void drinks(View view) {
        Intent intent = new Intent(HomeActivity.this, Drinks.class);
        startActivity(intent);
    }

    public void Healthy (View view) {
        Intent intent = new Intent(HomeActivity.this, Healthyf.class);
        startActivity(intent);
    }


    public void alamat(View view) {
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
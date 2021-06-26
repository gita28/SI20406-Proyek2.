package com.example.splashscrreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Healthyf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthyf);
    }

    public void Falafel(View view) {
        Intent intent = new Intent(Healthyf.this, Hfalafel.class);
        startActivity(intent);
    }

    public void Poke(View view) {
        Intent intent = new Intent(Healthyf.this, Pokebowl.class);
        startActivity(intent);
    }
}
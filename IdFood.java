package com.example.splashscrreen;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

public class IdFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id_food);
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_home);
    }
    public void sate(View view){
        Intent intent = new Intent(IdFood.this, SateKambing.class);
        startActivity(intent);
    }

    public void Rendang(View view) {
        Intent intent = new Intent(IdFood.this, Rendang.class);
        startActivity(intent);
    }

    public void Gadogado(View view) {
        Intent intent = new Intent(IdFood.this, Gadogado.class);
        startActivity(intent);
    }

}
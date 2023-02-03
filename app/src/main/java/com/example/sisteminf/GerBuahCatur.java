package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GerBuahCatur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ger_buah_catur);
    }

    public void raja(View view) {
        Intent intent = new Intent(GerBuahCatur.this,BuahRaja.class);
        startActivity(intent);
    }
    public void menteri(View view) {
        Intent intent = new Intent(GerBuahCatur.this,BuahMenteri.class);
        startActivity(intent);
    }
    public void benteng(View view) {
        Intent intent = new Intent(GerBuahCatur.this,BuahBenteng.class);
        startActivity(intent);
    }
    public void gajah(View view) {
        Intent intent = new Intent(GerBuahCatur.this,BuahGajah.class);
        startActivity(intent);
    }
    public void kuda(View view) {
        Intent intent = new Intent(GerBuahCatur.this,BuahKuda.class);
        startActivity(intent);
    }
    public void bidak(View view) {
        Intent intent = new Intent(GerBuahCatur.this,BuahBidak.class);
        startActivity(intent);
    }

    public void back(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}


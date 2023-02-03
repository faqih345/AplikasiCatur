package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
    }

    public void peng_catur(View view) {
        Intent intent = new Intent(MenuUtama.this,PengCatur.class);
        startActivity(intent);
    }

    public void per_catur(View view) {
        Intent intent = new Intent(MenuUtama.this,PerCatur.class);
        startActivity(intent);
    }

    public void ger_buah(View view) {
        Intent intent = new Intent(MenuUtama.this,GerBuahCatur.class);
        startActivity(intent);
    }

    public void ger_khu(View view) {
        Intent intent = new Intent(MenuUtama.this,GerKhuCatur.class);
        startActivity(intent);
    }
    public void akhir(View view) {
        Intent intent = new Intent(MenuUtama.this,AkhirCatur.class);
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

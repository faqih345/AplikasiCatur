package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GerKhuCatur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ger_khu_catur);
    }
    public void rokade(View view) {
        Intent intent = new Intent(GerKhuCatur.this,GerRokade.class);
        startActivity(intent);
    }
    public void enpassant(View view) {
        Intent intent = new Intent(GerKhuCatur.this,GerEnpassant.class);
        startActivity(intent);
    }
    public void promosi(View view) {
        Intent intent = new Intent(GerKhuCatur.this,GerPromosi.class);
        startActivity(intent);
    }
    public void sekak(View view) {
        Intent intent = new Intent(GerKhuCatur.this,GerSekak.class);
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

package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AkhirCatur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akhir_catur);
    }
    public void menang(View view) {
        Intent intent = new Intent(AkhirCatur.this,AkhirMenang.class);
        startActivity(intent);
    }
    public void remis(View view) {
        Intent intent = new Intent(AkhirCatur.this,AkhirRemis.class);
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

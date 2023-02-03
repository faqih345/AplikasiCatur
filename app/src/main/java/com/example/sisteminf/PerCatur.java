package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PerCatur extends AppCompatActivity {
    TextView per_catur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per_catur);

        per_catur = findViewById(R.id.per_catur);
        per_catur.setText("Permainan dilangsungkan di atas papan permainan berpetak dengan ukuran 8 baris " +
                "(disebut juga ranks, ditandai dengan angka 1-8, diurutkan dari terbawah menurut sisi buah putih) dan 8 kolom " +
                "(disebut juga files, ditandai dengan huruf a-h, diurutkan dari paling kiri menurut sisi buah putih) " +
                "berwarna hitam dan putih (atau terang dan gelap) yang berselang-seling. Khusus bagi buah menteri, menteri " +
                "putih diletakkan di petak putih (biasanya di petak D1) dan menteri hitam di petak hitam (biasanya di petak D8). " +
                "Raja diletakkan berdampingan dan berada di samping menteri (buah putih di e1 dan hitam di e8). ");
    }
    public void back(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}


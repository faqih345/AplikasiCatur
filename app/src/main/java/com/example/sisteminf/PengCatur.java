package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PengCatur extends AppCompatActivity {
    TextView peng_catur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peng_catur);

        peng_catur = findViewById(R.id.peng_catur);

        peng_catur.setText("Catur adalah permainan papan strategi yang dimainkan oleh dua orang, papan yang " +
                "digunakan memiliki motif kotak-kotak yang terdiri dari 64 kotak berwarna hitam dan putih yang disusun " +
                "dalam dalam 8x8 petak yang terbagi sama rata (masing-masing 32 kotak). ");
    }

    public void back(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}


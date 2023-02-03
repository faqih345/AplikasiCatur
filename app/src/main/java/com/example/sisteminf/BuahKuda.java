package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BuahKuda extends AppCompatActivity {
    TextView kuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah_kuda);

        kuda = findViewById(R.id.kuda);

        kuda.setText("Kuda memiliki gerakan mirip huruf L, yaitu memanjang dua petak dan melebar satu petak. " +
                "Kuda satu-satunya bidak yang dapat melompati bidak-bidak lain.");
    }
    public void back(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

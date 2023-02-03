package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BuahGajah extends AppCompatActivity {
    TextView gajah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah_gajah);

        gajah = findViewById(R.id.gajah);

        gajah.setText("Gajah dapat bergerak sepanjang petak secara diagonal, tetapi tidak dapat melompati bidak lain.");
    }
    public void back(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

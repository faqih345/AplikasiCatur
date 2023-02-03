package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BuahMenteri extends AppCompatActivity {
    TextView menteri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah_menteri);

        menteri = findViewById(R.id.menteri);

        menteri.setText("Menteri dapat bergerak sepanjang petak horizontal, vertikan dan diagonal, " +
                "tetapi tidak dapat melompati bidak lain.");
    }
    public void back(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

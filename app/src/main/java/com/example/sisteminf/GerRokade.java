package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GerRokade extends AppCompatActivity {
    TextView rokade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ger_rokade);

        rokade = findViewById(R.id.rokade);

        rokade.setText("merupakan gerakan khusus dalam catur di mana raja bergerak dua petak secara horizontal " +
                "menuju benteng di baris pertamanya, kemudian meletakkan benteng pada petak di belakang jalur yang dilalui raja. " +
                "Kedua benteng dapat digunakan untuk melakukan gerakan ini.");

    }
    public void back(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

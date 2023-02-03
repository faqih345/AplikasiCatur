package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BuahBidak extends AppCompatActivity {
    TextView bidak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah_bidak);

        bidak = findViewById(R.id.bidak);

        bidak.setText("Bidak dapat bergerak maju (arah lawan) satu petak ke petak yang tidak ditempati. Pada gerakan awal, " +
                "bidak dapat bergerak maju dua petak. Bidak juga dapat menangkap bidak lawan secara diagonal, " +
                "apabila bidak lawan tersebut berada satu petak di diagonal depannya.");
    }
    public void back(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GerPromosi extends AppCompatActivity {
    TextView promosi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ger_promosi);

        promosi = findViewById(R.id.promosi);

        promosi.setText("Ketika pion telah maju hingga menempati baris paling akhir (di daerah lawan), " +
                "bersamaan dengan gerakan maju tersebut, pion tersebut dipromosikan dan harus ditukar dengan buah lain tertentu " +
                "(seperti menteri, benteng, gajah, dan kuda) berdasarkan keinginan pemain dengan warna yang sama.");
    }
    public void back(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

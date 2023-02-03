package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AkhirMenang extends AppCompatActivity {
    TextView menang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akhir_menang);

        menang = findViewById(R.id.menang);

        menang.setText("Untuk skenario ini, pihak yang menang biasanya mendapatkan nilai 1 dan yang kalah mendapat 0. " +
                "Permainan dapat berakhir dengan kemenangan oleh salah satu pemain dengan cara-cara berikut.\n" +
                "- Sekakmat: Pemain yang memiliki giliran sedang dalam keadaan sekak dan " +
                "tidak memiliki cara apa pun yang untuk meloloskan diri dari keadaan itu.\n" +
                "- Pengunduran diri: Salah satu pemain dapat mengundurkan diri dan mengakui kemenangan lawan.\n" +
                "- Menang tepat waktu: Dalam permainan menggunakan kontrol waktu, pemain memenangkan permainan tersebut jika pemain lawan kehabisan waktu.");
    }
    public void back(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

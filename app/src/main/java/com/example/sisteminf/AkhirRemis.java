package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AkhirRemis extends AppCompatActivity {
    TextView remis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akhir_remis);

        remis = findViewById(R.id.remis);

        remis.setText("Dalam catur, permainan tidak selalu berakhir dengan kemenangan dan kekalahan, " +
                "karena bisa saja terjadi peristiwa seri atau remis (draw). Dalam keadaan remis, " +
                "kedua pihak yang berada dalam posisi remis mendapat skor 0,5. " +
                "Permainan bisa berakhir dalam keadaan remis dengan beberapa cara:\n" +
                "- Remis dengan kesepakatan: Remis paling sering dicapai dengan kesepakatan bersama antarpemain.\n" +
                "- Stalemate: Pemain yang mendapat giliran bergerak tidak bisa menggerakkan rajanya tanpa membuatnya langsung tersekak.\n" +
                "- Pengulangan tiga kali: Buah catur tertentu melakukan gerakan ke posisi yang sama sebanyak tiga kali.");
    }
    public void back(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

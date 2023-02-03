package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GerSekak extends AppCompatActivity {
    TextView sekak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ger_sekak);

        sekak = findViewById(R.id.sekak);

        sekak.setText("Ketika raja sedang diserang oleh satu atau lebih bidak lawan, keadaan ini disebut dengan sekak.");
    }
    public void back(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

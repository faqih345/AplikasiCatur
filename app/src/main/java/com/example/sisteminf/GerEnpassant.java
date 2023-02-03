package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GerEnpassant extends AppCompatActivity {
    TextView enpassant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ger_enpassant);

        enpassant = findViewById(R.id.enpassant);

        enpassant.setText("Ketika pion bergerak dua petak maju dan ada pion lawan yang berada satu petak persis di samping pion " +
                "tersebut, maka pion lawan dapat memakan dan menempati petak yang baru saja dilalui pion tersebut, " +
                "seolah-olah pion yang dimakan hanya bergerak satu petak. Gerakan ini disebut en passant. " +
                "Namun, gerakan ini hanya dapat dilakukan sesaat setelah melakukan langkah pertama pion untuk maju dua petak.");
    }
    public void back(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

package com.example.sisteminf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BuahBenteng extends AppCompatActivity {
    TextView benteng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah_benteng);

        benteng = findViewById(R.id.benteng);

        benteng.setText("Benteng dapat bergerak sepanjang petak horizontal maupun vertikal, " +
                "tetapi tidak dapat melompati bidak lain. ");
    }
    public void back(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

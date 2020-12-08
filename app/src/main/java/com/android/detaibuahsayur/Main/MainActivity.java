package com.android.detaibuahsayur.Main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.android.detaibuahsayur.R;

public class MainActivity extends AppCompatActivity {
    Button buttonMulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMulai = findViewById(R.id.bStart);

        buttonMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mulai = new Intent(getApplicationContext(), HalamanUtama.class);
                startActivity(mulai);
            }
        });


    }
}
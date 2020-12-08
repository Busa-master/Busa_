package com.android.detaibuahsayur.Main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.android.detaibuahsayur.R;
import com.android.detaibuahsayur.detail_buah.item.halamanbuah.MainActivityHargaBuah;
import com.android.detaibuahsayur.detail_buah.item.halamanbuah.halamanbuah;
import com.android.detaibuahsayur.detail_sayur.item.halamansayur.MainActivityHargaSayur;
import com.android.detaibuahsayur.detail_sayur.item.halamansayur.halamansayur;

public class HalamanUtama extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halamanutama);

        Button pindah = findViewById(R.id.btn_satu1);
        pindah.setOnClickListener(this);

        Button pindah2 = findViewById(R.id.btn_satu2);
        pindah2.setOnClickListener(this);

        Button pindah3 = findViewById(R.id.btn_satu3);
        pindah3.setOnClickListener(this);

        Button pindah4 = findViewById(R.id.btn_satu4);
        pindah4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_satu1:
                Intent pindah = new Intent(HalamanUtama.this, halamansayur.class);
                startActivity(pindah);
                break;
            case R.id.btn_satu2:
                Intent pindah2 = new Intent(HalamanUtama.this, halamanbuah.class);
                startActivity(pindah2);
                break;
            case R.id.btn_satu3:
                Intent pindah3 = new Intent(HalamanUtama.this, MainActivityHargaSayur.class);
                startActivity(pindah3);
            case R.id.btn_satu4:
                Intent pindah4 = new Intent(HalamanUtama.this, MainActivityHargaBuah.class);
                startActivity(pindah4);
                break;
        }
    }
}

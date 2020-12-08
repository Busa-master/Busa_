package com.android.detaibuahsayur.detail_buah.item.halamanbuah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.android.detaibuahsayur.R;
import com.android.detaibuahsayur.detail_buah.item.alpukat;
import com.android.detaibuahsayur.detail_buah.item.apel;
import com.android.detaibuahsayur.detail_buah.item.jeruk;
import com.android.detaibuahsayur.detail_buah.item.manggis;
import com.android.detaibuahsayur.detail_buah.item.naga;
import com.android.detaibuahsayur.detail_buah.item.nanas;
import com.android.detaibuahsayur.detail_buah.item.pepaya;
import com.android.detaibuahsayur.detail_buah.item.pisang;
import com.android.detaibuahsayur.detail_buah.item.semangka;
import com.android.detaibuahsayur.detail_buah.item.strawberry;

public class halamanbuah extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buah);

        Button pindah1 = findViewById(R.id.btnalpukat);
        pindah1.setOnClickListener(this);

        Button pindah2 = findViewById(R.id.btnapel);
        pindah2.setOnClickListener(this);

        Button pindah3 = findViewById(R.id.btnjeruk1);
        pindah3.setOnClickListener(this);

        Button pindah4 = findViewById(R.id.btnmanggis1);
        pindah4.setOnClickListener(this);

        Button pindah5 = findViewById(R.id.btnnaga1);
        pindah5.setOnClickListener(this);

        Button pindah6 = findViewById(R.id.btnnanas1);
        pindah6.setOnClickListener(this);

        Button pindah7 = findViewById(R.id.btnpepaya1);
        pindah7.setOnClickListener(this);

        Button pindah8 = findViewById(R.id.btnpisang1);
        pindah8.setOnClickListener(this);

        Button pindah9 = findViewById(R.id.btnsemangka1);
        pindah9.setOnClickListener(this);

        Button pindah10 = findViewById(R.id.btnstrawberry1);
        pindah10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnalpukat:
                Intent pindah1 = new Intent(halamanbuah.this, alpukat.class);
                startActivity(pindah1);
                break;

            case R.id.btnapel:
                Intent pindah2 = new Intent(halamanbuah.this, apel.class);
                startActivity(pindah2);
                break;

            case R.id.btnjeruk1:
                Intent pindah3 = new Intent(halamanbuah.this, jeruk.class);
                startActivity(pindah3);
                break;

            case R.id.btnmanggis1:
                Intent pindah4 = new Intent(halamanbuah.this, manggis.class);
                startActivity(pindah4);
                break;

            case R.id.btnnaga1:
                Intent pindah5 = new Intent(halamanbuah.this, naga.class);
                startActivity(pindah5);
                break;

            case R.id.btnnanas1:
                Intent pindah6 = new Intent(halamanbuah.this, nanas.class);
                startActivity(pindah6);
                break;

            case R.id.btnpepaya1:
                Intent pindah7 = new Intent(halamanbuah.this, pepaya.class);
                startActivity(pindah7);
                break;

            case R.id.btnpisang1:
                Intent pindah8 = new Intent(halamanbuah.this, pisang.class);
                startActivity(pindah8);
                break;

            case R.id.btnsemangka1:
                Intent pindah9 = new Intent(halamanbuah.this, semangka.class);
                startActivity(pindah9);
                break;

            case R.id.btnstrawberry1:
                Intent pindah10 = new Intent(halamanbuah.this, strawberry.class);
                startActivity(pindah10);
                break;
        }
    }
}

package com.android.detaibuahsayur.detail_sayur.item.halamansayur;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.android.detaibuahsayur.R;
import com.android.detaibuahsayur.detail_sayur.item.bayam;
import com.android.detaibuahsayur.detail_sayur.item.brokoli;
import com.android.detaibuahsayur.detail_sayur.item.jamurtiram;
import com.android.detaibuahsayur.detail_sayur.item.kangkung;
import com.android.detaibuahsayur.detail_sayur.item.mentimun;
import com.android.detaibuahsayur.detail_sayur.item.paprikamerah;
import com.android.detaibuahsayur.detail_sayur.item.seledri;
import com.android.detaibuahsayur.detail_sayur.item.terong;
import com.android.detaibuahsayur.detail_sayur.item.tomat;
import com.android.detaibuahsayur.detail_sayur.item.wortel;

public class halamansayur extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sayur);

        Button pindah1 = findViewById(R.id.btnbayam1);
        pindah1.setOnClickListener(this);

        Button pindah2 = findViewById(R.id.btnbrokoli1);
        pindah2.setOnClickListener(this);

        Button pindah3 = findViewById(R.id.btnjamur1);
        pindah3.setOnClickListener(this);

        Button pindah4 = findViewById(R.id.btnkangkung1);
        pindah4.setOnClickListener(this);

        Button pindah5 = findViewById(R.id.btnmentimun1);
        pindah5.setOnClickListener(this);

        Button pindah6 = findViewById(R.id.btnpaprika1);
        pindah6.setOnClickListener(this);

        Button pindah7 = findViewById(R.id.btnseledri1);
        pindah7.setOnClickListener(this);

        Button pindah8 = findViewById(R.id.btnterong1);
        pindah8.setOnClickListener(this);

        Button pindah9 = findViewById(R.id.btntomat1);
        pindah9.setOnClickListener(this);

        Button pindah10 = findViewById(R.id.btnwortel1);
        pindah10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnbayam1:
                Intent pindah = new Intent(halamansayur.this, bayam.class);
                startActivity(pindah);
                break;

            case R.id.btnbrokoli1:
                Intent pindah2 = new Intent(halamansayur.this, brokoli.class);
                startActivity(pindah2);
                break;

            case R.id.btnjamur1:
                Intent pindah3 = new Intent(halamansayur.this, jamurtiram.class);
                startActivity(pindah3);
                break;

            case R.id.btnkangkung1:
                Intent pindah4 = new Intent(halamansayur.this, kangkung.class);
                startActivity(pindah4);
                break;

            case R.id.btnmentimun1:
                Intent pindah5 = new Intent(halamansayur.this, mentimun.class);
                startActivity(pindah5);
                break;

            case R.id.btnpaprika1:
                Intent pindah6 = new Intent(halamansayur.this, paprikamerah.class);
                startActivity(pindah6);
                break;

            case R.id.btnseledri1:
                Intent pindah7 = new Intent(halamansayur.this, seledri.class);
                startActivity(pindah7);
                break;

            case R.id.btnterong1:
                Intent pindah8 = new Intent(halamansayur.this, terong.class);
                startActivity(pindah8);
                break;

            case R.id.btntomat1:
                Intent pindah9 = new Intent(halamansayur.this, tomat.class);
                startActivity(pindah9);
                break;

            case R.id.btnwortel1:
                Intent pindah10 = new Intent(halamansayur.this, wortel.class);
                startActivity(pindah10);
                break;
        }
    }
}

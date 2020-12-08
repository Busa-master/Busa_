package com.android.detaibuahsayur.detail_sayur.item.halamansayur;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.detaibuahsayur.BuahSayur;
import com.android.detaibuahsayur.DataBuahSayur.ListBuahAdapter;
import com.android.detaibuahsayur.DataBuahSayur.Sayurdata;
import com.android.detaibuahsayur.R;

import java.util.ArrayList;

public class MainActivityHargaSayur extends AppCompatActivity {

    private RecyclerView rvBusa;
    private ArrayList<BuahSayur> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain_harga);

        rvBusa = findViewById(R.id.rv_sayur);
        rvBusa.setHasFixedSize(true);

        list.addAll(Sayurdata.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvBusa.setLayoutManager(new GridLayoutManager(this, 2));
        ListBuahAdapter listbuahadapter = new ListBuahAdapter(list);
        rvBusa.setAdapter(listbuahadapter);

        listbuahadapter.setOnItemClickCallback(new ListBuahAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(BuahSayur data) {
                showSelectedBuah(data);
            }

            private void showSelectedBuah(BuahSayur data) {
            }


        });
    }
}

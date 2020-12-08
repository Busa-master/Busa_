package com.android.detaibuahsayur.Main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.detaibuahsayur.BuahSayur;
import com.android.detaibuahsayur.DataBuahSayur.Buahdata;
import com.android.detaibuahsayur.DataBuahSayur.ListBuahAdapter;
import com.android.detaibuahsayur.R;

import java.util.ArrayList;

public class MainActivityHargaBuah extends AppCompatActivity {
    private RecyclerView rvBusa;
    private ArrayList<BuahSayur> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBusa = rvBusa.findViewById(R.id.rv_hero);
        rvBusa.setHasFixedSize(true);

        list.addAll(Buahdata.getListData());
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

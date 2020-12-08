package com.android.detaibuahsayur.DataBuahSayur;

import com.android.detaibuahsayur.BuahSayur;
import com.android.detaibuahsayur.R;

import java.util.ArrayList;

public class Buahdata {
    private static String[] namebusa = {
            "Alpukat",
            "Apel",
            "Delima",
            "Durian",
            "Jambu biji",
            "Jeruk",
            "Kelengkeng",
            "Kiwi",
            "Lemon",
            "Manggis",
            "Melon",
            "Naga",
            "Nanas",
            "Pepaya",
            "Pisang",
            "Strawberry",

    };
    private static String[] hargabusa = {
            "Rp. 45.000/kg",
            "Rp. 25.000/kg",
            "Rp. 50.000/kg",
            "Rp. 60.000/kg",
            "Rp. 15.000/kg",
            "Rp. 15.000/kg",
            "Rp. 45.000/kg",
            "Rp. 45.000/kg",
            "Rp. 50.000/kg",
            "Rp. 35.000/kg",
            "Rp. 35.000/kg",
            "Rp. 20.000/kg",
            "Rp. 15.000/kg",
            "Rp. 17.000/kg",
            "Rp. 25.000/kg",
            "Rp. 15.000/kg",


    };

    private static int[] photobusa = {
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.delima,
            R.drawable.durian,
            R.drawable.jambu,
            R.drawable.jeruk,
            R.drawable.kalengkeng,
            R.drawable.kiwi,
            R.drawable.lemon,
            R.drawable.manggis,
            R.drawable.melon,
            R.drawable.naga,
            R.drawable.nanas,
            R.drawable.papaya,
            R.drawable.pisang,
            R.drawable.strawbery,
    };


    public static ArrayList<BuahSayur> getListData() {
        ArrayList<BuahSayur> list = new ArrayList<>();
        for (int position = 0; position < namebusa.length; position++) {
            BuahSayur buahsayur = new BuahSayur();
            buahsayur.setNamebusa(namebusa[position]);
            buahsayur.setHargabusa(hargabusa[position]);
            buahsayur.setPhotobusa(photobusa[position]);

            list.add(buahsayur);
        }
        return list;
    }

}

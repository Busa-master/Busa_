package com.android.detaibuahsayur.DataBuahSayur;

import com.android.detaibuahsayur.BuahSayur;
import com.android.detaibuahsayur.R;

import java.util.ArrayList;

public class Sayurdata {
    private static String[] namebusa = {
            "Bawang Bombay",
            "Brokoli",
            "Jagung",
            "Jamur",
            "Kacang polong",
            "kentang",
            "Kubis",
            "Labu",
            "Mentimun",
            "Paprika",
            "Selada",
            "Seledri",
            "Tomat",
            "Wortel",


    };
    private static String[] hargabusa = {
            "Rp. 19.000/kg",
            "Rp. 20.000/kg",
            "Rp. 17.000/kg",
            "Rp. 15.000/kg",
            "Rp. 30.000/kg",
            "Rp. 15.000/kg",
            "Rp. 3.000/kg",
            "Rp. 25.000/kg",
            "Rp. 4.000/kg",
            "Rp. 35.000/kg",
            "Rp. 25.000/kg",
            "Rp. 10.000/kg",
            "Rp. 13.000/kg",
            "Rp. 15.000/kg",


    };

    private static int[] photobusa = {
            R.drawable.s_bombai,
            R.drawable.s_brokoli,
            R.drawable.s_jagung,
            R.drawable.s_jamur,
            R.drawable.s_kacang,
            R.drawable.s_kentang,
            R.drawable.s_kubis,
            R.drawable.s_labu,
            R.drawable.s_mentimun,
            R.drawable.s_paprika,
            R.drawable.s_selada,
            R.drawable.s_seledri,
            R.drawable.s_tomat,
            R.drawable.s_wortel,
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

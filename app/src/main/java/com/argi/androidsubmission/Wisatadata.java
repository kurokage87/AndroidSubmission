package com.argi.androidsubmission;

import java.util.ArrayList;

public class Wisatadata {
    public static String[] wisataNama = {
            "Danau Maninjau",
            "Istana Pagaruyuang",
            "Jam Gadang",
            "Janjang Koto Gadang",
            "Kelok 44",
            "Puncak Lawang",
            "Pantai Air Manis",
            "Pantai Carocok",
            "Pulau Pamutusan",
            "Puncak Mandeh"
    };

    public static String[] wisataDetail = {
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum",
            "Lorem Ipsum"
    };

    public static int[] wisataFoto = {
            R.drawable.danau_maninjau,
            R.drawable.istana_pagarayung,
            R.drawable.jam_gadang,
            R.drawable.janjang_bukit_tinggi,
            R.drawable.kelok_44,
            R.drawable.lawang,
            R.drawable.pantai_air_manis,
            R.drawable.pantai_carocok,
            R.drawable.pulau_pamutusan,
            R.drawable.puncak_mandeh
    };

    static ArrayList<Wisata> getListData() {
      ArrayList<Wisata> list = new ArrayList<>();
      for (int a = 0; a < wisataNama.length; a++){
          Wisata wisata = new Wisata();
          wisata.setNama_wisata(wisataNama[a]);
          wisata.setDetail_wiasta(wisataDetail[a]);
          wisata.setFoto(wisataFoto[a]);
          list.add(wisata);
      }
      return list;
    };
}

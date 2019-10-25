package com.argi.androidsubmission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisata;
    private ArrayList<Wisata> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWisata = findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);

        list.addAll(Wisatadata.getListData());
        showRcyclerCardView();
    }

    private void showRcyclerCardView(){
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        CardViewTourismAdapter cardViewHeroAdapter = new CardViewTourismAdapter(list);
        rvWisata.setAdapter(cardViewHeroAdapter);
    }
}

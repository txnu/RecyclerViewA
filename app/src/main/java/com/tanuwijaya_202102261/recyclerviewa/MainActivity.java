package com.tanuwijaya_202102261.recyclerviewa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView _recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _recyclerView1 = findViewById(R.id.recyclerview1);

        List<NegaraModel> negaraModelList = new ArrayList<>();

        NegaraModel nm = new NegaraModel();
        nm.setNama("Albania");
        nm.setDeskripsi("Negara ini menggunakan bendera berwarna merah");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Albania-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Hungary");
        nm.setDeskripsi("Negara Ini bernama Hungaria dalam Bahasa Indonesia");
        nm.setUrl("https://icons.iconarchive.com/icons/hopstarter/flag-borderless/256/Hungary-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Slovenia");
        nm.setDeskripsi("Belum Ada Deskripsi Untuk Negara ini");
        nm.setUrl("https://icons.iconarchive.com/icons/hopstarter/flag-borderless/256/Slovenia-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Belgium");
        nm.setDeskripsi("Belgia dalam Bahasa Indonesia. Negara ini Terletak di Eropa");
        nm.setUrl("https://icons.iconarchive.com/icons/hopstarter/flag-borderless/256/Belgium-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Canada");
        nm.setDeskripsi("Negara ini terletak dibagian utara Amerika Serikat");
        nm.setUrl("https://icons.iconarchive.com/icons/hopstarter/flag-borderless/256/Canada-icon.png");
        negaraModelList.add(nm);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
        _recyclerView1.setLayoutManager(lm);

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraModelList);
        _recyclerView1.setAdapter(na);
    }
}
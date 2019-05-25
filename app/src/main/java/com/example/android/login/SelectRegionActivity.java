package com.example.android.login;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SelectRegionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_region);

        RecyclerView recyclerView = findViewById(R.id.region_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2, RecyclerView.VERTICAL, false));

        RegionListAdapter adapter = new RegionListAdapter(this);
        recyclerView.setAdapter(adapter);

    }
}

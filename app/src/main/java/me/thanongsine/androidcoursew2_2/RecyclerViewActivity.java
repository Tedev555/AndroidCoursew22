package me.thanongsine.androidcoursew2_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.vte_center);
        imageList.add(R.drawable.vte_center);
        imageList.add(R.drawable.vte_center);
        imageList.add(R.drawable.vte_center);
        imageList.add(R.drawable.vte_center);
        imageList.add(R.drawable.vte_center);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerAdapter adapter = new RecyclerAdapter(imageList);

        recyclerView.setLayoutManager(
                new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);
    }
}

package com.example.jack.RecyclerAdapter;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jack.listviewadapter.R;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    private RecyclerView listRecyclerView;
    private RecyclerAdapter recyclerAdapter;
    private LinearLayoutManager llm;
    private ArrayList<itemDetail> itemDetailList;
    private itemDetail itemDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listRecyclerView = (RecyclerView) findViewById(R.id.accident_report_rv);

        itemDetailList = new ArrayList<>();
        itemDetail = new itemDetail("1","cat","cat");
        itemDetailList.add(itemDetail);
        itemDetail = new itemDetail("2","dog","dog");
        itemDetailList.add(itemDetail);
        itemDetail = new itemDetail("3","cow","cow");
        itemDetailList.add(itemDetail);
        itemDetail = new itemDetail("4","fish","fish");
        itemDetailList.add(itemDetail);
        itemDetail = new itemDetail("5","ant","ant");
        itemDetailList.add(itemDetail);
        itemDetail = new itemDetail("6","lion","lion");
        itemDetailList.add(itemDetail);

        recyclerAdapter = new RecyclerAdapter(this, itemDetailList);
        listRecyclerView.setHasFixedSize(true);
        llm = new LinearLayoutManager(this);
        listRecyclerView.setLayoutManager(llm);
        listRecyclerView.setAdapter(recyclerAdapter);

    }
}

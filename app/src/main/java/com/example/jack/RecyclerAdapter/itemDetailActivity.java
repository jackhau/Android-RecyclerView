package com.example.jack.RecyclerAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.jack.listviewadapter.R;
import com.google.gson.Gson;

/**
 * Created by Jack on 13/11/2017.
 */

public class itemDetailActivity extends BaseActivity {
    private itemDetail itemDetailItem;
    TextView nameTextView, imageTextView, ageTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        Intent intent = getIntent();
        String reportIdString = intent.getStringExtra("itemListItem");
        if (reportIdString != null && reportIdString.length() > 0) {
            Gson gson = new Gson();
            itemDetailItem = gson.fromJson(reportIdString, itemDetail.class);
        }

        nameTextView = (TextView) findViewById(R.id.nameList1);
        imageTextView = (TextView) findViewById(R.id.imageList1);
        ageTextView = (TextView) findViewById(R.id.ageList1);

        if(itemDetailItem != null){
            nameTextView.setText(itemDetailItem.getName());
            imageTextView.setText(itemDetailItem.getImage());
            ageTextView.setText(itemDetailItem.getAge());
        }
    }
}

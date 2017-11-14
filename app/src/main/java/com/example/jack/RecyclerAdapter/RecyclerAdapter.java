package com.example.jack.RecyclerAdapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jack.listviewadapter.R;
import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Jack on 13/11/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private List<itemDetail> itemDetailList;
    private Context context;

    public RecyclerAdapter(Context context, List<itemDetail> itemDetailList) {
        this.itemDetailList = itemDetailList;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView nameTextView, imageTextView, ageTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.nameList);
            imageTextView = (TextView) itemView.findViewById(R.id.imageList);
            ageTextView = (TextView) itemView.findViewById(R.id.ageList);
        }
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_content, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        final itemDetail itemDetailListItem = itemDetailList.get(position);
        holder.ageTextView.setText(itemDetailListItem.getAge());
        holder.imageTextView.setText(itemDetailListItem.getImage());
        holder.nameTextView.setText(itemDetailListItem.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gson gson = new Gson();
                String myJson = gson.toJson(itemDetailListItem);
                Intent intent = new Intent(context, itemDetailActivity.class);
                intent.putExtra("itemListItem", myJson);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemDetailList.size();
    }
}

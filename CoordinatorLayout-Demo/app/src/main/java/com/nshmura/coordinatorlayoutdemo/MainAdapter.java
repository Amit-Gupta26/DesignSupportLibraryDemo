package com.nshmura.coordinatorlayoutdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shinichi Nishimura on 15/06/08.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    List<String> mItems = new ArrayList<>();

    public MainAdapter() {
        for (int i = 0; i < 100; i++) {
            mItems.add(String.valueOf(i));
        }
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder holder, int position) {
        holder.mTitle.setText(String.format("title: %s", mItems.get(position)));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mTitle;

        public ViewHolder(View view) {
            super(view);
            mTitle = (TextView) view.findViewById(R.id.title);
        }
    }
}

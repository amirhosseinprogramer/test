package com.ema.testforall.recycler_view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecycler extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int IMAGE = 1001;
    private static final int TITLE = 1002;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    static class ViewHolder_1 extends RecyclerView.ViewHolder{

        public ViewHolder_1(@NonNull View itemView) {
            super(itemView);
        }
    }

    static class ViewHolder_2 extends RecyclerView.ViewHolder{

        public ViewHolder_2(@NonNull View itemView) {
            super(itemView);
        }
    }
}

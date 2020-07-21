package com.example.tabs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    Context ct;
    int myImages[];
    String myNames[];
    public MyAdapter(FragmentActivity activity, int[] images, String[] names) {
        ct = activity;
        myImages = images;
        myNames = names;
    }

    @NonNull
    @Override
    public MyAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ct).inflate(R.layout.row,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyHolder holder, int position) {
        holder.iv.setImageResource(myImages[position]);
        holder.tv.setText(myNames[position]);

    }

    @Override
    public int getItemCount() {
        return myImages.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView tv;
        ImageView iv;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.name);
            iv = itemView.findViewById(R.id.image);
        }
    }
}

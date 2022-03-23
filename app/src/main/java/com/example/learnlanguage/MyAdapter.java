package com.example.learnlanguage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
ArrayList<DataModel> dataholder;
    public MyAdapter(ArrayList<DataModel> dataholder) {
        this.dataholder=dataholder;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row,parent,false);
return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
holder.img1.setImageResource(dataholder.get(position).getImage1());
        holder.img2.setImageResource(dataholder.get(position).getImage2());
        holder.textView.setText(dataholder.get(position).getText1());


    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img1,img2;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img1=itemView.findViewById(R.id.img1);
            img2=itemView.findViewById(R.id.img2);
            textView=itemView.findViewById(R.id.tv1);
        }
    }
}

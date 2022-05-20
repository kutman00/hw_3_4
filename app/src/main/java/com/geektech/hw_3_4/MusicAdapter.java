package com.geektech.hw_3_4;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {
    private ArrayList<Music> music;
    private OnItemClickListener clickListener;

    public MusicAdapter(ArrayList<Music> music, OnItemClickListener clickListener) {
        this.music = music;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MusicViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_name, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(music.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.OnItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return music.size();
    }

    static class MusicViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView name_second;
        private TextView number;
        private TextView number_second;

        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.text);
            name_second = itemView.findViewById(R.id.text_second);
            number = itemView.findViewById(R.id.number);
            number_second = itemView.findViewById(R.id.number_second);
        }

        public void bind(Music mobil) {
            name.setText(mobil.getName());
            name_second.setText(mobil.getName_second());
            number.setText(String.valueOf(mobil.getNumber()));
            number_second.setText(String.valueOf(mobil.getNumber_second()));

        }
    }
}

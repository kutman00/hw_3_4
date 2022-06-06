package com.geektech.hw_3_4;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements onItemClick {
    private RecyclerView recyclerView;
    private ArrayList<Music> music;
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.view);
        textView = view.findViewById(R.id.text_second);
        loadDate();
        MusicAdapter adapter = new MusicAdapter(music,this);
        recyclerView.setAdapter(adapter);
    }
    private void loadDate() {
        music = new ArrayList<>();
        music.add(new Music("Ulukmanapo", "Ла лига", 1, "3:45"));
        music.add(new Music("Ulukmanapo", "На трассе", 2, "4:23"));
        music.add(new Music("Ulukmanapo", "Не сегодня", 3, "2:43"));
        music.add(new Music("Ulukmanapo", "Азалия", 4, "5:12"));
        music.add(new Music("Ulukmanapo", "Ok Ok", 5, "1:31"));
        music.add(new Music("Ulukmanapo", "Расстояние", 6, "3:22"));
        music.add(new Music("Ulukmanapo", "Летали", 7, "5:41"));
        music.add(new Music("Ulukmanapo", "Наши голоса", 8, "2:32"));
        music.add(new Music("Ulukmanapo", "Бэнгер", 9, "1:12"));
        music.add(new Music("Ulukmanapo", "Так и понимай", 10, "3:55"));
    }
    @Override
    public void onClick(Music music) {
        Intent intent=new Intent(requireActivity(),SecondActivity.class);
        intent.putExtra("text",music.getName_second());
        startActivity(intent);
        Toast.makeText(getActivity(), "Click",
                Toast.LENGTH_LONG).show();
    }
}

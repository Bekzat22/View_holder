package com.example.view_holder;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Fragment2 extends Fragment {


    private int[] image;
    private String[] newsheading;
    private ArrayList<News> newsArrayList;
    private RecyclerView recycle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_2, container, false);
       return v;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recycle=view.findViewById(R.id.recycler);
        recycle.setLayoutManager( new LinearLayoutManager(getContext()));
        recycle.setHasFixedSize(true);
        initialize();
        Adapter adapter=new Adapter(newsArrayList,getContext());
        recycle.setAdapter(adapter);
    }

    private void initialize() {
        newsArrayList =new ArrayList<>();
        newsheading= new String []{
                getString(R.string.head1),
                getString(R.string.head2),
                getString(R.string.head3),
                getString(R.string.head4),
                getString(R.string.head5),
                getString(R.string.head6),
                getString(R.string.head7),
                getString(R.string.head8),
                getString(R.string.head9),
                getString(R.string.head10),
        };
        image = new int[]{
                R.drawable.hp,
                R.drawable.hp,
                R.drawable.hp,
                R.drawable.hp,
                R.drawable.hp,
                R.drawable.hp,
                R.drawable.hp,
                R.drawable.hp,
                R.drawable.hp,
                R.drawable.hp,

        };
        for (int i = 0; i < newsheading.length; i++) {
            News news = new News(newsheading[i],image[i]);
            newsArrayList.add(news);
        }
    }
}
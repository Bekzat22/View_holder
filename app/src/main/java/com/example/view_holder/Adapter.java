package com.example.view_holder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    ArrayList<News> newsArrayList;
    Context context;
    OnClicks onClicks;

    public Adapter(ArrayList<News> newsArrayList, Context context) {
        this.newsArrayList = newsArrayList;
        this.context = context;

    }
    public void setOnClicks(OnClicks onClicks){

        this.onClicks=onClicks;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        News news = newsArrayList.get(position);
        holder.textView.setText(news.title);
        holder.shapeableImageView.setImageResource(news.image);
        holder.onBind(news);
    }

    @Override
    public int getItemCount() {

        return newsArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView shapeableImageView;
        TextView textView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            shapeableImageView = itemView.findViewById(R.id.title_image);
            textView = itemView.findViewById(R.id.tvHeading);

        }

        public void onBind(News news) {
            textView.setText(news.title);
            shapeableImageView.setImageResource(news.image);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (onClicks != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            onClicks.OnItemClick(newsArrayList.get(position));
                        }
                    }
                }
            });
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION && onClicks != null) {
                        onClicks.onItemLongCklicklistener(position);
                    }
                    return true;
                }
            });




        }
    }
}

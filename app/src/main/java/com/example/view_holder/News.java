package com.example.view_holder;

public class News {
    String title;
    int image;

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public News(String title, int image) {
        this.title = title;
        this.image = image;
    }
}

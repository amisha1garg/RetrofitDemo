package com.ford.retrofitdemo;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int userId;

    private int id;

    @SerializedName("title")
    private String Title;

    @SerializedName("body")
    private String text;

    public Post(int userId, String title, String text) {
        this.userId = userId;
        Title = title;
        this.text = text;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return Title;
    }

    public String getText() {
        return text;
    }
}

package com.ford.retrofitdemo;

import com.google.gson.annotations.SerializedName;

public class Comment {

    private int postId;

    private String name;

    private int id;

    private String email;

    @SerializedName("body")
    private String text;

    public int getPostId() {
        return postId;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getText() {
        return text;
    }
}

package com.example.user.to_let;

public class Item {
    private int imageResId;
    private String name;

    public Item(int image, String name) {
        this.imageResId = image;
        this.name = name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

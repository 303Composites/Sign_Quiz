package com.example.signquiz;
//Class used for the list used in the MainActivity
public class SignItem {
    String name;
    int image;

    public SignItem (String name, int image) {
        this.image = image;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}

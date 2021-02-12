package com.example.android_1002;

public class Fruit {
    private String name; // название
    private String description;  // описание
    private int image; // фото

    public Fruit(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public int getImage() {
        return this.image;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}

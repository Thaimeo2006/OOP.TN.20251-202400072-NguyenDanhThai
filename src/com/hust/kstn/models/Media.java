package com.hust.kstn.models;

public class Media {
    private int id;
    private String title;
    private String category;
    private int length;
    private float cost;
    private static int nbMedia = 0;

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }
    public int getLength(){
        return length;
    }
    public float getCost(){
        return cost;
    }

    public Media(){
        this.id = nbMedia;
        nbMedia++;
    }
    public Media(String title, String category, int length, float cost){
        this.id = nbMedia;
        nbMedia++;
        this.title = title;
        this.category = category;
        this.length = length;
        this.cost = cost;
    }

    @Override
    public String toString(){
        return "[" + this.id + "]["
        + this.title + "]["
        + this.cost + "]["
        + this.category + "]["
        + this.length + "]";
    }
}

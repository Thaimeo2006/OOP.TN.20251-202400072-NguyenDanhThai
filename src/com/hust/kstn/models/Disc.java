package com.hust.kstn.models;

public class Disc extends Media {
    private String director;

    public Disc(){
        
    }
    public Disc(String title, String category, int length, float cost, String director){
        super(title, category, length, cost);
        this.director = director;
    }

    public String getDirector(){
        return director;
    }

    @Override
    public String toString(){
        return super.toString() + " [" + this.director + "]";
    }
}

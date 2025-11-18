package com.hust.kstn.models;

import java.util.List;
import java.util.ArrayList;

public class CompactDisc {
    private int id;
    private String title;
    private String category;
    private float length;
    private float cost;

    private static class Track{
        private String title;
        private float length;
        public String getTitle(){
            return title;
        }
        public float getLength(){
            return length;
        }

        @Override
        public String toString(){
            return this.title + this.length;
        }

        public Track(String title, float length){
            this.title = title;
            this.length = length;
        }
    }
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(int id, String title, String category, float length, float cost){
        this.id = id;
        this.title = title;
        this.category = category;
        this.length = length;
        this.cost = cost;
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }
    public float getLength(){
        return length;
    }
    public float getCost(){
        return cost;
    }
    public void getTrack(){
        for (Track track: tracks){
            System.out.println(track.getTitle() + track.getLength());
        }
    }
    public void setTrack(String title, float length){
        Track track = new Track(title, length);
        tracks.add(track);
    }
    

    @Override
    public String toString(){
        return "Disc[" + this.id + "]["
        + this.title + "]["
        + this.cost + "]["
        + this.category + "]["
        + this.length + "]"
        + "\nTracks: " + this.tracks;
    }
}

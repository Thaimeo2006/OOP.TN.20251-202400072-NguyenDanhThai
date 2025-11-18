package com.hust.kstn.models;

import java.util.List;
import java.util.ArrayList;

public class CompactDisc extends Media {

    private static class Track{
        private String title;
        private int length;
        public String getTitle(){
            return title;
        }
        public int getLength(){
            return length;
        }

        @Override
        public String toString(){
            return this.title + this.length;
        }

        public Track(String title, int length){
            this.title = title;
            this.length = length;
        }
    }
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(int id, String title, String category, int length, float cost){
        super(title, category, length, cost);
    }

    public void getTrack(){
        for (Track track: tracks){
            System.out.println(track.getTitle() + track.getLength());
        }
    }
    public void setTrack(String title, int length){
        Track track = new Track(title, length);
        tracks.add(track);
    }
    

    @Override
    public String toString(){
        return this.toString() + "\nTracks: " + this.tracks;
    }
}

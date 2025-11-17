package com.hust.kstn.models;

public class DigitalVideoDisc {

	private String title;
	private String director;
	private String category;
	private float length;
	private float cost;
	private int id;
	private static int nbDigitalVideoDisc = 0;

	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public String getDirector() {
		return director;
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString(){
		return "- DVD " + this.id + " - " + this.title + " - " + this.cost + " - " + this.length + " - " + this.category + " - " + this.director;
	}

	public DigitalVideoDisc(){
		this.id = nbDigitalVideoDisc;
		nbDigitalVideoDisc++;
	}
	
	public DigitalVideoDisc(String title) {
		this.title = title;
		this.id = nbDigitalVideoDisc;
		nbDigitalVideoDisc++;
	}
	
    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
		this.id = nbDigitalVideoDisc;
		nbDigitalVideoDisc++;
    }
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
		this.id = nbDigitalVideoDisc;
		nbDigitalVideoDisc++;
    }
    public DigitalVideoDisc(
    		String title,
    		String director,
    		String category,
    		float length,
    		float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
		this.id = nbDigitalVideoDisc;
		nbDigitalVideoDisc++;
    }

}

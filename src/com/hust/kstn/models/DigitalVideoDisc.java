package com.hust.kstn.models;

public class DigitalVideoDisc {

	private String title;
	private String director;
	private String category;
	private float length;
	private float cost;

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
	
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	
    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
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
    }

}

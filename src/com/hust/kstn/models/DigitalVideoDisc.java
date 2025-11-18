package com.hust.kstn.models;

public class DigitalVideoDisc extends Media {

	private String director;

	public String getDirector() {
		return director;
	}

	@Override
	public String toString(){
		return this.toString() + this.director;
	}

    public DigitalVideoDisc(
    		String title,
    		String director,
    		String category,
    		int length,
    		float cost) {
        super(title, category, length, cost);
        this.director = director;
    }

}

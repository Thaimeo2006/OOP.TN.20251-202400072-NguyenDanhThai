package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {
	public DigitalVideoDisc(){
		super();
	}
    public DigitalVideoDisc(
    		String title,
    		String category,
    		int length,
    		float cost,
			String director) {
        super(title, category, length, cost, director);
    }
}

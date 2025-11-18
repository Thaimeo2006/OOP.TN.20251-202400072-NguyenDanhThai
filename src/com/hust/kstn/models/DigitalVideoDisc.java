package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {
    public DigitalVideoDisc(
    		String title,
    		String director,
    		String category,
    		int length,
    		float cost) {
        super(title, category, length, cost, director);
    }
}

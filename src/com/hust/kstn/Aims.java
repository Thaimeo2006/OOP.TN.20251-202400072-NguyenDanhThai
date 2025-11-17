package com.hust.kstn;
import com.hust.kstn.models.*;

public class Aims {
	public static void main(String[] args) {
		Cart currentCart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Action", "Avengers: Endgame", 24.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Sci-Fi", "Interstellar", 19.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Spirited Away", 14.5f);

        //Add
        currentCart.addDVD(dvd1);
        currentCart.addDVD(dvd2);
        currentCart.addDVD(dvd3);

        currentCart.print();

        currentCart.removeDVD(dvd2);
        currentCart.print();

        //Print total price
        System.out.println("\nTotal value of cart: " + currentCart.calculateTotalCost() + "$");
	}

}

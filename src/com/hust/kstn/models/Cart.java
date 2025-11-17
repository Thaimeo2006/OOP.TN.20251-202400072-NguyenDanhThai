package com.hust.kstn.models;

public class Cart {
	private static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;

	public void addDVD(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBER_ORDERED) {
			itemsInCart[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("Disc added!");
			print();
		}
		else {
			System.out.println("Cart is full!");
		}
	}

	public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		if (qtyOrdered < MAX_NUMBER_ORDERED - 1) {
			addDVD(disc1);
			addDVD(disc2);
		}
		else {
			System.out.println("No enough slots!");
		}
	}
	public void addDVD(DigitalVideoDisc[] discs){
		int numDisc = discs.length;
		if (qtyOrdered + numDisc <= 20){
			for (DigitalVideoDisc disc: discs){
				addDVD(disc);
			}
		}
		else {
			System.out.println("No enough slots!");
		}
	}

	public void removeDVD(DigitalVideoDisc disc) {
		if (qtyOrdered != 0 ) {
			int findIndex;
			for (findIndex = 0; findIndex < qtyOrdered; findIndex++) {
				if (itemsInCart[findIndex].getId() == disc.getId()) {
					for (int moveIndex = findIndex; moveIndex < qtyOrdered-1; moveIndex++) {
						itemsInCart[moveIndex] = itemsInCart[moveIndex+1];
					}
					itemsInCart[qtyOrdered - 1] = null;
					qtyOrdered--;
					System.out.println("DVD removed!");
					print();
					break;
				}
			}
			if (findIndex == qtyOrdered) {
				System.out.println("No DVD found!");
			}
		}
		else {
			System.out.println("Cart is empty!");
		}
 	}
	
	public float calculateTotalCost() {
		float totalCost = 0;
		for (int index = 0; index < qtyOrdered; index++) {
			totalCost += itemsInCart[index].getCost();
		}
		return totalCost;
	}
	
	public void print() {
		System.out.println("==========THE CURRENT CART==========");
		System.out.println("Total items:" + qtyOrdered);
		for (int index = 0; index < qtyOrdered; index++){
			System.out.println(itemsInCart[index].toString());
		}
		System.out.println("Subtotal: " + calculateTotalCost() + "$");
		System.out.println("====================================");
	}
	
}

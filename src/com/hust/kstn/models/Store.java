package com.hust.kstn.models;

public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100];
    private int numStoreDiscs = 0;

    public void addDVD(DigitalVideoDisc disc){
        itemsInStore[numStoreDiscs] = disc;
		numStoreDiscs++;
        System.out.println("Disc added!");
        print();
    }
    public void removeDVD(DigitalVideoDisc disc){
        if (numStoreDiscs != 0){
            int findIndex = 0;
            for (findIndex = 0; findIndex < numStoreDiscs; findIndex++){
                if (itemsInStore[findIndex].getId() == disc.getId()){
                    for (int moveIndex = findIndex; moveIndex < numStoreDiscs - 1; moveIndex++){
                        itemsInStore[moveIndex] = itemsInStore[moveIndex+1];
                    }
                    itemsInStore[numStoreDiscs - 1] = null;
                    numStoreDiscs--;
                    System.out.println("Disc removed!");
                    print();
                    findIndex = -1;
                    break;
                }
            }
            if (findIndex == numStoreDiscs){
                System.out.println("No disc found!");
            }
        }
        else {
            System.out.println("Store is empty!");
        }
    }

    public void print() {
		System.out.println("==========THE CURRENT STORE==========");
		System.out.println("Total items:" + numStoreDiscs);
		for (int index = 0; index < numStoreDiscs; index++){
			System.out.println(itemsInStore[index].toString());
		}
		System.out.println("====================================");
	}
}

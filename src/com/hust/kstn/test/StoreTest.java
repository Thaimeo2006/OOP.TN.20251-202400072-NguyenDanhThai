package com.hust.kstn.test;

import com.hust.kstn.models.Store;
import com.hust.kstn.models.DigitalVideoDisc;


public class StoreTest { 
    public static void main(String[] args){
        Store currentStore = new Store();
        DigitalVideoDisc disc = new DigitalVideoDisc("a", "b", 12, 3.0f, "me");
        
        currentStore.removeDVD(disc);

        currentStore.addDVD(disc);

        DigitalVideoDisc difDisc = new DigitalVideoDisc("e", "f", 14, 2.2f, "not me");
        currentStore.removeDVD(difDisc);
    }
}

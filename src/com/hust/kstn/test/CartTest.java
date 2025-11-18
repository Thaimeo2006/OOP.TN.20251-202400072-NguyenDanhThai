package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Cart;

public class CartTest {
    
    private static final int MAX_NUM_DISCS = 20;
    public static void main(String[] args){
        Cart fullCart = new Cart();
        for (int index = 0; index < MAX_NUM_DISCS; index++){
            DigitalVideoDisc dvd = new DigitalVideoDisc("a", "b", 1, 2.0f, "c");
            fullCart.addDVD(dvd);
        }

        DigitalVideoDisc newDVD1 = new DigitalVideoDisc("d", "e", 2, 3.0f, "f");
        DigitalVideoDisc newDVD2 = new DigitalVideoDisc("g,", "h", 3, 4.0f, "i");
        DigitalVideoDisc[] newDVDList = {newDVD1, newDVD2};

        fullCart.addDVD(newDVD1);
        fullCart.addDVD(newDVD1, newDVD2);
        fullCart.addDVD(newDVDList);

        Cart emptyCart = new Cart();
        DigitalVideoDisc rmDVD = new DigitalVideoDisc("k", "l", 4, 5.0f, "m");
        emptyCart.removeDVD(rmDVD);

        fullCart.removeDVD(rmDVD);

        Cart goodCart = new Cart();
        goodCart.addDVD(newDVD1);
    }
    
}

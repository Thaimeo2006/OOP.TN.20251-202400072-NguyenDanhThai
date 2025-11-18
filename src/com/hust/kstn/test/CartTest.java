package com.hust.kstn.test;
import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Cart;

public class CartTest {
    private static final int MAX_NUM_DISCS = 20;
    public static void main(String[] args){
        Cart fullCart = new Cart();
        for (int index = 0; index < MAX_NUM_DISCS; index++){
            DigitalVideoDisc dvd = new DigitalVideoDisc();
            fullCart.addDVD(dvd);
        }

        DigitalVideoDisc newDVD1 = new DigitalVideoDisc();
        DigitalVideoDisc newDVD2 = new DigitalVideoDisc();
        DigitalVideoDisc[] newDVDList = {newDVD1, newDVD2};

        fullCart.addDVD(newDVD1);
        fullCart.addDVD(newDVD1, newDVD2);
        fullCart.addDVD(newDVDList);

        Cart emptyCart = new Cart();
        DigitalVideoDisc rmDVD = new DigitalVideoDisc();
        emptyCart.removeDVD(rmDVD);

        fullCart.removeDVD(rmDVD);

        Cart goodCart = new Cart();
        goodCart.addDVD(newDVD1);
    }
}

package com.hust.kstn.test;
import com.hust.kstn.models.Book;

public class BookTest {
    public static void main(String[] args) {
        Book myBook = new Book("Wimpy kid", "Hilarious", 100, 3.6f, "Jeff Kinney", 1971, "handsome");
        System.out.println(myBook);
    }
}

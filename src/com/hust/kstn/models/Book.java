package com.hust.kstn.models;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media {
    
    private static class BookAuthor{
        private String fullName;
        private int yearOfBirth;
        private String shortBiography;
        public String getFullName(){
            return fullName;
        }
        public int getYearOfBirth(){
            return yearOfBirth;
        }
        public String getShortBiography(){
            return shortBiography;
        }

        @Override
        public String toString(){
            return this.fullName + " (" + this.yearOfBirth + ", " + this.shortBiography +")";
        }
        public BookAuthor(String fullName, int yearOfBirth, String shortBiography){
            this.fullName = fullName;
            this.yearOfBirth = yearOfBirth;
            this.shortBiography = shortBiography;
        }
    }
    private List<BookAuthor> authors = new ArrayList<>();

    public Book(String title, String category, int length, float cost, String fullName, int yearOfBirth, String shortBiography){
        super(title, category, length, cost);
        setAuthors(fullName, yearOfBirth, shortBiography);
        
    }

    public void printBookAuthor(){
        for (BookAuthor author: authors){
            System.out.println(author.getFullName() + author.getYearOfBirth() + author.getShortBiography());
        }
    }
    public void setAuthors(String fullName, int yearOfBirth, String shortBiography){
        BookAuthor author = new BookAuthor(fullName, yearOfBirth, shortBiography);
        authors.add(author);
    }

    @Override
    public String toString(){
        return this.toString() + "\nAuthors: " + this.authors;
    }
}

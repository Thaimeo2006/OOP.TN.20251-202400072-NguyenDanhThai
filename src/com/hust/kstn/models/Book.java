package com.hust.kstn.models;

import java.util.List;
import java.util.ArrayList;

public class Book {
    private int id;
    private String title;
    private String category;
    private int length;
    private float cost;
    
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

    public Book(int id, String title, String category, int length, float cost, String fullName, int yearOfBirth, String shortBiography){
        this.id = id;
        this.title = title;
        this.category = category;
        this.length = length;
        this.cost = cost;
        setAuthors(fullName, yearOfBirth, shortBiography);
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }
    public int getLength(){
        return length;
    }
    public float getCost(){
        return cost;
    }
    public void getBookAuthor(){
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
        return "Book[" + this.id + "]["
        + this.title + "]["
        + this.cost + "]["
        + this.category + "]["
        + this.length + "]"
        + "\nAuthors: " + this.authors;
    }
}

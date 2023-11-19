package com.example.book;
public class Book {
    private String author;
    private String title;
    private Integer price;
    private Integer year;

    private Book id;


    public Book(String author, String title, Integer price, Integer year, Book id) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.year = year;

    }

    public Book(String book, String aldousHuxley, int price, int[] ints) {
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    public int getId() {
        int i = 0;
        return i;
    }
}

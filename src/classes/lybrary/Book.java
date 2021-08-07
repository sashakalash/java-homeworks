package book;

import author.Author;
import user.User;

public class Book {
    public Author author;
    public int pages;
    public int year;
    public String title;

    public Book(Author author, int pages, int year, String title) {
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.title = title;
    }
}
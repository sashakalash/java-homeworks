package user;

import book.Book;

public class User {
    public String email;
    public String name;
    public String surname;
    public StringBuilder favoriteBooks;
    private StringBuilder sb;

    public User(String name, String surname, String email) {
        this.favoriteBooks = new StringBuilder("");
        this.email = name;
        this.name = name;
        this.surname = surname;
    }

    public void addFavoriteBook(Book favoriteBook) {
        this.favoriteBooks
            .append("'")
            .append(favoriteBook.title)
            .append("'")
            .append(" ")
            .append(favoriteBook.year)
            .append(" года выпуска")
            .append(" автора ")
            .append(favoriteBook.author.name)
            .append(" ")
            .append(favoriteBook.author.surname)
            .append(", ");
    }

    public String toString() {
        return this.favoriteBooks.toString().length() != 0 ?
            "Пользователь " + this.name + " " + this.surname + " читает: " + this.favoriteBooks.toString() :
            "Пользователь " + this.name + " " + this.surname + " пока ничего не читает";
    }
}
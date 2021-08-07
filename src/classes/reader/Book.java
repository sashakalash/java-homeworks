package classes.reader;

public class Book {

    public static int bookmark = 0;

    int pages;
    String title;
    String author;

    public Book(String title, String author, int pages) {
        this.pages = pages;
        this.title = title;
        this.author = author;
    }

    public String compareBooks(Book book1, Book book2) {
        if (book1.pages > book2.pages) {
            return "Книга " + book1.title + " больше";
        } else if (book1.pages < book2.pages) {
            return "Книга '" + book2.title + "' больше";
        }
        return "Книги одинаковы по размеру";
    }

    public void setBookmark(int page) {
        Book.bookmark = page;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Вы читаете ")
            .append(this.title)
            .append(" автора ")
            .append(this.author)
            .append(". В книге ")
            .append(this.pages)
            .append(" страниц");
        return  sb.toString();
    }
}
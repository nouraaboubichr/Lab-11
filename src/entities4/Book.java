/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities4;

/**
 *
 * @author hp
 */

public class Book {

    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof Book)) {
            return false;
        }

        Book autre = (Book) o;
        return isbn.equals(autre.isbn);
    }

    public int hashCode() {
        return isbn.hashCode();
    }

    public String toString() {
        return title + " (ISBN:" + isbn + ") by " + author;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author hp
 */


public class Library {

    private List<Book> books;
    private Map<Book, Integer> stock;
    private Map<User, List<Book>> loans;

    public Library() {
        books = new ArrayList<Book>();
        stock = new HashMap<Book, Integer>();
        loans = new HashMap<User, List<Book>>();
    }

    public void addBook(Book b, int quantity) {

        if (!books.contains(b)) {
            books.add(b);
            stock.put(b, quantity);
        } else {
            int quantiteActuelle = stock.get(b);
            stock.put(b, quantiteActuelle + quantity);
        }
    }

    public boolean lendBook(User u, Book b) {

        Integer qty = stock.get(b);
        if (qty == null) {
            qty = 0;
        }

        if (qty <= 0) {
            return false;
        }

        stock.put(b, qty - 1);

        List<Book> userLoans = loans.get(u);
        if (userLoans == null) {
            userLoans = new ArrayList<Book>();
            loans.put(u, userLoans);
        }

        if (!userLoans.contains(b)) {
            userLoans.add(b);
            return true;
        }

        return false;
    }

    public boolean returnBook(User u, Book b) {

        List<Book> userLoans = loans.get(u);

        if (userLoans != null && userLoans.remove(b)) {

            Integer qty = stock.get(b);
            if (qty == null) {
                qty = 0;
            }

            stock.put(b, qty + 1);
            return true;
        }

        return false;
    }

    public List<Book> listAvailable() {

        List<Book> available = new ArrayList<Book>();

        for (int i = 0; i < books.size(); i++) {

            Book b = books.get(i);
            Integer qty = stock.get(b);

            if (qty != null && qty > 0) {
                available.add(b);
            }
        }

        return available;
    }

    public List<Book> listLoans(User u) {

        List<Book> userLoans = loans.get(u);

        if (userLoans == null) {
            return Collections.emptyList();
        }

        return userLoans;
    }
}

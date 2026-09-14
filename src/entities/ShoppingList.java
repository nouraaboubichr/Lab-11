/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */

public class ShoppingList {

    private List<String> items;

    public ShoppingList() {
        items = new ArrayList<String>();
    }

    public void add(String item) {
        items.add(item);
        System.out.println("'" + item + "' ajoute.");
    }

    public boolean remove(String item) {

        boolean ok = items.remove(item);

        if (ok) {
            System.out.println("'" + item + "' supprime.");
        } else {
            System.out.println("'" + item + "' introuvable.");
        }

        return ok;
    }

    public boolean contains(String item) {

        boolean present = items.contains(item);

        if (present) {
            System.out.println("'" + item + "' est dans la liste.");
        } else {
            System.out.println("'" + item + "' n'est pas dans la liste.");
        }

        return present;
    }

    public void display() {

        System.out.println();
        System.out.println("Votre liste de courses :");

        if (items.isEmpty()) {
            System.out.println("(vide)");
        } else {
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + ". " + items.get(i));
            }
        }
    }
}

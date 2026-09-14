/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.ShoppingList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class MainShopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShoppingList list = new ShoppingList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Gestion de la liste de courses");

        boolean continuer = true;

        while (continuer) {

            System.out.println();
            System.out.println("Commandes : add, remove, find, show, exit");
            System.out.print("Entrez une commande : ");

            String cmd = sc.nextLine().trim().toLowerCase();

            if (cmd.equals("add")) {
                System.out.print("Article a ajouter : ");
                list.add(sc.nextLine().trim());

            } else if (cmd.equals("remove")) {
                System.out.print("Article a supprimer : ");
                list.remove(sc.nextLine().trim());

            } else if (cmd.equals("find")) {
                System.out.print("Article a rechercher : ");
                list.contains(sc.nextLine().trim());

            } else if (cmd.equals("show")) {
                list.display();

            } else if (cmd.equals("exit")) {
                System.out.println("Au revoir !");
                continuer = false;

            } else {
                System.out.println("Commande inconnue.");
            }
        }

        sc.close();
    }
    
}

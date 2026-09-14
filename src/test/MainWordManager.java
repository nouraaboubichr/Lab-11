/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities2.WordManager;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class MainWordManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sample = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                + "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";

        WordManager manager = new WordManager(sample);
        manager.parseText();
        manager.displayAll();

        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {

            System.out.println();
            System.out.print("> Entrer un mot a rechercher (ou 'exit') : ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                continuer = false;

            } else {

                boolean found = manager.contains(input);
                System.out.println("Presence de '" + input + "' ? " + found);

                System.out.print("Souhaitez-vous supprimer ce mot ? (y/n) ");
                String confirm = scanner.nextLine().trim();

                if (confirm.equalsIgnoreCase("y")) {

                    boolean removed = manager.remove(input);

                    if (removed) {
                        System.out.println("Le mot '" + input + "' a ete supprime.");
                    } else {
                        System.out.println("Le mot '" + input + "' n'existait pas.");
                    }

                    manager.displayAll();
                }
            }
        }

        scanner.close();
        System.out.println("Fin du programme.");
    }
    
}

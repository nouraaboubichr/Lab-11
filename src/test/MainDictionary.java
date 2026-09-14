/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities3.DictionaryManager;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class MainDictionary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DictionaryManager dict = new DictionaryManager();

        dict.addEntry("apple", "pomme");
        dict.addEntry("banana", "banane");
        dict.addEntry("cherry", "cerise");
        dict.addEntry("date", "datte");
        dict.addEntry("apricot", "abricot");

        dict.displayAll();

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Mot a traduire : ");
        String word = sc.nextLine().trim();
        String tr = dict.getTranslation(word);
        System.out.println("Traduction de '" + word + "' : " + (tr != null ? tr : "[non trouve]"));

        System.out.println();
        System.out.print("Prefixe a chercher : ");
        String pref = sc.nextLine().trim();
        Map<String, String> results = dict.searchByPrefix(pref);
        System.out.println("Resultats pour \"" + pref + "\" :");
        for (String cle : results.keySet()) {
            System.out.println(cle + " -> " + results.get(cle));
        }

        System.out.println();
        System.out.print("Mot a supprimer : ");
        String rem = sc.nextLine().trim();
        boolean ok = dict.removeEntry(rem);
        if (ok) {
            System.out.println("'" + rem + "' supprime avec succes.");
        } else {
            System.out.println("'" + rem + "' introuvable.");
        }

        System.out.println();
        dict.displayAll();

        sc.close();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author hp
 */


public class WordManager {

    private String rawText;
    private Set<String> hashSet;
    private Set<String> linkedSet;
    private Set<String> treeSet;

    public WordManager(String text) {
        this.rawText = text;
        this.hashSet = new HashSet<String>();
        this.linkedSet = new LinkedHashSet<String>();
        this.treeSet = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
    }

    public void parseText() {

        String texteMinuscule = rawText.toLowerCase(Locale.ROOT);
        String[] tokens = texteMinuscule.split("[^a-zA-Z]+");

        for (int i = 0; i < tokens.length; i++) {

            String token = tokens[i];

            if (token.isEmpty()) {
                continue;
            }

            hashSet.add(token);
            linkedSet.add(token);
            treeSet.add(token);
        }
    }

    public void displayAll() {

        System.out.println("--- HashSet (ordre indefini) ---");
        System.out.println(hashSet);

        System.out.println();
        System.out.println("--- LinkedHashSet (ordre d'insertion) ---");
        System.out.println(linkedSet);

        System.out.println();
        System.out.println("--- TreeSet (ordre alphabetique, insensible a la casse) ---");
        System.out.println(treeSet);
    }

    public boolean contains(String word) {
        String w = word.toLowerCase(Locale.ROOT);
        return hashSet.contains(w);
    }

    public boolean remove(String word) {

        String w = word.toLowerCase(Locale.ROOT);

        boolean removed1 = hashSet.remove(w);
        boolean removed2 = linkedSet.remove(w);
        boolean removed3 = treeSet.remove(w);

        return removed1 || removed2 || removed3;
    }
}

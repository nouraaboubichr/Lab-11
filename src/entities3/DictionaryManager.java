/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author hp
 */

public class DictionaryManager {

    private Map<String, String> hashMap;
    private Map<String, String> linkedMap;
    private NavigableMap<String, String> treeMap;

    public DictionaryManager() {
        hashMap = new HashMap<String, String>();
        linkedMap = new LinkedHashMap<String, String>();
        treeMap = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
    }

    public void addEntry(String eng, String fr) {
        hashMap.put(eng, fr);
        linkedMap.put(eng, fr);
        treeMap.put(eng, fr);
    }

    public String getTranslation(String eng) {
        return hashMap.get(eng);
    }

    public boolean removeEntry(String eng) {

        boolean existed = hashMap.remove(eng) != null;
        linkedMap.remove(eng);
        treeMap.remove(eng);

        return existed;
    }

    public void displayAll() {

        System.out.println("=== HashMap (ordre indefini) ===");
        afficherMap(hashMap);

        System.out.println();
        System.out.println("=== LinkedHashMap (ordre d'insertion) ===");
        afficherMap(linkedMap);

        System.out.println();
        System.out.println("=== TreeMap (ordre alphabetique) ===");
        afficherMap(treeMap);
    }

    private void afficherMap(Map<String, String> map) {
        for (String cle : map.keySet()) {
            System.out.println(cle + " -> " + map.get(cle));
        }
    }

    public Map<String, String> searchByPrefix(String prefix) {

        String low = prefix.toLowerCase(Locale.ROOT);
        Map<String, String> resultats = new LinkedHashMap<String, String>();

        for (String cle : treeMap.keySet()) {
            if (cle.toLowerCase(Locale.ROOT).startsWith(low)) {
                resultats.put(cle, treeMap.get(cle));
            }
        }

        return resultats;
    }
}

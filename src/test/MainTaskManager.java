/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities1.Status;
import entities1.Task;
import entities1.TaskManager;
import java.util.List;

/**
 *
 * @author hp
 */
public class MainTaskManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TaskManager mgr = new TaskManager();

        mgr.addTask("Ecrire la doc", 2);
        mgr.addTask("Corriger les bugs", 1);
        mgr.addTask("Preparer demo", 3);
        mgr.addTask("Envoyer emails", 4);

        System.out.println("=== Toutes les taches ===");
        afficher(mgr.listTasks());
        System.out.println();

        System.out.println("=== Trier par priorite ===");
        mgr.sortByPriority();
        afficher(mgr.listTasks());
        System.out.println();

        System.out.println("=== Tache #2 en cours ===");
        mgr.updateStatus(2, Status.IN_PROGRESS);
        afficher(mgr.listTasks());
        System.out.println();

        System.out.println("=== Filtrer PENDING ===");
        List<Task> pending = mgr.filterByStatus(Status.PENDING);
        afficher(pending);
        System.out.println();

        System.out.println("=== Supprimer tache #1 ===");
        mgr.removeTask(1);
        afficher(mgr.listTasks());
    }

    private static void afficher(List<Task> liste) {
        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }
    }
    
}

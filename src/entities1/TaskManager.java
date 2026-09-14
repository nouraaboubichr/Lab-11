/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities1;

/**
 *
 * @author hp
 */

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<Task>();
    }

    public void addTask(String description, int priority) {
        tasks.add(new Task(description, priority));
    }

    public boolean removeTask(int id) {

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                return true;
            }
        }

        return false;
    }

    public boolean updateStatus(int id, Status newStatus) {

        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            if (t.getId() == id) {
                t.setStatus(newStatus);
                return true;
            }
        }

        return false;
    }

    public List<Task> listTasks() {
        return new ArrayList<Task>(tasks);
    }

    public List<Task> filterByStatus(Status status) {

        List<Task> result = new ArrayList<Task>();

        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            if (t.getStatus() == status) {
                result.add(t);
            }
        }

        return result;
    }

    public List<Task> filterByPriority(int priority) {

        List<Task> result = new ArrayList<Task>();

        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            if (t.getPriority() == priority) {
                result.add(t);
            }
        }

        return result;
    }

    public void sortByPriority() {

        
        for (int i = 0; i < tasks.size() - 1; i++) {
            for (int j = 0; j < tasks.size() - 1 - i; j++) {
                if (tasks.get(j).getPriority() > tasks.get(j + 1).getPriority()) {
                    Task tmp = tasks.get(j);
                    tasks.set(j, tasks.get(j + 1));
                    tasks.set(j + 1, tmp);
                }
            }
        }
    }
}
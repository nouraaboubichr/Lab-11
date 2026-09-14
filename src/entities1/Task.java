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

public class Task {

    private static int counter = 0;
    private int id;
    private String description;
    private int priority;
    private Status status;

    public Task(String description, int priority) {
        counter++;
        this.id = counter;
        this.description = description;
        this.priority = priority;
        this.status = Status.PENDING;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String toString() {
        return "[" + id + "] (prio=" + priority + ") " + status + " - " + description;
    }
}
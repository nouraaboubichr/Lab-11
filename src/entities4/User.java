/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities4;

/**
 *
 * @author hp
 */

public class User {

    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof User)) {
            return false;
        }

        User autre = (User) o;
        return id == autre.id;
    }

    public int hashCode() {
        return id;
    }

    public String toString() {
        return name + " [#" + id + "]";
    }
}

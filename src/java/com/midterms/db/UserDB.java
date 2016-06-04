/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.midterms.db;

import com.midterms.model.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author John Agustin
 */
public class UserDB {

    private static List<Person> personList = new ArrayList<>();
    private static List<Person> currentLoggedIn = new ArrayList<>();
    private static Person currentUser;
    
    static {
        createAccounts();
    }
    
    public static boolean login(String username, String password) {
        currentUser = new Person("", username, password, false);
        for (Person person : personList) {
            if (person.equals(currentUser) && person.isAdmin()) {
                currentUser = person;
                return true;
            }
        }
        return false;
    }

    public static List<Person> getCurrentLoggedIn() {
        return currentLoggedIn;
    }

    public static Person getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Person currentUser) {
        this.currentUser = currentUser;
    }

    public static boolean createAccounts() {
        try {
            personList.add(new Person("Jack", "jack", "apple", true));
            personList.add(new Person("Jill", "jill", "rose", false));
            personList.add(new Person("John", "john", "car", false));
            personList.add(new Person("Jim", "jim", "house", false));
            personList.add(new Person("Jane", "jane", "diamond", false));
            personList.add(new Person("Jordan", "jo", "ball", false));
            personList.add(new Person("Jasmin", "jas", "jazz", false));
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public static List<Person> getPersonList() {
        return personList;
    }

}

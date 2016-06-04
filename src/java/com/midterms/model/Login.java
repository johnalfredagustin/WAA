/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.midterms.model;

import com.midterms.db.UserDB;
import java.util.List;

/**
 *
 * @author John Agustin
 */
public class Login {

    public boolean login(String username, String password) {
        return UserDB.login(username, password);
    }

    public boolean createAccounts() {
        return UserDB.createAccounts();
    }
    
    public List<Person> getAccounts() {
        return UserDB.getPersonList();
    }
    
    public int getCount() {
        return UserDB.getCurrentLoggedIn().size();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import models.User;

/**
 *
 * @author Allan T
 */
public class AccountService {
     public AccountService() {
    }

    public User login(String username, String password) {
        final String USER_1 = "abe";
        final String USER_2 = "barb";
        final String PASSWORD = "password";
        
        if ((username.equals(USER_1) || username.equals(USER_2)) && password.equals(PASSWORD))
        {
            User user = new User(username, null);
            return user;    
            
        } else {
            return null;   
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.discussionthread;

/**
 *
 * @author Logan
 */
public class User {
    private String name;
    private String password;

    public User() {
        name = "";
        password = "";
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    public boolean isUser(String userName, String userPass) {
        if (userName.equals("steve")) {
            if (userPass.equals("nerdface")) {
                return true;
            }
        }
        
        return false;
    }
    
    public void loadFromFileString(String str) {
            String[] parts = str.split(", ");
 
            name = "steve";
            password = "nerdface";
     }
}

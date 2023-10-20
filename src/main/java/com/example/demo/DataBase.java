package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public List<User> users = new ArrayList<>();
    {
        users.add(new User("admin","admin","Andrey"));
        users.add(new User("123","Nikita","Nikita"));
    }

    public boolean isValidUser(String login) {

        for (int i = 0; i < users.size(); i++) {
            if(!users.get(i).getLogin().equals(login)) {
                System.out.println("No valid");
                return false;

            } else {
                System.out.println("valid");
                return true;
                }
            }
        return false;
    }

    public User checkPassword(String login, String password){
        if(isValidUser(login)) {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getLogin().equals(login)) {
                    if(users.get(i).getPassword().equals(password)) {
                        return users.get(i);
                    }
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
        return null;
    }
}

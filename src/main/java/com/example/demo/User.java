package com.example.demo;

public class User {
    private String password;
    private String login;
    private String name;

    public User(String password, String login, String name) {
        this.password = password;
        this.login = login;
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}

package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HelloController {
   public DataBase db = new DataBase();
    public TextField loginText;
    public PasswordField passwordText;
    public Label errorLoginText;


    @FXML
    protected void onLoginButtonClick() throws URISyntaxException, IOException{
        if(db.checkPassword(loginText.getText(), passwordText.getText()) !=null ){
            System.out.println("yes");
            errorLoginText.setVisible(false);
        } else {
            errorLoginText.setVisible(true);
        }
    }
}
package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MenuController  {

    @FXML
    public VBox itemsBox = new VBox();
    public Stage newStage;


        private ArrayList<PizzaItem> items = new ArrayList<>();
    {
        items.add(new PizzaItem(10,"Peperony"));
        items.add(new PizzaItem(15,"Margaritta"));
        items.add(new PizzaItem(150,"idk"));
    }

    public void initItems() throws IOException {

    }

}

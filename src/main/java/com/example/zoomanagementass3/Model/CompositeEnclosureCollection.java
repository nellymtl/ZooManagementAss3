package com.example.zoomanagementass3.Model;

import javafx.fxml.FXML;

import java.lang.classfile.Label;

public class CompositeEnclosureCollection implements  AnimalCollection {

    @FXML
    private Label label;

    public CompositeEnclosureCollection(String bigCats ) {
       // super();

    }

    public void addCollection(Enclosure tigerHabitat) {

        CompositeEnclosureCollection tigers =  new CompositeEnclosureCollection("Tigers");
    }
}



package com.example.zoomanagementass3;

import com.example.zoomanagementass3.Controllers.CompositeEnclosureViewCollectionControllers;
import com.example.zoomanagementass3.Model.CompositeEnclosureCollection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.example.zoomanagementass3.Helpers.*;
import java.io.IOException;

public class ZooApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ZooApplication.class.getResource("composite-animal-view.fxml"));
        CompositeEnclosureCollection myCollection = ImportHelper.createAnimals();
        myCollection.addCollection(myCollection);
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Zoo Management");
        stage.setScene(scene);
        stage.show();
    }
}

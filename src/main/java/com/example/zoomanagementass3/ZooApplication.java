package com.example.zoomanagementass3;

import com.example.zoomanagementass3.Controllers.CompositeEnclosureViewCollectionControllers;
import com.example.zoomanagementass3.Model.CompositeEnclosureCollection;
import com.example.zoomanagementass3.Model.EnclosureCollection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.example.zoomanagementass3.Helpers.*;
import java.io.IOException;
import java.util.List;

public class ZooApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ZooApplication.class.getResource("composite-animal-view.fxml"));
        Parent view = fxmlLoader.load();
        Scene scene = new Scene(view, 400, 400);
        stage.setTitle("Zoo Management");
        stage.setScene(scene);
        stage.show();
    }
}

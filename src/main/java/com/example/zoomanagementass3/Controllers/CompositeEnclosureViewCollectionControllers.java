package com.example.zoomanagementass3.Controllers;

import com.example.zoomanagementass3.Model.EnclosureCollection;
import com.example.zoomanagementass3.ZooApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompositeEnclosureViewCollectionControllers {


    public ListView EnclosureCollection;
    private List<EnclosureCollection> aCollection = new ArrayList<EnclosureCollection>();


    public void onBackButtonClick(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    public void onOpenButtonClick(ActionEvent pEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ZooApplication.class.getResource("enclosure-view.fxml"));
        Parent view = fxmlLoader.load();
        Scene nextScene = new Scene(view, 500, 500);
        Stage nextStage = new Stage();
        nextStage.setScene(nextScene);
        nextStage.setTitle("Cats");
        nextStage.initModality(Modality.WINDOW_MODAL);
        nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
        nextStage.showAndWait();
    }


    public void setaCollection(List<EnclosureCollection> aCollection) {
    }
}

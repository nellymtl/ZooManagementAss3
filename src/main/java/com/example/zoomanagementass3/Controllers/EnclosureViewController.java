package com.example.zoomanagementass3.Controllers;

import com.example.zoomanagementass3.ZooApplication;
import com.example.zoomanagementass3.Model.Animal;
import com.example.zoomanagementass3.Model.Enclosure;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Controller for the enclosure view handling display and user actions
 * related to animals within a single enclosure.
 *
 * @author Ian
 */
public class EnclosureViewController {
    @FXML
    private Label enclosureLabel;

    @FXML
    private ListView<Animal> animalListView;

    @FXML
    private Button enclosureAddButton;

    @FXML
    private Button enclosureDeleteButton;

    @FXML
    private Button enclosureBackButton;

    private Enclosure enclosure;

    /**
     * Injects the selected enclosure into this view. Call this right after loading
     * the FXML
     * and before showing the stage.
     */
    void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
        if (enclosureLabel != null && enclosure != null) {
            enclosureLabel.setText(enclosure.getName() + " Enclosure");
        }
        // When Enclosure exposes an ObservableList<Animal>, bind it here:
        // if (enclosure != null && animalListView != null) {
        // animalListView.setItems(enclosure.getAnimals());
        // }
    }

    @FXML
    protected void onEnclosureAddButtonClick(ActionEvent pEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ZooApplication.class.getResource("animal-view.fxml"));
        Parent view = fxmlLoader.load();
        Scene nextScene = new Scene(view, 500, 500);
        Stage nextStage = new Stage();
        nextStage.setScene(nextScene);
        nextStage.setTitle("Add Animal");
        nextStage.initModality(Modality.WINDOW_MODAL);
        nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
        nextStage.showAndWait();
    }

    @FXML
    protected void onEnclosureDeleteButtonClick(ActionEvent event) {

    }

    @FXML
    protected void onEnclosureBackButtonClick(ActionEvent event) {
        // Close the current window (modal) using any control on this scene
        Stage stage = (Stage) enclosureBackButton.getScene().getWindow();
        stage.close();
    }

}

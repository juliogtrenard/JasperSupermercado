package es.juliogtrenard.jaspersupermercado.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SupermercadoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
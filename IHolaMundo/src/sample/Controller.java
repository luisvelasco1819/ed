package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {

    @FXML private Label labelSaludo;
    @FXML private TextField textField;

    @FXML private void onButtonAction(ActionEvent actionEvent) {
        String nombre = textField.getText();
        labelSaludo.setText("Hola " + nombre);
    }
}

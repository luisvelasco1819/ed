package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

//        HBox hBox = new HBox();
//        Label label = new Label();
//        label.setText("Hola");
//        TextField textField = new TextField();
//        Button button = new Button();
//        button.setText("botón");
//        hBox.getChildren().addAll(label, textField, button);
//        hBox.setSpacing(10);
//
//        Label labelSaludo = new Label();
//        labelSaludo.setText("Saludo");
//        VBox vBox = new VBox();
//        vBox.getChildren().addAll(hBox, labelSaludo);
//        Parent root = vBox;

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

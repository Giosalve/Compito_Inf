package com.example.contenitorebrani;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Dvd.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Contenitore brani");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
        Controller.INSTANCE.Inizio();
    }

    public static void main(String[] args) {
        launch();
    }
}
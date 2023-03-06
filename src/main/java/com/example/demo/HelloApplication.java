package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ui.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 630, 600);
        stage.setTitle("Manager23");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();


    }
}
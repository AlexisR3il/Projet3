package com.example.projet3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    // Create a new GridPane and set the padding, horizontal gap and vertical gap
    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Loop through the rows and columns of the grid to create the buttons with images
        for (int i = 0; i < 4; i++) {
            for (int y = 0; y < 4; y++) {

                // Create a new button and set its size
                Button button = new Button();
                button.setPrefSize(90, 90);

                // Load the image for the button and create a new ImageView with the image
                String url = String.format("C:\\Projet3\\question.png");
                Image image = new Image(url);
                ImageView imageView = new ImageView(image);
                imageView.setFitWidth(90);
                imageView.setFitHeight(90);
                button.setGraphic(imageView);

                // Add the button to the GridPane at the current row and column
                gridPane.add(button, i, y);
            }
        }

        // Create a new Scene with the GridPane and set it to the stage
        Scene scene = new Scene(gridPane);
        stage.setTitle("Jeu de la memoire");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
package com.example.minesweeperproyectoi;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Timer extends Application {

    private Timeline timeline;
    private int count = 0;
    private Label label;

    @Override
    public void start(Stage primaryStage) {
        label = new Label("00:00");
        Button startButton = new Button("Start");
        Button pauseButton = new Button("Pause");

        startButton.setOnAction(event -> startTimer());
        pauseButton.setOnAction(event -> pauseTimer());

        HBox buttonBox = new HBox(startButton, pauseButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(10);

        VBox root = new VBox(label, buttonBox);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void startTimer() {
        if (timeline == null) {
            timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
                count++;
                int minutes = count / 60;
                int seconds = count % 60;
                String time = String.format("%02d:%02d", minutes, seconds);
                label.setText(time);
            }));
            timeline.setCycleCount(Animation.INDEFINITE);
        }
        timeline.play();
    }

    private void pauseTimer() {
        if (timeline != null) {
            timeline.pause();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

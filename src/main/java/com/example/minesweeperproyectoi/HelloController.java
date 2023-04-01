package com.example.minesweeperproyectoi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

//Hello
public class HelloController implements Initializable {
    @FXML
    public int difficulty = 0;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;


    public void switchToSceneGameDummy(ActionEvent event) throws IOException {
        difficulty = 1;
        System.out.println(difficulty);
        Parent root = FXMLLoader.load(getClass().getResource("Juego.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        LinkedList matrix = new LinkedList();
        int CantMinas = (int) (Math.random()+5);
        int cont = 0;
        for (int i = 0; i<8; i++){
            for (int y = 0; y<8; y++){
                matrix.insertFirst(Integer.toString(i)+","+Integer.toString(y), (int)Math.random()+2);
            }
        }
        matrix.displayinmatrix();
    }
    public void switchToSceneGameNormal(ActionEvent event) throws IOException {
        difficulty = 2;
        System.out.println(difficulty);
        Parent root = FXMLLoader.load(getClass().getResource("Juego.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        LinkedList matrix = new LinkedList();
        int CantMinas = (int) (Math.random()+5);
        int cont = 0;
        for (int i = 0; i<8; i++){
            for (int y = 0; y<8; y++){
                matrix.insertFirst(Integer.toString(i)+","+Integer.toString(y), (int)Math.random()+2);
            }
        }
        matrix.displayinmatrix();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

}
package com.example.minesweeperproyectoi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    public int difficulty = 0;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;
    @FXML
    private Button CeroCero;

    @FXML
    private Button CeroCinco;

    @FXML
    private Button CeroCuatro;

    @FXML
    private Button CeroDos;

    @FXML
    private Button CeroSeis;

    @FXML
    private Button CeroSiete;

    @FXML
    private Button CeroTres;

    @FXML
    private Button CeroUno;

    @FXML
    private Button DosCero;

    @FXML
    private Button DosCinco;

    @FXML
    private Button DosCuatro;

    @FXML
    private Button DosDos;

    @FXML
    private Button DosSeis;

    @FXML
    private Button DosSiete;

    @FXML
    private Button DosTres;

    @FXML
    private Button DosUno;

    @FXML
    private Button TresCero;

    @FXML
    private Button TresUno;

    @FXML
    private Button UnoCero;

    @FXML
    private Button UnoCinco;

    @FXML
    private Button UnoCuatro;

    @FXML
    private Button UnoDos;

    @FXML
    private Button UnoSeis;

    @FXML
    private Button UnoSiete;

    @FXML
    private Button UnoTres;

    @FXML
    private Button UnoUno;

    //Puedo hacer una clase botón y hacer varas con .whatever
    public void B00(){
        CeroCero.setStyle("-fx-background-color: #ff0000");
    }
    public void B01(){
        CeroUno.setStyle("-fx-background-color: #ff0000");
    }


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
        matrix.insertFirst(CeroCero, 0);
        }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

}
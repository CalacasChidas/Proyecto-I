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
    private Button SeisCinco;

    @FXML
    private Button SieteSeis;

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
    private Button CincoCero;

    @FXML
    private Button CincoCinco;

    @FXML
    private Button CincoCuatro;

    @FXML
    private Button CincoDos;

    @FXML
    private Button CincoSeis;

    @FXML
    private Button CincoSiete;

    @FXML
    private Button CincoTres;

    @FXML
    private Button CincoUno;

    @FXML
    private Button CuatroCero;

    @FXML
    private Button CuatroCinco;

    @FXML
    private Button CuatroCuatro;

    @FXML
    private Button CuatroDos;

    @FXML
    private Button CuatroSeis;

    @FXML
    private Button CuatroSiete;

    @FXML
    private Button CuatroTres;

    @FXML
    private Button CuatroUno;

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
    private Button SeisCero;

    @FXML
    private Button SeisCuatro;

    @FXML
    private Button SeisDos;

    @FXML
    private Button SeisSeis;

    @FXML
    private Button SeisSiete;

    @FXML
    private Button SeisTres;

    @FXML
    private Button SeisUno;

    @FXML
    private Button SieteCero;

    @FXML
    private Button SieteCinco;

    @FXML
    private Button SieteCuatro;

    @FXML
    private Button SieteDos;

    @FXML
    private Button SieteSeit;

    @FXML
    private Button SieteSiete;

    @FXML
    private Button SieteTres;

    @FXML
    private Button SieteUno;

    @FXML
    private Button TresCero;

    @FXML
    private Button TresCinco;

    @FXML
    private Button TresCuatro;

    @FXML
    private Button TresDos;

    @FXML
    private Button TresSeis;

    @FXML
    private Button TresSiete;

    @FXML
    private Button TresTres;

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
    /*
   * public void B00(){
        CeroCero.setStyle("-fx-background-color: #ff0000");
    }
    *public void B01(){
        CeroUno.setStyle("-fx-background-color: #ff0000");
    }
    */
    public void switchToSceneGameDummy(ActionEvent event) throws IOException {
        difficulty = 1;
        System.out.println(difficulty);
        Parent root = FXMLLoader.load(getClass().getResource("Juego.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        LinkedList buttons = new LinkedList();
        buttons.insertFirst(SieteSiete);
        buttons.insertFirst(SieteSeis);
        buttons.insertFirst(SieteCinco);
        buttons.insertFirst(SieteCuatro);
        buttons.insertFirst(SieteTres);
        buttons.insertFirst(SieteDos);
        buttons.insertFirst(SieteUno);
        buttons.insertFirst(SieteCero);
        buttons.insertFirst(SeisSiete);
        buttons.insertFirst(SeisSeis);
        buttons.insertFirst(SeisCinco);
        buttons.insertFirst(SeisCuatro);
        buttons.insertFirst(SeisTres);
        buttons.insertFirst(SeisDos);
        buttons.insertFirst(SeisUno);
        buttons.insertFirst(SeisCero);
        buttons.insertFirst(CincoSiete);
        buttons.insertFirst(CincoSeis);
        buttons.insertFirst(CincoCinco);
        buttons.insertFirst(CincoCuatro);
        buttons.insertFirst(CincoTres);
        buttons.insertFirst(CincoDos);
        buttons.insertFirst(CincoUno);
        buttons.insertFirst(CincoCero);
        buttons.insertFirst(CuatroSiete);
        buttons.insertFirst(CuatroSeis);
        buttons.insertFirst(CuatroCinco);
        buttons.insertFirst(CuatroCuatro);
        buttons.insertFirst(CuatroTres);
        buttons.insertFirst(CuatroDos);
        buttons.insertFirst(CuatroUno);
        buttons.insertFirst(CuatroCero);
        buttons.insertFirst(TresSiete);
        buttons.insertFirst(TresSeis);
        buttons.insertFirst(TresCinco);
        buttons.insertFirst(TresCuatro);
        buttons.insertFirst(TresTres);
        buttons.insertFirst(TresDos);
        buttons.insertFirst(TresUno);
        buttons.insertFirst(TresCero);
        buttons.insertFirst(DosSiete);
        buttons.insertFirst(DosSeis);
        buttons.insertFirst(DosCinco);
        buttons.insertFirst(DosCuatro);
        buttons.insertFirst(DosTres);
        buttons.insertFirst(DosDos);
        buttons.insertFirst(DosUno);
        buttons.insertFirst(DosCero);
        buttons.insertFirst(UnoSiete);
        buttons.insertFirst(UnoSeis);
        buttons.insertFirst(UnoCinco);
        buttons.insertFirst(UnoCuatro);
        buttons.insertFirst(UnoTres);
        buttons.insertFirst(UnoDos);
        buttons.insertFirst(UnoUno);
        buttons.insertFirst(UnoCero);
        buttons.insertFirst(CeroSiete);
        buttons.insertFirst(CeroSeis);
        buttons.insertFirst(CeroCinco);
        buttons.insertFirst(CeroCuatro);
        buttons.insertFirst(CeroTres);
        buttons.insertFirst(CeroDos);
        buttons.insertFirst(CeroUno);
        buttons.insertFirst(CeroCero);
        Lista matrix = new Lista();
        int bomb = (int) (Math.random() + (15) + 1), x = 0;
        for (int i = 0; i < 8; i++) {
            boolean bombax = Math.random() < 0.5;
            for (int y = 0; y < 8; y++) {
                if (x <= bomb) {
                    boolean bombay = Math.random() < 0.5, bombaw = Math.random() < 0.5;
                    if (bombax && bombay && bombaw) {
                        matrix.insertFirst(buttons.deleteFirst(), i, y, bombaw);

                        x++;
                    } else {
                        matrix.insertFirst(buttons.deleteFirst(), i, y, false);

                    }
                } else {
                    matrix.insertFirst(buttons.deleteFirst(), i, y, false);

                    
                }
            }
        }
        matrix.displayinmatrix2();
    }
    public void switchToSceneGameNormal(ActionEvent event) throws IOException {
        difficulty = 2;
        System.out.println(difficulty);
        Parent root = FXMLLoader.load(getClass().getResource("Juego.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        LinkedList buttons = new LinkedList();
        buttons.insertFirst(SieteSiete);
        buttons.insertFirst(SieteSeis);
        buttons.insertFirst(SieteCinco);
        buttons.insertFirst(SieteCuatro);
        buttons.insertFirst(SieteTres);
        buttons.insertFirst(SieteDos);
        buttons.insertFirst(SieteUno);
        buttons.insertFirst(SieteCero);
        buttons.insertFirst(SeisSiete);
        buttons.insertFirst(SeisSeis);
        buttons.insertFirst(SeisCinco);
        buttons.insertFirst(SeisCuatro);
        buttons.insertFirst(SeisTres);
        buttons.insertFirst(SeisDos);
        buttons.insertFirst(SeisUno);
        buttons.insertFirst(SeisCero);
        buttons.insertFirst(CincoSiete);
        buttons.insertFirst(CincoSeis);
        buttons.insertFirst(CincoCinco);
        buttons.insertFirst(CincoCuatro);
        buttons.insertFirst(CincoTres);
        buttons.insertFirst(CincoDos);
        buttons.insertFirst(CincoUno);
        buttons.insertFirst(CincoCero);
        buttons.insertFirst(CuatroSiete);
        buttons.insertFirst(CuatroSeis);
        buttons.insertFirst(CuatroCinco);
        buttons.insertFirst(CuatroCuatro);
        buttons.insertFirst(CuatroTres);
        buttons.insertFirst(CuatroDos);
        buttons.insertFirst(CuatroUno);
        buttons.insertFirst(CuatroCero);
        buttons.insertFirst(TresSiete);
        buttons.insertFirst(TresSeis);
        buttons.insertFirst(TresCinco);
        buttons.insertFirst(TresCuatro);
        buttons.insertFirst(TresTres);
        buttons.insertFirst(TresDos);
        buttons.insertFirst(TresUno);
        buttons.insertFirst(TresCero);
        buttons.insertFirst(DosSiete);
        buttons.insertFirst(DosSeis);
        buttons.insertFirst(DosCinco);
        buttons.insertFirst(DosCuatro);
        buttons.insertFirst(DosTres);
        buttons.insertFirst(DosDos);
        buttons.insertFirst(DosUno);
        buttons.insertFirst(DosCero);
        buttons.insertFirst(UnoSiete);
        buttons.insertFirst(UnoSeis);
        buttons.insertFirst(UnoCinco);
        buttons.insertFirst(UnoCuatro);
        buttons.insertFirst(UnoTres);
        buttons.insertFirst(UnoDos);
        buttons.insertFirst(UnoUno);
        buttons.insertFirst(UnoCero);
        buttons.insertFirst(CeroSiete);
        buttons.insertFirst(CeroSeis);
        buttons.insertFirst(CeroCinco);
        buttons.insertFirst(CeroCuatro);
        buttons.insertFirst(CeroTres);
        buttons.insertFirst(CeroDos);
        buttons.insertFirst(CeroUno);
        buttons.insertFirst(CeroCero);
        Lista matrix = new Lista();
        int bomb = (int) (Math.random() + (15) + 1), x = 0;
        for (int i = 0; i < 8; i++) {
            boolean bombax = Math.random() < 0.5;
            for (int y = 0; y < 8; y++) {
                if (x <= bomb) {
                    boolean bombay = Math.random() < 0.5, bombaw = Math.random() < 0.5;
                    if (bombax && bombay && bombaw) {
                        matrix.insertFirst(buttons.deleteFirst(), i, y, bombaw);

                        x++;
                    } else {
                        matrix.insertFirst(buttons.deleteFirst(), i, y, false);

                    }
                } else {
                    matrix.insertFirst(buttons.deleteFirst(), i, y, false);


                }
            }
        }
        matrix.displayinmatrix2();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

}
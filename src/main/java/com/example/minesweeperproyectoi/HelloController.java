package com.example.minesweeperproyectoi;
        import java.time.Clock;

        import javafx.application.Platform;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
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
        import javafx.scene.input.MouseButton;
        import javafx.scene.layout.Background;
        import javafx.scene.paint.Color;
        import javafx.stage.Stage;
        import javafx.animation.Animation;
        import javafx.animation.KeyFrame;
        import javafx.animation.Timeline;
        import javafx.util.Duration;
        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;

public class HelloController implements Initializable {
    /**
     * Botones de la matrix desde CeroCero, hasta SieteSiete
     */
    private Timeline timeline;
    private int count = 0;
    int bomb = (int) (Math.random() + (15) + 1), x = 0,cont = 0;

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
    @FXML
    private Button clue;
    @FXML
    private Button mainmenu;
    @FXML
    private Label timer;
    @FXML
    private Label minas;
    @FXML
    private Label win;
    int contminas = 0;

    /**
     * Creación de listas.
     */
    Lista matrix = new Lista();
    LinkedList buttons = new LinkedList();
    Lista4 safeList = new Lista4();
    Lista4 uncertainty = new Lista4();

    /**
     * Funciones para crear el cronómetro en el label "timer", lo actualiza cada segundo.
     */
    private void startTimer() {
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            count++;
            int minutes = count / 60;
            int seconds = count % 60;
            String time = String.format("%02d:%02d", minutes, seconds);
            Platform.runLater(() -> {
                timer.setText(time);
            });
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void pauseTimer() {
        if (timeline != null) {
            timeline.pause();
        }
    }


    /**
     * Funciones asociadas a cada uno de los botones.
     */
    public void T00(){
        bandera(buttons.finMatrix(0,0).getData(), 0, 0);
    }

    public void T01(){
        bandera(buttons.finMatrix(0,1).getData(), 0, 1);
    }

    public void T02(){
        bandera(buttons.finMatrix(0,2).getData(),0,2);
    }

    public void T03(){
        bandera(buttons.finMatrix(0,3).getData(), 0, 3);
    }

    public void T04(){
        bandera(buttons.finMatrix(0,4).getData(), 0, 4);
    }

    public void T05(){
        bandera(buttons.finMatrix(0,5).getData(),0 , 5);
    }

    public void T06(){
        bandera(buttons.finMatrix(0,6).getData(),0, 6);
    }

    public void T07(){
        bandera(buttons.finMatrix(0,7).getData(),0,7);
    }

    public void T10(){
        bandera(buttons.finMatrix(1,0).getData(),1,0);
    }

    public void T11(){
        bandera(buttons.finMatrix(1,1).getData(),1,1);
    }

    public void T12(){
        bandera(buttons.finMatrix(1,2).getData(),1,2);
    }

    public void T13(){
        bandera(buttons.finMatrix(1,3).getData(),1,3);
    }

    public void T14(){
        bandera(buttons.finMatrix(1,4).getData(),1,4);
    }

    public void T15(){
        bandera(buttons.finMatrix(1,5).getData(),1,5);
    }

    public void T16(){
        bandera(buttons.finMatrix(1,6).getData(),1,6);
    }

    public void T17(){
        bandera(buttons.finMatrix(1,7).getData(),1,7);
    }

    public void T20(){
        bandera(buttons.finMatrix(2,0).getData(),2,0);
    }

    public void T21(){
        bandera(buttons.finMatrix(2,1).getData(),2,1);
    }

    public void T22(){
        bandera(buttons.finMatrix(2,2).getData(),2,2);
    }

    public void T23(){
        bandera(buttons.finMatrix(2,3).getData(),2,3);
    }

    public void T24(){
        bandera(buttons.finMatrix(2,4).getData(),2,4);
    }

    public void T25(){
        bandera(buttons.finMatrix(2,5).getData(),2,5);
    }

    public void T26(){
        bandera(buttons.finMatrix(2,6).getData(),2,6);
    }

    public void T27(){
        bandera(buttons.finMatrix(2,7).getData(),2,7);
    }

    public void T30(){
        bandera(buttons.finMatrix(3,0).getData(),3,0);
    }

    public void T31(){
        bandera(buttons.finMatrix(3,1).getData(),3,1);
    }

    public void T32(){
        bandera(buttons.finMatrix(3,2).getData(),3,2);
    }

    public void T33(){
        bandera(buttons.finMatrix(3,3).getData(),3,3);
    }

    public void T34(){
        bandera(buttons.finMatrix(3,4).getData(),3,4);
    }

    public void T35(){
        bandera(buttons.finMatrix(3,5).getData(),3,5);
    }

    public void T36(){
        bandera(buttons.finMatrix(3,6).getData(),3,6);
    }
    public void T37(){
        bandera(buttons.finMatrix(3,7).getData(), 3, 7);
    }
    public void T40(){
        bandera(buttons.finMatrix(4,0).getData(), 4, 0);
    }

    public void T41(){
        bandera(buttons.finMatrix(4,1).getData(), 4, 1);
    }

    public void T42(){
        bandera(buttons.finMatrix(4,2).getData(), 4, 2);
    }

    public void T43(){
        bandera(buttons.finMatrix(4,3).getData(), 4, 3);
    }

    public void T44(){
        bandera(buttons.finMatrix(4,4).getData(), 4, 4);
    }

    public void T45(){
        bandera(buttons.finMatrix(4,5).getData(), 4, 5);
    }

    public void T46(){
        bandera(buttons.finMatrix(4,6).getData(), 4, 6);
    }

    public void T47(){
        bandera(buttons.finMatrix(4,7).getData(), 4, 7);
    }
    public void T50(){
        bandera(buttons.finMatrix(5,0).getData(), 5, 0);
    }

    public void T51(){
        bandera(buttons.finMatrix(5,1).getData(), 5, 1);
    }

    public void T52(){
        bandera(buttons.finMatrix(5,2).getData(), 5, 2);
    }

    public void T53(){
        bandera(buttons.finMatrix(5,3).getData(), 5, 3);
    }

    public void T54(){
        bandera(buttons.finMatrix(5,4).getData(), 5, 4);
    }

    public void T55(){
        bandera(buttons.finMatrix(5,5).getData(), 5, 5);
    }

    public void T56(){
        bandera(buttons.finMatrix(5,6).getData(), 5, 6);
    }

    public void T57(){
        bandera(buttons.finMatrix(5,7).getData(), 5, 7);
    }
    public void T60(){
        bandera(buttons.finMatrix(6,0).getData(), 6, 0);
    }

    public void T61(){
        bandera(buttons.finMatrix(6,1).getData(), 6, 1);
    }

    public void T62(){
        bandera(buttons.finMatrix(6,2).getData(), 6, 2);
    }

    public void T63(){
        bandera(buttons.finMatrix(6,3).getData(), 6, 3);
    }

    public void T64(){
        bandera(buttons.finMatrix(6,4).getData(), 6, 4);
    }

    public void T65(){
        bandera(buttons.finMatrix(6,5).getData(), 6, 5);
    }

    public void T66(){
        bandera(buttons.finMatrix(6,6).getData(), 6, 6);
    }

    public void T67(){
        bandera(buttons.finMatrix(6,7).getData(), 6, 7);
    }

    public void T70(){
        bandera(buttons.finMatrix(7,0).getData(), 7, 0);
    }

    public void T71(){
        bandera(buttons.finMatrix(7,1).getData(), 7, 1);
    }

    public void T72(){
        bandera(buttons.finMatrix(7,2).getData(), 7, 2);
    }

    public void T73(){
        bandera(buttons.finMatrix(7,3).getData(), 7, 3);
    }

    public void T74(){
        bandera(buttons.finMatrix(7,4).getData(), 7, 4);
    }

    public void T75(){
        bandera(buttons.finMatrix(7,5).getData(), 7, 5);
    }

    public void T76(){
        bandera(buttons.finMatrix(7,6).getData(), 7, 6);
    }

    public void T77(){
        bandera(buttons.finMatrix(7,7).getData(), 7, 7);
    }

    /**
     *
     * @param x
     * @param i
     * @param y
     * bandera(): En realidad esta función es para poner banderas y desbloquear casillas pero me di cuenta del nombre muy tarde.
     * *BUG*: Si se intenta eliminar una bandera ya puesta, la función es llamada dos veces por alguna razón y lo que hace es quitarla y volverla a quitar con el mismo click.
     */

    int contJugadas = 0;
    Stack pila = new Stack();
    public void clue() {
        if(pila.isEmpty() == 0){
            clue.setText("Vacío");
        }else{
            clue.setText(pila.pop());
        }
    }
    public void bandera(Button x, int i, int y) {
        x.setOnMouseClicked(event -> {
            Node2 node = matrix.finMatrix(i, y);
            if (event.getButton() == MouseButton.SECONDARY) {
                if (node.isFlag()){
                    if(node.isBomb()){
                        ++contminas;
                        minas.setText(Integer.toString(contminas));
                    }
                    if(contminas==bomb){
                        win.setText("You win!!!");
                        pauseTimer();
                    }else {
                        node.setFlag(false);
                        x.setStyle("-fx-background-color: #FF7F50");
                    }
                }if(node.isOpen()){
                    ;
                }else {
                    if(node.isBomb()){
                        ++contminas;
                        minas.setText(Integer.toString(contminas));
                        x.setStyle("-fx-background-color: #ff0000");
                        node.setFlag(true);
                    }else {
                        x.setStyle("-fx-background-color: #ff0000");
                        node.setFlag(true);
                    }
                }
            } else if (event.getButton() == MouseButton.PRIMARY) {
                if (node.isOpen()) {
                    ;
                } else {
                    if(node.isBomb()){
                        x.setText("*");
                        x.setStyle("-fx-background-color: #ffffff");
                        win.setText("You lost!");
                        pauseTimer();

                    }
                     else {
                         if(contJugadas % 5 == 0){
                             Node4 x1 =safeList.random();
                             pila.push(x1.getX(), x1.getY());
                             int vecino = matrix.neightborsFind(i, y);
                             String veci = "";
                             if (vecino != 0){
                                 veci = Integer.toString(vecino);
                             }else{
                                 ;
                             }x.setText(veci);
                             x.setStyle("-fx-background-color: #ffffff");
                         }else{
                             contJugadas++;
                             int vecino = matrix.neightborsFind(i, y);
                             String veci = "";
                             if (vecino != 0){
                                 veci = Integer.toString(vecino);
                             }else{
                                 ;
                             }x.setText(veci);
                             x.setStyle("-fx-background-color: #ffffff");
                         }
                    }
                } AI();
            }
        });
    }
    public void AI() {
        if (difficulty == 2) {
            if (safeList.getSize() != 0) {
                int i = safeList.random().getX(), y = safeList.random().getY();
                Node2 node = matrix.finMatrix(i, y);
                Button x = buttons.finMatrix(i, y).getData();
                if (node.isOpen()) {
                    AI();
                } else {
                    x.setStyle("-fx-background-color: #ffffff");
                    node.setOpen(true);
                    if (node.isBomb()) {
                        x.setText("*");
                        pauseTimer();
                        win.setText("You win!");
                    } else {
                        int vecino = matrix.neightborsFind(i, y);
                        String veci = "";
                        if (vecino != 0) {
                            veci = Integer.toString(vecino);
                        } else {
                            ;
                        }
                        x.setText(veci);
                    }
                }
                }else{
                    int i = uncertainty.random().getX(), y = uncertainty.random().getY();
                    Node2 node = matrix.finMatrix(i, y);
                    Button x = buttons.finMatrix(i, y).getData();
                    if (node.isOpen()) {
                        ;
                    } else {
                        x.setStyle("-fx-background-color: #ffffff");
                        node.setOpen(true);
                        if (node.isBomb()) {
                            x.setText("*");
                            pauseTimer();
                            win.setText("You win!");
                        } else {
                            int vecino = matrix.neightborsFind(i, y);
                            String veci = "";
                            if (vecino != 0) {
                                veci = Integer.toString(vecino);
                            } else {
                                ;
                            }
                            x.setText(veci);
                        }
                    }
                }
            } else {

                Lista4 aleatorio = null;
                int random = (int) (Math.random() + (1) + 1);
                if (random == 0) {
                    aleatorio = uncertainty;
                } else {
                    aleatorio = safeList;
                }
                Node4 noderan = aleatorio.random();
                int i = noderan.getX(), y = noderan.getY();
                Node2 node = matrix.finMatrix(i, y);
                Button x = buttons.finMatrix(i, y).getData();
                if (node.isOpen()) {
                    ;
                } else {
                    x.setStyle("-fx-background-color: #ffffff");
                    node.setOpen(true);
                    if (node.isBomb()) {
                        x.setText("*");
                        pauseTimer();
                        win.setText("You win!");
                    } else {
                        int vecino = matrix.neightborsFind(i, y);
                        String veci = "";
                        if (vecino != 0) {
                            veci = Integer.toString(vecino);
                        } else {
                            ;
                        }
                        x.setText(veci);
                    }
                }
            }
        }

    /**
     *
     * @param event
     * @throws IOException
     * Función asociada al botón de la pantalla principal para iniciar el juego en modo "dummy".
     */
    public void switchToSceneGameDummy(ActionEvent event) throws IOException {
        difficulty = 1;
        System.out.println(difficulty);
        Parent root = FXMLLoader.load(getClass().getResource("Juego.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        matrix.displayinmatrix2();
        pauseTimer();
        pauseTimer();
    }
    /**
     *
     * @param event
     * @throws IOException
     * Función asociada al botón de la pantalla Juego para devolverse al menú principal y reiniciar el juego (Botón de Walter White).
     */
    public void mainMenu(ActionEvent event) throws IOException {
        System.out.println("Ur in main manu");
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        pauseTimer();
    }
    /**
     *
     * @param event
     * @throws IOException
     * Función asociada al botón de la pantalla principal para iniciar el juego en modo "Normal".
     */
    public void switchToSceneGameNormal(ActionEvent event) throws IOException {
        difficulty = 2;
        System.out.println(difficulty);
        Parent root = FXMLLoader.load(getClass().getResource("Juego.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        matrix.displayinmatrix2();
        pauseTimer();
        pauseTimer();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        startTimer();
        safeList.random();
        System.out.println((int) (Math.random() * ((15) + 1)));
        /**
         * Adición de todos los botones a la lista "buttons"
         */
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
        /**
         * Creación de la matrix con respecto a los botones y aleatoriedad de las bombas.
         * *BUG*: La matrix se imprime al revés.
         */
        int bomb = (int) (Math.random() + (15) + 1), x = 0,cont = 0;
        for (int i = 0; i < 8; i++) {
            boolean bombax = Math.random() < 0.5;
            for (int y = 0; y < 8; y++) {
                if (x <= bomb) {
                    boolean bombay = Math.random() < 0.5, bombaw = Math.random() < 0.5;
                    if (bombax && bombay && bombaw) {
                        matrix.insertFirst(buttons.find(cont).data, i, y, bombaw);
                        cont++;
                        x++;
                    } else {
                        matrix.insertFirst(buttons.find(cont).data, i, y, false);
                        cont++;
                    }
                } else {
                    matrix.insertFirst(buttons.find(cont).data, i, y, false);
                    cont++;
                }
            }
        }
        /**
         * Creación de la lista segura.
         */
        for (int u = 0; u<8; u++){
            for (int p = 0; p<8; p++){
                if(matrix.isBombBo(u, p)){
                    uncertainty.insertFirst(matrix.finMatrix(u, p).getX(), matrix.finMatrix(u, p).getY());
                }else if(matrix.neightborsFind(u, p)==0){
                    safeList.insertFirst(matrix.finMatrix(u, p).getX(), matrix.finMatrix(u, p).getY());
                    }else{
                        uncertainty.insertFirst(matrix.finMatrix(u, p).getX(), matrix.finMatrix(u, p).getY());
                }
            }
        }

    }
}




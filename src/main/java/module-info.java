module com.example.minesweeperproyectoi {
    requires javafx.controls;
    requires javafx.fxml;
    requires jssc;


    opens com.example.minesweeperproyectoi to javafx.fxml;
    exports com.example.minesweeperproyectoi;
}
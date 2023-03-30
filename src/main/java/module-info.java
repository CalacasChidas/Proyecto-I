module com.example.minesweeperproyectoi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.minesweeperproyectoi to javafx.fxml;
    exports com.example.minesweeperproyectoi;
}
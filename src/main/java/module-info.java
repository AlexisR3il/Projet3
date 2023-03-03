module com.example.projet3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projet3 to javafx.fxml;
    exports com.example.projet3;
}
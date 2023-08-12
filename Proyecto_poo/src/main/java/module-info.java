module ec.edu.espol.poryecto_poo {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espol.poryecto_poo to javafx.fxml;
    exports ec.edu.espol.poryecto_poo;
}

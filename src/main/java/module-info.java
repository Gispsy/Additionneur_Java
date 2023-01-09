module fr.additionneur.additioneur {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.additionneur.additioneur to javafx.fxml;
    exports fr.additionneur.additioneur;
}
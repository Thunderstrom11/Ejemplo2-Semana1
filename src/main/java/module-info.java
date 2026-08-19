module ni.edu.ni.ejemplo3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.ni.ejemplo3 to javafx.fxml;
    exports ni.edu.ni.ejemplo3;
}
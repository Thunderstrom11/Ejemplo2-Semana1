module ni.edu.ni.ejemplo3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens ni.edu.ni.ejemplo3 to javafx.fxml;
    exports ni.edu.ni.ejemplo3;

    opens ni.edu.ni.ejemplo4 to javafx.fxml;
    exports ni.edu.ni.ejemplo4;

    opens  ni.edu.ni.ejemplo5 to javafx.fxml;
    exports ni.edu.ni.ejemplo5;
}



package ni.edu.ni.ejemplo5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/*
 Leer el salario de n cantidad de empleados, calcular el salario mas alto, mas bajo, el promedio
 del salario y la moda
 */


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();
        root.setSpacing(30);
        root.setPadding(new Insets(15));


        Scene scene = new Scene(root, 900, 400);
        stage.setTitle("Lectura y Análisis de Salarios");
        stage.setScene(scene);
        stage.show();
    }
}

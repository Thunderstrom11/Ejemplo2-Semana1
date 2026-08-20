package ni.edu.ni.ejemplo3;

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

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox(); //caja vertical
        root.setPadding(new Insets(30));
        root.setSpacing(15);

        Label lblTitle = new Label("Calculadora"); //etiqueta con el balor calculadora
        //root.getChildren().add(lblTitle); // agragar la etiqueta al interior de la caja (root) {uno por uno}

        Label lblNumer1 = new Label("Numero1");
        TextField tfNumer1 = new TextField();
        Label lblNumer2 = new Label("Numero2");
        TextField tfNumer2 = new TextField();


        HBox buttons = new HBox();
        buttons.setPadding(new Insets(10));
        buttons.setSpacing(10);

        Button btnSuma = new Button("+");
        Button btnResta = new Button(" - ");
        Button btnMultiplicacion = new Button(" * ");
        Button btnDivision = new Button(" / ");
        Label lblResultado = new Label("Resultado");


        btnSuma.setOnAction(e -> {
            try {
                int num1 = Integer.parseInt(tfNumer1.getText());
                int num2 = Integer.parseInt(tfNumer2.getText());
                int resultado = num1 + num2;
                lblResultado.setText(String.valueOf(resultado));
            }
            catch (NumberFormatException ex) {
                lblResultado.setText("Formato invalido, utilizar numeros enteros");
            }
        });

        btnResta.setOnAction(e -> {
            try {
                int num1 = Integer.parseInt(tfNumer1.getText());
                int num2 = Integer.parseInt(tfNumer2.getText());
                int resultado = num1 - num2;
                lblResultado.setText(String.valueOf(resultado));
            }
            catch (NumberFormatException ex) {
                lblResultado.setText("Formato invalido, utilizar numeros enteros");
            }

        });

        btnMultiplicacion.setOnAction(e -> {
            try {
                int num1 = Integer.parseInt(tfNumer1.getText());
                int num2 = Integer.parseInt(tfNumer2.getText());
                int resultado = num1 * num2;
                lblResultado.setText(String.valueOf(resultado));
            }
            catch (NumberFormatException ex) {
                lblResultado.setText("Formato invalido, utilizar numeros enteros");
            }

        });

        btnDivision.setOnAction(e -> {
            try {
                int num1 = Integer.parseInt(tfNumer1.getText());
                int num2 = Integer.parseInt(tfNumer2.getText());
                int resultado = num1 / num2;
                lblResultado.setText(String.valueOf(resultado));
            }
            catch (NumberFormatException ex) {
                lblResultado.setText("Formato invalido, utilizar numeros enteros");
            }
            catch (ArithmeticException ex) {
                lblResultado.setText("Error: Division por cero");
            }

        });

        buttons.getChildren().addAll(btnSuma, btnResta, btnMultiplicacion, btnDivision);

        root.getChildren().addAll(lblTitle,lblNumer1,tfNumer1,lblNumer2,tfNumer2,buttons,lblResultado);


        Scene scene = new Scene(root,600, 400);
        stage.setTitle("UAM");  // titulo de la escena (la ventana)
        stage.setScene(scene);
        stage.show();    //Mostramos la escena

    }
}

package ni.edu.ni.ejemplo4;

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
    Leer el salario de un trabajador, calcular el seguro social del 7% ademas darle un bono del
    10% si su salario es menor a 12000, 5% si esta entre 12000  y 20000 y un 3% si es mayor
    a 20000.
 */


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();
        root.setSpacing(30);
        root.setPadding(new Insets(15));

        Label lblTitle = new Label("* Calculo del seguro social *");
        Label lblResult = new Label("[]");

        HBox Salario = new HBox();
        Salario.setSpacing(10);
        Salario.setPadding(new Insets(10));

        Label lblSalary = new Label("Ingrese su salario actual");
        TextField tfSalary = new TextField();
        Button btnCalcular = new Button("Calcular");

         float intermedio;

        btnCalcular.setOnAction(e -> {

            float salario = Float.parseFloat(tfSalary.getText());

            float seguro = (float) (salario * 0.07);

            if (salario <= 0) {
                lblResult.setText("Salario negativo");

            }
            if (salario < 12000) {
                salario += (float) (salario * 0.10);
                lblResult.setText("Su salario actual es menor a 12k por lo que su salario final es de = " + salario +" UD"+ " y su total a pagar del seguro social es de = " + seguro + " UD");

            }
            else if (salario <= 20000) {
                salario += (float) (salario * 0.05);
                lblResult.setText("Su salario actual es mayor que 12k y menor que 20k por lo que su salario final es de = " + salario +" UD"+ " y su total a pagar del seguro social es de = " + seguro + " UD");

            }
            else //(salario > 20000)
                {
                salario += (float) (salario * 0.03);
                lblResult.setText("Su salario actual es mayor que 20k por lo que su salario final es de = " + salario +" UD"+ " y su total a pagar del seguro social es de = " + seguro + " UD");

            }

        });


        Salario.getChildren().addAll(lblSalary,tfSalary,btnCalcular);
        root.getChildren().addAll(lblTitle,Salario,lblResult);

        Scene scene = new Scene(root, 900, 400);
        stage.setTitle("Calculo de seguro social");
        stage.setScene(scene);
        stage.show();
    }
}

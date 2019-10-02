package e.javier.dam;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainWindows extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label label1=new Label("Label1");

        VBox vBoxPrincipal=new VBox(); //HBOX= contenedor que organiza los elementos de manera horizontal. De manera vertical es VBOX

        Button boton=new Button ("Aceptar"); //Button= un botón

        TextField textField=new TextField(); //TextField= Campo para escribir

        boton.setOnAction(new EventHandler<ActionEvent>() { //Clase interna y anónima que sirve para activar el botón
            @Override
            public void handle(ActionEvent actionEvent) {
                Label label2=new Label("Hola "+textField.getText());
                vBoxPrincipal.getChildren().add(label2);
            }
        });
        vBoxPrincipal.getChildren().addAll(label1,textField,boton); //esto es lo mismo que pasarle el botón y el label por el constructor de primeras -HBox hBoxPrincipal=new HBox(label1,boton)-

        Scene scene=new Scene(vBoxPrincipal,200,200);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}

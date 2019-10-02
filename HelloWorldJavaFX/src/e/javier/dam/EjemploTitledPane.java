package e.javier.dam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EjemploTitledPane extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label label=new Label("Contenido TitledPane");
        VBox vBox=new VBox(label);
        TitledPane titledPane=new TitledPane("Título",vBox);

        Scene scene=new Scene(titledPane,200,200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}

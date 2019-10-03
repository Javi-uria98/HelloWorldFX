package e.javier.dam;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PantallaSecundaria extends Stage {

    public PantallaSecundaria(){
        initModality(Modality.APPLICATION_MODAL); //esto es para que, cuando se me abra una nueva ventana, no pueda hacer nada en la primera ventana hasta que cierre la nueva
        setTitle("Diálogo modal");
        Scene sceneDialogo = new Scene(new Label("Esto es un diálogo modal"));
        Scene sceneDialog = new Scene(new Label("Esto es un diálogo modal"),200,200);
        setScene(sceneDialog);
        show();
    }
}


package logica;

public class Logica {

    private static Logica INSTANCE = null;

    private Logica(){

    }

    public static Logica getINSTANCE(){
        if (INSTANCE==null){
            INSTANCE=new Logica();
        }

        return INSTANCE;
    }


    //Para crear un Singleton -constructor privado-. Por ejemplo, en el ejercicio de GestorPartidosLayout, en esta clase iria la observableList

}

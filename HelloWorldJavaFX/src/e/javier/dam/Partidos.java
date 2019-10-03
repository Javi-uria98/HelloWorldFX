package e.javier.dam;
import java.util.Date;

public class Partidos implements Comparable<Partidos>{

    private String equipoloc;
    private String equipovis;
    private String resultado;
    private Date fecha;
    private Division d;

    public Partidos(String equipoloc, String equipovis, Division d, String resultado, Date fecha){
        setEquipoloc(equipoloc);
        setEquipovis(equipovis);
        setResultado(resultado);
        setFecha(fecha);
        setDivision(d);
    }

    public String getEquipoloc(){

        return equipoloc;
    }

    public void setEquipoloc(String equipoloc) {

        this.equipoloc = equipoloc;
    }

    public String getEquipovis() {

        return equipovis;
    }

    public void setEquipovis(String equipovis) {

        this.equipovis = equipovis;
    }

    public String getResultado() {

        return resultado;
    }

    public void setResultado(String resultado) {

        this.resultado = resultado;
    }

    public Date getFecha() {

        return fecha;
    }

    public void setFecha(Date fecha) {

        this.fecha = fecha;
    }

    public Division getDivision(){
        return d;
    }

    public void setDivision(Division d){
        this.d=d;
    }

    public int compareTo(Partidos p){
        return getFecha().compareTo(p.getFecha());
    }


}

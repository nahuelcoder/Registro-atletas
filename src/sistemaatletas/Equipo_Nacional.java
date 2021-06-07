package sistemaatletas;

import java.util.ArrayList;

public class Equipo_Nacional implements java.io.Serializable {

    private String pais;
    private String color;
    private ArrayList<Atleta> pertenece = new ArrayList<>();

    //Constructores
    public Equipo_Nacional() {
    }

    public Equipo_Nacional(String pais, String color) {
        this.pais = pais;
        this.color = color;
    }

    //Getters & setters
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Atleta> getPertenece() {
        return pertenece;
    }

    public void setPertenece(Atleta atleta){
        pertenece.add(atleta);
    }
    
    public void setPertenece(ArrayList<Atleta> pertenece) {
        this.pertenece = pertenece;
    }

    //Métodos

    public void mostrarAlturaAtletas(){
        for (Atleta atleta:pertenece) {
            System.out.println(atleta.getAltura());
        }
    }
    
}

package sistemaatletas;

import java.util.ArrayList;

public class Prueba implements java.io.Serializable{

    private int codigo;
    private String titulo;
    private ArrayList<Atleta> participa;
    private String sede;
    private String instalacion;

    //Constructores
    public Prueba() {
        participa = new ArrayList<>();
    }
    
    public Prueba(int codigo, String titulo, String sede, String instalacion, ArrayList<Atleta> participa) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.sede = sede;
        this.instalacion = instalacion;
        this.participa = new ArrayList<>(participa);
    }

    //Getters & setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Atleta> getParticipa() {
        return participa;
    }

    public void setParticipa(Atleta atleta){
        participa.add(atleta);
    }
    
    public void setParticipa(ArrayList<Atleta> participa) {
        this.participa = participa;
    }
    
    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }
}

package sistemaatletas;

public class Atleta implements Contrato, java.io.Serializable{

    private String nombre;
    private int dni;
    private int edad;
    private float altura;
    private int peso;

    // Constructores
    public Atleta(){
    }
    
    public Atleta(String nombre, int dni, int edad, float altura, int peso) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    
    // Getters & setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //Métodos

    @Override
    public float tomarPulsaciones() {
        return 80;
    }

    @Override
    public boolean hayPesoExtra(float imc) {
        return imc >= 25 && imc <= 29.9;
    }

    @Override
    public float calculaIMC() {
        return (float) (peso / Math.pow(altura, 2));

    }
}

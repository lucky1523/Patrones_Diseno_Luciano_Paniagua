package FactoryMethod.ejercicios;

public class Avion {
    private String marca;
    private String capacidad;
    private String modelo;
    private String numeroDeAsientos;

    public Avion() {}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    public void setNumeroDeAsientos(String numeroDeAsientos) {
        this.numeroDeAsientos = numeroDeAsientos;
    }

    public void showInfo(){
        System.out.println("capacidad: "+marca);
        System.out.println("capacidad: "+capacidad);
        System.out.println("numero de asientos : "+numeroDeAsientos);
        System.out.println("Modelo: "+ modelo);
    }
}

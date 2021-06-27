package EjerciciosPreUltimoParcial.Ejercicio6Visitor;

public class Computadora implements IAparato {
    private String modelo;
    private String memoria;
    private String ram;

    public Computadora(String modelo, String memoria, String ram) {
        this.modelo = modelo;
        this.memoria = memoria;
        this.ram = ram;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria: " + memoria);
        System.out.println("Ram: " + ram);

    }

    @Override
    public void recibirMantenimiento(IMantenimiento mantenimiento) {
        mantenimiento.mantenimiento(this);

    }
}
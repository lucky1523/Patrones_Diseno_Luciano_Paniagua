package EjerciciosPreUltimoParcial.Ejercicio6Visitor;

public class Celular implements IAparato {
    private String modelo;
    private String memoria;
    private String camara;
    private String ram;
    private String sistemaOperativo;

    public Celular(String modelo, String memoria, String camara, String ram, String sistemaOperativo) {
        this.modelo = modelo;
        this.memoria = memoria;
        this.camara = camara;
        this.ram = ram;
        this.sistemaOperativo = sistemaOperativo;
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

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria: " + memoria);
        System.out.println("Cámara: " + camara);
        System.out.println("RAM: " + ram);
        System.out.println("Sistema operativo: " + sistemaOperativo);

    }

    @Override
    public void recibirMantenimiento(IMantenimiento mantenimiento) {
        mantenimiento.mantenimiento(this);

    }

}

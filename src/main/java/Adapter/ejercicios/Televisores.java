package Adapter.ejercicios;

public class Televisores implements IElectronicosGrandes{
    private int costo;
    private String tiempoGarantia;
    public Televisores(int costo,String tiempoGarantia){
        this.costo=costo;
        this.tiempoGarantia=tiempoGarantia;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTiempoGarantia() {
        return tiempoGarantia;
    }

    public void setTiempoGarantia(String tiempoGarantia) {
        this.tiempoGarantia = tiempoGarantia;
    }

    @Override
    public void iniciarArtefacto() {

        System.out.println("Tiempo de garantia del dispositivo Televisor: " + tiempoGarantia);


    }

    @Override
    public void adquirirArtefacto() {
        System.out.println("Costo del dispositivo Televisor: " + costo);
    }
}

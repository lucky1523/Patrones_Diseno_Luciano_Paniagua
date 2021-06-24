package Proxy.ejercicio;

public class Tarjeta {
    private String tipoDeMoneda;
    private int montoEnLaTarjeta;

    public Tarjeta(){

    }
    public Tarjeta(String tipoDeMoneda,int montoEnLaTarjeta){
        this.montoEnLaTarjeta=montoEnLaTarjeta;
        this.tipoDeMoneda=tipoDeMoneda;
    }

    public String getTipoDeMoneda() {
        return tipoDeMoneda;
    }

    public void setTipoDeMoneda(String tipoDeMoneda) {
        this.tipoDeMoneda = tipoDeMoneda;
    }

    public int getMontoEnLaTarjeta() {
        return montoEnLaTarjeta;
    }

    public void setMontoEnLaTarjeta(int montoEnLaTarjeta) {
        this.montoEnLaTarjeta = montoEnLaTarjeta;
    }

    public void showInfo(){
        System.out.println("tipo De Moneda: "+ tipoDeMoneda);
        System.out.println("monto En La Tarjeta: "+ montoEnLaTarjeta);


    }
}

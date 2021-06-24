package Proxy.ejercicio;

public class CuentaDeBanco implements IBanco{
    private int numeroTarjeta;
    private String tipoMoneda;
    private int montoEnLaCuenta;

    public CuentaDeBanco(){}
    public CuentaDeBanco(int numeroTarjeta,String tipoMoneda,int montoEnLaCuenta){
        this.montoEnLaCuenta=montoEnLaCuenta;
        this.numeroTarjeta=numeroTarjeta;
        this.tipoMoneda=tipoMoneda;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public int getMontoEnLaCuenta() {
        return montoEnLaCuenta;
    }

    public void setMontoEnLaCuenta(int montoEnLaCuenta) {
        this.montoEnLaCuenta = montoEnLaCuenta;
    }

    @Override
    public void sacarDinero(Tarjeta tarjeta,int monto) {
        System.out.println("********* Sacando Dinero de la cuenta ******");
        tarjeta.showInfo();
        System.out.println("Dinero restante en la tarjeta: " + monto);

        System.out.println("**********************");
    }


}

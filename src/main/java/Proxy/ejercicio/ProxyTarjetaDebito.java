package Proxy.ejercicio;

public class ProxyTarjetaDebito implements IBanco{
    private CuentaDeBanco cuentaDeBanco= new CuentaDeBanco(1234556,"bolivianos",5000);
    private int numeroTarjeta;
    private String tipoMoneda;
    private int montoEnLaCuenta;

    public ProxyTarjetaDebito(){}
    public ProxyTarjetaDebito(int numeroTarjeta,String tipoMoneda,int montoEnLaCuenta){
        this.montoEnLaCuenta=montoEnLaCuenta;
        this.numeroTarjeta=numeroTarjeta;
        this.tipoMoneda=tipoMoneda;
        System.out.println("inicializando Proxy...");
        System.out.println("numeroTarjeta: "+numeroTarjeta);
        System.out.println("tipoMoneda: "+ tipoMoneda);
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
        if (tarjeta.getTipoDeMoneda().toLowerCase().equals("bolivianos")) {
            if (tarjeta.getMontoEnLaTarjeta()>monto){
                System.out.println("Retirando la cantidad de: " + monto);
                int montoRestanteTarjeta = tarjeta.getMontoEnLaTarjeta()-monto;
                cuentaDeBanco.sacarDinero(tarjeta,montoRestanteTarjeta);
            } else {
                System.out.println("El monto ingresado es superior a su dinero en la cuenta");
            }
        } else if (tarjeta.getTipoDeMoneda().toLowerCase().equals("dolares")){
            if (tarjeta.getMontoEnLaTarjeta()>monto){
                System.out.println("Conviertiendo: " + monto + " Dolares a Bolivianos");
                int montoConvertido = monto*7;
                int montoRestanteTarjeta = tarjeta.getMontoEnLaTarjeta()-montoConvertido;
                cuentaDeBanco.sacarDinero(tarjeta,montoRestanteTarjeta);
            } else {
                System.out.println("El monto ingresado es superior a su dinero en la cuenta");
            }
        }
    }

}

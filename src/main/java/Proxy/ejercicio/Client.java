package Proxy.ejercicio;

public class Client {
    public static void main(String[]args){
        ProxyTarjetaDebito proxyTarjetaDebito = new ProxyTarjetaDebito(1234556,"bolivianos",5000);
        proxyTarjetaDebito.sacarDinero(new Tarjeta("bolivianos",5000),1500);
        proxyTarjetaDebito.sacarDinero(new Tarjeta("dolares",5000),500);
    }
}

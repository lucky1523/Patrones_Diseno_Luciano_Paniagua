package Strategy.ejercicio;

public class Client {
    public static void main(String[]args){
        TiendaRopa tiendaRopa = new TiendaRopa();
        Ropa ropa1 = new Ropa(50,"invierno");
        tiendaRopa.setTipoDeRopa("Chamarras");

        tiendaRopa.setRopa(ropa1);
        tiendaRopa.setEstrategiaVenta(new Invierno());
        tiendaRopa.establecerTemporada();

        Ropa ropa2 = new Ropa(100,"verano");
        tiendaRopa.setRopa(ropa2);
        tiendaRopa.setEstrategiaVenta(new Verano());
        tiendaRopa.establecerTemporada();

    }
}

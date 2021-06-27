package EjerciciosPreUltimoParcial.Ejercicio2Bridge;

public class InstalacionAgua implements Instalacion{
    String nombre;
    double precio;
    IFormaPago pago;
    public InstalacionAgua(String nombre, double precio, IFormaPago pago) {
        this.nombre = nombre;
        this.precio = precio;
        this.pago=pago;
    }
    @Override
    public void pagar() {
        pago.pagar(precio);
    }


}

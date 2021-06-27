package EjerciciosPreUltimoParcial.Ejercicio2Bridge;

public class Transferencia implements IFormaPago {

    @Override
    public void pagar(double monto) {
        System.out.println("***");
        System.out.println("Se debe pagar el monto de: " + (monto*0.95));

    }

}

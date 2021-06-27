package EjerciciosPreUltimoParcial.Ejercicio2Bridge;

public class Aplicacion implements IFormaPago {

    @Override
    public void pagar(double monto) {
        System.out.println("***");
        System.out.println("Se debe pagar el monto de: " + (monto*0.9));

    }

}

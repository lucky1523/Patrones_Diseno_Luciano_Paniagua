package EjerciciosPreUltimoParcial.Ejercicio2Bridge;

public class Client {

    public static void main(String[] args) {
        Instalacion i1 = new InstalacionAgua("Aqua", 100, new Efectivo());
        Instalacion i2 = new InstalacionAgua("Aqua", 100, new Transferencia());
        Instalacion i3 = new InstalacionAgua("Aqua", 100, new Tigomoney());
        Instalacion i4 = new InstalacionAgua("Aqua", 100, new Aplicacion());

        i1.pagar();
        i2.pagar();
        i3.pagar();
        i4.pagar();


        Instalacion ial1 = new InstalacionAlcantarillado("Can", 150, new Efectivo());
        Instalacion ial2 = new InstalacionAlcantarillado("Can", 150, new Transferencia());
        Instalacion ial3 = new InstalacionAlcantarillado("Can", 150, new Tigomoney());
        Instalacion ial4 = new InstalacionAlcantarillado("Can", 150, new Aplicacion());

        ial1.pagar();
        ial2.pagar();
        ial3.pagar();
        ial4.pagar();

        Instalacion ie1 = new InstalacionElectrica("Tigreh", 1000, new Efectivo());
        Instalacion ie2 = new InstalacionElectrica("Tigreh", 1000, new Transferencia());
        Instalacion ie3 = new InstalacionElectrica("Tigreh", 1000, new Tigomoney());
        Instalacion ie4 = new InstalacionElectrica("Tigreh", 1000, new Aplicacion());

        ie1.pagar();
        ie2.pagar();
        ie3.pagar();
        ie4.pagar();

    }

}

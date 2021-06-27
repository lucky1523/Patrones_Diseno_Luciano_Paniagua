package EjerciciosPreUltimoParcial.Ejercicio5Adapter;

public class Escritorio implements IAplicacionesComputador {

    @Override
    public void iniciarSesion() {
        System.out.println("iniciando sesión en la aplicaión de escritorio");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("cerrando sesión en la aplicaión de escritorio");

    }

    @Override
    public void generarDatos() {
        System.out.println("generando datos en la aplicaión de escritorio");

    }

}

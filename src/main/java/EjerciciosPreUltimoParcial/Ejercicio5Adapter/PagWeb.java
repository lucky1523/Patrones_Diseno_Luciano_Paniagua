package EjerciciosPreUltimoParcial.Ejercicio5Adapter;

public class PagWeb implements IAplicacionesComputador {

    @Override
    public void iniciarSesion() {
        System.out.println("iniciando sesión en la aplicaión web");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("cerrando sesión en la aplicaión web");

    }

    @Override
    public void generarDatos() {
        System.out.println("generando datos en la aplicaión web");

    }

}
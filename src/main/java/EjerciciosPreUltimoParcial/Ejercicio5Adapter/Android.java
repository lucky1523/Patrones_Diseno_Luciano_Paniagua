package EjerciciosPreUltimoParcial.Ejercicio5Adapter;

public class Android implements IAplicacionesMoviles {

    @Override
    public void login() {
        System.out.println("haciendo login en la aplicacion de Android");

    }

    @Override
    public void logout() {
        System.out.println("haciendo logout en la aplicacion de Android");

    }

    @Override
    public void reportes() {
        System.out.println("generando reportes en la aplicacion de Android");

    }

}
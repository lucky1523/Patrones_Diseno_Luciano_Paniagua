package EjerciciosPreUltimoParcial.Ejercicio5Adapter;

public class WindowsPhone implements IAplicacionesMoviles {

    @Override
    public void login() {
        System.out.println("haciendo login en la aplicacion de WindowsPhone");

    }

    @Override
    public void logout() {
        System.out.println("haciendo logout en la aplicacion de WindowsPhone");

    }

    @Override
    public void reportes() {
        System.out.println("generando reportes en la aplicacion de WindowsPhone");

    }

}
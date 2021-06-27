package EjerciciosPreUltimoParcial.Ejercicio5Adapter;

public class AplComputadorAdaptado implements IAplicacionesMoviles {
    private IAplicacionesComputador appC;

    public AplComputadorAdaptado(IAplicacionesComputador appC) {
        System.out.println("Adaptando La aplicacion del computador a una móvil");
        this.appC = appC;
    }

    @Override
    public void login() {
        appC.iniciarSesion();
    }

    @Override
    public void logout() {
        appC.cerrarSesion();

    }

    @Override
    public void reportes() {
        appC.generarDatos();

    }

}

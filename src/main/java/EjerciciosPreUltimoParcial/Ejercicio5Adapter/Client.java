package EjerciciosPreUltimoParcial.Ejercicio5Adapter;

public class Client {

    public static void main(String[] args) {
        Android Twitter = new Android();
        IOS Iphone = new IOS();
        WindowsPhone windows = new WindowsPhone();

        AplComputadorAdaptado youtube = new AplComputadorAdaptado(new PagWeb());
        AplComputadorAdaptado escritorio = new AplComputadorAdaptado(new Escritorio());

        Twitter.login();
        Twitter.logout();
        Twitter.reportes();

        Iphone.login();
        Iphone.logout();
        Iphone.reportes();

        windows.login();
        windows.logout();
        windows.reportes();

        youtube.login();
        youtube.logout();
        youtube.reportes();

        escritorio.login();
        escritorio.logout();
        escritorio.reportes();
    }

}

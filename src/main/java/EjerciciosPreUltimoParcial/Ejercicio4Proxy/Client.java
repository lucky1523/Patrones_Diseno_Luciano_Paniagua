package EjerciciosPreUltimoParcial.Ejercicio4Proxy;

public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Servidor(), new Servidor());

        proxy.registrar("usuario1", "1234");
        proxy.registrar("usuario2", "321");
        proxy.registrar("usuario3", "000");
        proxy.registrar("usuario4", "111");
        proxy.registrar("usuario5", "101");
        proxy.registrar("usuario6", "333");

        proxy.ingresar("usuario1", "1111");

        proxy.ingresar("usuario1", "1234");
        proxy.ingresar("usuario2", "321");
        proxy.ingresar("usuario3", "000");
        proxy.ingresar("usuario4", "111");
        proxy.ingresar("usuario5", "101");
        proxy.ingresar("usuario6", "333");

    }

}
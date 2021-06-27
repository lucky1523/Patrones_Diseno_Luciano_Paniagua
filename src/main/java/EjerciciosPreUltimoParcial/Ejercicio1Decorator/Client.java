package EjerciciosPreUltimoParcial.Ejercicio1Decorator;

public class Client {

    public static void main(String[] args) {
        IPersonaje personaje = new Personaje("Manfred");
        personaje.info();

        personaje = new ArmarPersonaje(personaje, "Espada");
        personaje.info();

        personaje = new Pocion(personaje);
        personaje.info();

        personaje = new Escudo(personaje);
        personaje.info();



    }

}
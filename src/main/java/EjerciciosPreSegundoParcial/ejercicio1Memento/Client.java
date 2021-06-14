package EjerciciosPreSegundoParcial.ejercicio1Memento;

public class Client {
    public static void main(String[] args) {
        Versiones versiones = new Versiones();
        Originator originator = new Originator();

        Tesis tesis;
        tesis = new Tesis("1/1/2020", "123");
        originator.setState(tesis);
        versiones.addMemento(originator.createVersion());

        tesis = new Tesis("3/1/2020", "124");
        originator.setState(tesis);
        versiones.addMemento(originator.createVersion());

        tesis = new Tesis("5/1/2020", "125");
        originator.setState(tesis);
        versiones.addMemento(originator.createVersion());


        tesis = new Tesis("7/1/2020", "127");
        originator.setState(tesis);
        versiones.addMemento(originator.createVersion());

        originator.restoreFromMemento(versiones.getVersion(2));

    }
}
package EjerciciosPreSegundoParcial.ejercicio3MementoYObserver;

public class Memento {
    private Git state;

    public Memento(Git state) {
        this.state=state;
    }

    public Git getState() {
        return state;
    }

}

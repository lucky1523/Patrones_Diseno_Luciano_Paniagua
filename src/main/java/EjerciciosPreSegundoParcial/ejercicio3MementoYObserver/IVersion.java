package EjerciciosPreSegundoParcial.ejercicio3MementoYObserver;

public interface IVersion {
    void attach(ISeguidor observer);
    void deattach(ISeguidor observer);
    void notifyObserver(int version);
}
package EjerciciosPreSegundoParcial.ejercicio3MementoYObserver;

import java.util.ArrayList;
import java.util.List;

public class Originator implements IVersion {
    private Git state;
    private List<ISeguidor> observerList = new ArrayList<>();

    public void setState(Git state) {
        System.out.println("**** Set State *****");
        state.showInfo();
        this.state = state;
    }

    public Memento createVersion() {
        System.out.println("**** Create State *****");
        state.showInfo();
        ;
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento version) {
        this.state = version.getState();
        System.out.println("**** State Restored *****");
        this.state.showInfo();
        this.notifyObserver(state.getVersion());
    }

    @Override
    public void notifyObserver(int version) {
        System.out.println("**** Notificando usuarios ****");
        for (ISeguidor observer : observerList) {
            observer.update("restaurado la version: " + version);
        }
    }

    @Override
    public void attach(ISeguidor observer) {
        observerList.add(observer);

    }

    @Override
    public void deattach(ISeguidor observer) {
        observerList.remove(observer);

    }
}
package EjerciciosPreSegundoParcial.ejercicio3MementoYObserver;

import java.util.ArrayList;
import java.util.List;

public class Commit {
    private List<Memento> list= new ArrayList<>();

    public void addMemento(Memento memento){
        list.add(memento);
    }

    public Memento getVersion(int position){
        return list.get(position);
    }
}
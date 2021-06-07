package Memento.ejercicios;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private Map<String, Memento> stateSaved = new HashMap<>();

    public void creandoCommit(String commit, Memento memento){
        stateSaved.put(commit,memento);
    }

    public Memento getMemento(String commitCode){
        return stateSaved.get(commitCode);
    }
}

package EjerciciosPreSegundoParcial.ejercicio1Memento;

import java.util.ArrayList;
import java.util.List;

public class Versiones {
    private List<VersionTesis> list= new ArrayList<>();

    public void addMemento(VersionTesis v){
        list.add(v);
    }

    public VersionTesis getVersion(int position){
        return list.get(position);
    }
}

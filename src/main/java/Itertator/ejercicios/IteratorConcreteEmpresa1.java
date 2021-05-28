package Itertator.ejercicios;

import java.util.ArrayList;

public class IteratorConcreteEmpresa1 implements Iterator{
    private ArrayList<String> lista = new ArrayList<>();
    private int position;

    @Override
    public Object next() {
        return this.lista.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.lista.size() != 0 && this.lista.size() > position;
    }
}

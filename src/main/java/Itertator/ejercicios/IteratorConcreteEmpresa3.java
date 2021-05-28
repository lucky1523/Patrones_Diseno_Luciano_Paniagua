package Itertator.ejercicios;

import java.util.Vector;

public class IteratorConcreteEmpresa3 implements Iterator{
    private Vector<String> vector;
    private int position;
    public IteratorConcreteEmpresa3(Vector<String> vector){
        this.vector=vector;
        this.position=0;
    }

    @Override
    public Object next() {
        return  this.vector.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.vector.size() !=0 && this.vector.size() > position;
    }
}

package Itertator.ejercicios;

import java.util.Stack;

public class IteratorConcreteEmpresa4 implements Iterator{
    private Stack<String> pila;
    private int position;

    public IteratorConcreteEmpresa4(Stack<String> pila){
        this.pila=pila;
        this.position=0;

    }

    @Override
    public Object next() {
        return this.pila.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.pila.size() !=0 && this.pila.size() > position;
    }
}

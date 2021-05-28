package Itertator.ejercicios;

import java.util.Stack;

public class Empresa4 implements IList{
    private Stack<String> pila;
    public Empresa4() {
        pila = new Stack<>();
    }
        public void add(String value){
            pila.add(value);
        }

    @Override
    public Iterator iterator() {
        return null;
    }
}


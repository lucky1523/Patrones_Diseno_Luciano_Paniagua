package Itertator.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Empresa1 implements IList{
    private ArrayList<String> lista;

    public Empresa1(){
        lista = new ArrayList<>();
    }
    public void add(String value){
        lista.add(value);
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}

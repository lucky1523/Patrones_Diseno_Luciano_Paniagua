package Itertator.ejercicios;

import java.util.Vector;

public class Empresa3 implements IList{
    private Vector<String> vector;

    public Empresa3(){
        vector= new Vector<>();
    }
    public void add(String value){
        vector.add(value);
    }



    @Override
    public Iterator iterator() {
        return null;
    }
}

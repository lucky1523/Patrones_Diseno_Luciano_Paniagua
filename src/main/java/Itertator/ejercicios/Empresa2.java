package Itertator.ejercicios;

public class Empresa2 implements IList{
    private String [] array;
    private int position;

    public Empresa2(){
        position=0;
        array= new String[10];

    }

    public void add(String value){
        array[position]=value;
        position++;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}

package Itertator.ejercicios;

public class IteratorConcreteEmpresa2 implements Iterator{
    private String [] array;
    private int position;

    public IteratorConcreteEmpresa2( String [] nombres) {
        this.array = nombres;
    }

        @Override
    public Object next() {
        return array[position++];
    }

    @Override
    public boolean hasNext() {
        return array.length!=0 && position<array.length;
    }
}

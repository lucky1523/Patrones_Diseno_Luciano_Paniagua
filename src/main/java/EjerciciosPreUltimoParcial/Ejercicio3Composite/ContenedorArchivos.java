package EjerciciosPreUltimoParcial.Ejercicio3Composite;

import java.util.LinkedList;
import java.util.List;

public class ContenedorArchivos extends Documento {
    List<Documento> documentoList;

    public ContenedorArchivos() {
        documentoList = new LinkedList<Documento>();
    }

    @Override
    public int obtenerNumeroDePalabras() {
        int x = 0;
        for (Documento archivo : documentoList) {
            x += archivo.obtenerNumeroDePalabras();
        }
        palabras = x;
        return x;
    }

    @Override
    public void MostrarPalabras() {
        this.obtenerNumeroDePalabras();
        System.out.println("Numero de palabras: " + palabras);
    }

    @Override
    public void add(Documento component) {
        documentoList.add(component);

    }

    @Override
    public void remove(Documento component) {
        documentoList.remove(component);

    }

    @Override
    public void getChild(int position) {
        documentoList.get(position);

    }

}
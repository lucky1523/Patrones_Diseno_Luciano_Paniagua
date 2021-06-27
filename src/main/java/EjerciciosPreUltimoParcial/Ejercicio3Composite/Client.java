package EjerciciosPreUltimoParcial.Ejercicio3Composite;

public class Client {

    public static void main(String[] args) {
        Documento a1 = new Archivo("Hola");
        Documento a2 = new Archivo("Como");
        Documento a3 = new Archivo("Estas");

        a1.MostrarPalabras();

        Documento a4 = new Archivo("Estoy");
        Documento a5 = new Archivo("muy bien");
        Documento a6 = new Archivo("y tu");

        a4.MostrarPalabras();

        Documento folder1 = new ContenedorArchivos();

        folder1.add(a1);
        folder1.add(a2);
        folder1.add(a3);

        folder1.MostrarPalabras();

        Documento folder2 = new ContenedorArchivos();

        folder2.add(a4);
        folder2.add(a5);
        folder2.add(a6);

        folder2.MostrarPalabras();

        Documento unidadDisco = new ContenedorArchivos();

        unidadDisco.add(folder1);
        unidadDisco.add(folder2);

        unidadDisco.MostrarPalabras();
    }

}

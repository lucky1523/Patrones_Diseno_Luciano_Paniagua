package EjerciciosPreSegundoParcial.ejercicio4Strategy;


import java.util.List;

public class MuchoPrecio implements IBusquedaPrecio {

    @Override
    public void busquedaPrecio(List<Celular> list, int precio) {
        System.out.println("Buscando según el precio: "+precio);
        for (Celular c : list) {
            if (c.getPrecio() == precio) {
                c.showInfo();
            }
        }

    }

}
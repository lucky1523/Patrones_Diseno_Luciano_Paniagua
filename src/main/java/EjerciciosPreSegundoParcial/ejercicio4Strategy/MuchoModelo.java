package EjerciciosPreSegundoParcial.ejercicio4Strategy;

import java.util.List;

public class MuchoModelo implements IBusquedaModelo {

    @Override
    public void busquedaPrecio(List<Celular> list, String modelo) {
        System.out.println("Buscando  según el modelo: "+modelo);
        for (Celular c : list) {
            if (c.getModelo().equals(modelo)) {
                c.showInfo();
            }
        }

    }

}
package EjerciciosPreSegundoParcial.ejercicio4Strategy;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        TiendaCelular t = new TiendaCelular(3);

        List<Celular> p = new LinkedList<Celular>();

        p.add(new Celular("Iphone","Apple","Alta",100));
        p.add(new Celular("P190","Huawei","Media",150));
        p.add(new Celular("Galaxi","Xiaomi","Media",250));

        t.setList(p);

        t.buscarSegunModelo("Galaxi");
        t.buscarSegunPrecio(300);

        t.add(new Celular("ER43","Samsung","Alta", 400));

        t.buscarSegunModelo("ER43");
        t.buscarSegunPrecio(400);
    }
}

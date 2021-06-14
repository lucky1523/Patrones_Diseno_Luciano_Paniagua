package EjerciciosPreSegundoParcial.ejercicio4Strategy;

import java.util.LinkedList;
import java.util.List;

public class TiendaCelular {
    private IBusquedaModelo busqModelo;
    private IBusquedaPrecio busqePrecio;
    private int value;
    private List<Celular> list = new LinkedList<Celular>();


    public TiendaCelular(int value) {
        this.value = value;
    }

    public void add(Celular c) {
        list.add(c);
    }
    public IBusquedaModelo getBusqModelo() {
        return busqModelo;
    }

    public void setBusqModelo(IBusquedaModelo busqModelo) {
        this.busqModelo = busqModelo;
    }

    public IBusquedaPrecio getBusqePrecio() {
        return busqePrecio;
    }

    public void setBusqePrecio(IBusquedaPrecio busqePrecio) {
        this.busqePrecio = busqePrecio;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public List<Celular> getList() {
        return list;
    }

    public void setList(List<Celular> list) {
        this.list = list;
    }

    public void buscarSegunPrecio(int precio) {
        if(list.size()>value) {
            busqePrecio = new MuchoPrecio();
        }else {
            busqePrecio = new MuchoPrecio();
        }
        busqePrecio.busquedaPrecio(list, precio);
    }

    public void buscarSegunModelo(String modelo) {
        if(list.size()>value) {
            busqModelo = new MuchoModelo();
        }else {
            busqModelo = new MuchoModelo();
        }
        busqModelo.busquedaPrecio(list, modelo);
    }
}

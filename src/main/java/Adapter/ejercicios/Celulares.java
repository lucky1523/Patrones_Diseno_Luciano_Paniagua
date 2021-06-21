package Adapter.ejercicios;

import java.util.Locale;

public class Celulares implements IElectronicosPequenos{
    private int precio;
    private String tiempoDeVida;

    public Celulares(int precio,String tiempoDeVida){
        this.precio=precio;
        this.tiempoDeVida=tiempoDeVida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTiempoDeVida() {
        return tiempoDeVida;
    }

    public void setTiempoDeVida(String tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void prenderElectronico() {
        if (tiempoDeVida.toLowerCase().equals("1 año")||tiempoDeVida.toLowerCase().equals("2 años")){
            System.out.println("No es posible prender el dispositivo por el bajo tiempo de vida ");
        } else {
            System.out.println("Prendiendo el dispositivo electronico Celular");
        }
    }

    @Override
    public void comprarElectronico() {
        System.out.println("El precio del celular es de: " + precio);

    }
}

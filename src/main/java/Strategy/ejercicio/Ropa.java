package Strategy.ejercicio;

public class Ropa {
    private double precio;
    private String estacion;

    public Ropa(double precio,String estacion){
        this.estacion=estacion;
        this.precio=precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }
    public void showInfo(){
        System.out.println("temporada actual : "+ estacion);
        System.out.println("Precio en esta temporada: "+precio);
    }
}

package AbstractFactory.ejercicios.HeladeriaAbstract;

public class Base {
    private String nombre;
    private String costo;
    private String tamano;
    private String tipo;

    public Base(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void showInfo(){
        System.out.println("base nombre: "+nombre);
        System.out.println("base tamano: "+tamano);
        System.out.println("base tipo: "+tipo);
        System.out.println("base costo: "+costo);

    }
}
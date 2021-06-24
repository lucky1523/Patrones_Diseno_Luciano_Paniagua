package Composite.ejercicios;

abstract class Component {
    private String titulo;
    private int precio;

    public Component(String titulo){
        this.titulo =titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract  int totalEstimacion();
    public abstract  void add(Component component);
    public abstract  void remove(Component component);
    public abstract  void getChild(int position);

}
package Visitor.ejercicio;

public class Sublime implements IEditoresTexto{
    private String nombre;
    private String documento;
    public Sublime(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public void accept(IPlugin plugin) {
        System.out.println("caracteres del documento "+documento.length());
        plugin.guardando(this);
    }
}

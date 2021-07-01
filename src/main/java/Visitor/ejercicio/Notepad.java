package Visitor.ejercicio;

import java.util.Random;

public class Notepad implements IEditoresTexto{
    private String nombre;
    private String documento;

   // private int caracteres1 = new Random().nextInt()
    public Notepad(){}

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    @Override
    public void accept(IPlugin plugin) {
        System.out.println("caracteres del documento: "+documento.length());
        plugin.guardando(this);

    }
}

package Visitor.ejercicio;

import java.util.Random;

public class Word implements IEditoresTexto{
    private String nombre;

    private String documento;
    public Word(){}

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    @Override
    public void accept(IPlugin plugin) {
        System.out.println("caracteres del documento "+documento.length());
        plugin.guardando(this);
    }
}

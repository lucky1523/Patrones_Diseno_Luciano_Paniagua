package EjerciciosPreSegundoParcial.ejercicio5Mediator;

import java.util.LinkedList;
import java.util.List;

public class Grupo {
    List<Usuario> grupo = new LinkedList<>();
    String nombre;

    public Grupo(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getGrupo() {
        return grupo;
    }

    public void setGrupo(List<Usuario> grupo) {
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

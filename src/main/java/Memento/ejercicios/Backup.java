package Memento.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Backup {
    private String alias;
    private Persona persona;
    private List<Persona> personas = new ArrayList<>();

    public Backup(String alias, Persona persona,List<Persona> personas){
        this.alias=alias;
        this.persona=persona;
        this.personas=personas;

    }
    public void addPersonas(Persona persona){
        personas.add(persona);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int ciclo(){
        int y = 0;
        for (int i=0;i >= personas.size();i++){
            System.out.println("INFO Persona : " + personas.get(i).getNombre() + " edad "+personas.get(i).getEdad() +
                    " carnet "+personas.get(i).getCi());
        }
       return y;

    }

    public void info(){
        System.out.println("INFO Alias :" + alias);


        System.out.println("INFO Persona : " + personas.get(0).getNombre() + " edad "+personas.get(0).getEdad() +
                " carnet "+personas.get(0).getCi());
        System.out.println("INFO Persona : " + personas.get(1).getNombre() + " edad "+personas.get(1).getEdad() +
                " carnet "+personas.get(1).getCi());

    }
}

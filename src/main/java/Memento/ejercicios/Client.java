package Memento.ejercicios;


import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String []args){
        DataBase dataBase= new DataBase();
        DataBaseOriginator dataBaseOriginator= new DataBaseOriginator();

        Backup backup;

            Persona persona1 = new Persona();
            persona1.setCi("12345");
            persona1.setEdad("27");
            persona1.setNombre("Luis Garcia");

            Persona persona2 = new Persona();
            persona2.setCi("12356");
            persona2.setEdad("16");
            persona2.setNombre("Maria");

            List<Persona>listaPersonas = new ArrayList<>();
            listaPersonas.add(persona1);
            listaPersonas.add(persona2);

            Persona persona3 = new Persona();
            persona3.setCi("54321");
            persona3.setEdad("43");
            persona3.setNombre("Manuel Garcia");

            Persona persona4 = new Persona();
            persona4.setCi("16543");
            persona4.setEdad("65");
            persona4.setNombre("Gonzalo");

            List<Persona>listaPersonas2 = new ArrayList<>();
            listaPersonas2.add(persona3);
            listaPersonas2.add(persona4);

            Persona persona5 = new Persona();
            persona5.setCi("08754");
            persona5.setEdad("33");
            persona5.setNombre("Juan Perez");

            Persona persona6 = new Persona();
            persona6.setCi("76789");
            persona6.setEdad("12");
            persona6.setNombre("Marcela");

            List<Persona>listaPersonas3 = new ArrayList<>();
            listaPersonas3.add(persona1);
            listaPersonas3.add(persona2);

            Persona persona7 = new Persona();
            persona7.setCi("11111");
            persona7.setEdad("22");
            persona7.setNombre("Rodrigo Perez");

            Persona persona8 = new Persona();
            persona8.setCi("90898");
            persona8.setEdad("38");
            persona8.setNombre("Armando Paredes");

            List<Persona>listaPersonas4 = new ArrayList<>();
            listaPersonas4.add(persona1);
            listaPersonas4.add(persona2);

        backup= new Backup("mayo",persona1,listaPersonas);
        backup= new Backup("abril",persona3,listaPersonas2);
        dataBaseOriginator.setState(backup);
        dataBase.creandoCommit("abril", dataBaseOriginator.createVersion());
        backup= new Backup("junio",persona5,listaPersonas3);
        backup= new Backup("septiembre",persona1,listaPersonas);
        backup= new Backup("junio",persona7,listaPersonas4);

        dataBaseOriginator.restoreFromMemento(dataBase.getMemento("abril"));

    }

}

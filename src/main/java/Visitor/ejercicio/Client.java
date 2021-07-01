package Visitor.ejercicio;

public class Client {
    public static void main(String[]args){
        Word word = new Word();
        word.setNombre("TAREA 1 ");
        word.setDocumento("Hola soy word");
        Sublime sublime = new Sublime();
        sublime.setNombre("TAREA 2 ");
        sublime.setDocumento("Hola soy sublime");
        Notepad notepad= new Notepad();
        notepad.setNombre("TAREA 3 ");
        notepad.setDocumento("Hola soy notepad");


        ConcretePlugin concretePlugin= new ConcretePlugin();
        word.accept(concretePlugin);
        sublime.accept(concretePlugin);
        notepad.accept(concretePlugin);
    }
}

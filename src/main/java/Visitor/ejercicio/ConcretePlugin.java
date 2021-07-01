package Visitor.ejercicio;

public class ConcretePlugin implements IPlugin{
    @Override
    public void guardando(Word word) {
        System.out.println("Convirtiendi en PDF ---->" );
        System.out.println("Guardando documento word " + word.getNombre());
        System.out.println("Guardando caracteres: " + word.getDocumento().length());
    }

    @Override
    public void guardando(Notepad notepad) {
        System.out.println("Convirtiendi en PDF ---->" );
        System.out.println("Guardando documento word " + notepad.getNombre());
        System.out.println("Guardando caracteres: " + notepad.getDocumento().length());
    }

    @Override
    public void guardando(Sublime sublime) {
        System.out.println("Convirtiendi en PDF ---->" );
        System.out.println("Guardando documento word " + sublime.getNombre());
        System.out.println("Guardando caracteres: " + sublime.getDocumento().length());
    }
}

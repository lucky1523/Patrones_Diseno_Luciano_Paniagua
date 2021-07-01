package Visitor.ejercicio;


public interface IPlugin {
    void guardando(Word word);

    void guardando(Notepad notepad);
    void guardando(Sublime sublime);}

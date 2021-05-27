package Interpreter.ejercicios;

public class ClienteRomanos {
    public static void main (String []args){
        String interpretar = "I V X II";

        InterpreterSimbolos parser = new InterpreterSimbolos(interpretar);
        String interpretado=parser.interpretar();
        System.out.println(" Interpretar: "+interpretar);
        System.out.println(" Interpretado: "+interpretado);
    }
}

package Interpreter.ejercicios.userStory;

public class Cliente {
    public static void main (String []args){
        String interpretar = "Quiero Como";

        InterpreterWords parser = new InterpreterWords(interpretar);
        String interpretado = parser.interpretar();
        System.out.println(" Interpretar: "+interpretar);
        System.out.println(" Interpretado: "+interpretado);
    }
}

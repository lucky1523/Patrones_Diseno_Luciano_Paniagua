package Interpreter.ejercicios;

public class TerminalExpresionX extends AbstractExpresion{
    @Override
    public void interpreter(Contexto contexto) {
        if(contexto.input.startsWith("X")){
            contexto.output=contexto.output+" 10 ";
            contexto.input=contexto.input.substring(1);

        }

    }
}

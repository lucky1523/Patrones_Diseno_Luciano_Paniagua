package Interpreter.ejercicios;

public class TerminalExpresionV extends AbstractExpresion{
    @Override
    public void interpreter(Contexto contexto) {
        if(contexto.input.startsWith("V")){
            contexto.output=contexto.output+" 5 ";
            contexto.input=contexto.input.substring(1);

        }

    }
}

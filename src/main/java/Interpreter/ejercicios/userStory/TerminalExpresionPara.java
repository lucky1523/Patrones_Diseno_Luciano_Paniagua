package Interpreter.ejercicios.userStory;

public class TerminalExpresionPara extends AbstractExpresion{
    @Override
    public void interpreter(Contexto contexto) {
        if(contexto.input.startsWith("Para")){
            contexto.output=contexto.output+" Then ";
            contexto.input=contexto.input.substring(4);

        }
    }
}

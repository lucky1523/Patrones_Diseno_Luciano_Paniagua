package Interpreter.ejercicios.userStory;

public class TerminalExpresionComo extends AbstractExpresion{
    @Override
    public void interpreter(Contexto contexto) {
        if(contexto.input.startsWith("Como")){
            contexto.output=contexto.output+" Given ";
            contexto.input=contexto.input.substring(4);

        }
    }
}

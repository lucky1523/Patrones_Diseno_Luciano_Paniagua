package Interpreter.ejercicios.userStory;

public class TerminalExpresionQuiero extends AbstractExpresion{
    @Override
    public void interpreter(Contexto contexto) {
        if(contexto.input.startsWith("Quiero")){
            contexto.output=contexto.output+" When ";
            contexto.input=contexto.input.substring(5);

        }
    }
}

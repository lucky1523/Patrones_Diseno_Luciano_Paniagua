package Interpreter.ejercicios;


import java.util.ArrayList;
import java.util.List;

public class InterpreterSimbolos extends AbstractExpresion{
    private List<AbstractExpresion> parseTree= new ArrayList<>();
    private Contexto context;

    public InterpreterSimbolos(String word){
        this.interpretecion(word);
    }

    public void interpretecion(String numbers) {
        String input = numbers;
        context= new Contexto(input.replace(" ",""));
        for (String number : input.split(" ")) {
            switch (number){
                case "I":
                    parseTree.add(new TerminalExpresionI());
                    break;
                case "V":
                    parseTree.add(new TerminalExpresionV());
                    break;
                case "X":
                    parseTree.add(new TerminalExpresionX());
                    break;
                default:
                    break;
            }

        }
    }



    public String interpretar(){
        for (AbstractExpresion terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return  context.output;
    }
    @Override
    public void interpreter(Contexto contexto) {

    }
}

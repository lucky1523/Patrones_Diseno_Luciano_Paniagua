package Interpreter.ejercicios.userStory;
import java.util.ArrayList;
import java.util.List;
public class InterpreterWords extends AbstractExpresion{
    private List<AbstractExpresion> parseTree= new ArrayList<>();
    private Contexto context;

    public InterpreterWords(String word) {
        this.interpretecion(word);
    }
    public void interpretecion(String numbers) {
        String input = numbers;
        context= new Contexto(input.replace(" ",""));
        for (String number: input.split(" ")){
            switch (number){
                case "Como" :
                    parseTree.add(new TerminalExpresionComo());
                    break;
                case "Para" :
                    parseTree.add(new TerminalExpresionPara());
                    break;
                case "Quiero" :
                    parseTree.add(new TerminalExpresionQuiero());
                    break;
                default:

                    break;


            }

        }

    }
    public String interpretar(){
        for(AbstractExpresion terminalExpresion : parseTree){
            terminalExpresion.interpreter(context);

        }
        return context.output;
    }


    @Override
    public void interpreter(Contexto contexto) {

    }
}

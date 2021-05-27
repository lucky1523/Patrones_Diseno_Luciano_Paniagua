package Interpreter.ejercicios;

public class TerminalExpresionI extends AbstractExpresion{
    /*
            if (contexto.input.startsWith("A")){
            //la interpretacion de la letra/simbolo y lo agregamos al output
            contexto.output=contexto.output+"1";
            //el borrado de la letra/simbolo ya interpretadp en el input
            contexto.input=contexto.input.substring(1);

        }
     */
    @Override
    public void interpreter(Contexto contexto) {
        if(contexto.input.startsWith("I")){
            contexto.output=contexto.output+" 1 ";
            contexto.input=contexto.input.substring(1);

        }

    }
}

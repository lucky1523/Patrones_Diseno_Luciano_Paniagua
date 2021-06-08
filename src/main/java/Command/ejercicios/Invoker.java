package Command.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<IAcciones> commandList = new ArrayList<>();

    public Invoker(){}

    public void addCommand(IAcciones concreteCommand){
        commandList.add(concreteCommand);
    }

    public void executeCommand(){
        for (IAcciones command:commandList) {
            command.execute();
        }
        commandList.clear();
    }
}

package EjerciciosPreSegundoParcial.ejercicio3MementoYObserver;

public class Client {
    public static void main(String[] args) {

        Commit commits = new Commit();
        Originator originator = new Originator();

        Git git;

        git = new Git(1, "Syso");
        originator.setState(git);
        commits.addMemento(originator.createVersion());

        git = new Git(2, "Syso1");
        originator.setState(git);
        commits.addMemento(originator.createVersion());

        git = new Git(3, "Syso2");
        originator.setState(git);
        commits.addMemento(originator.createVersion());

        git = new Git(4, "Syso3");
        originator.setState(git);
        commits.addMemento(originator.createVersion());

        git = new Git(5, "Syso4");
        originator.setState(git);
        commits.addMemento(originator.createVersion());

        Desarrollador d1 = new Desarrollador("pepe");
        Desarrollador d2 = new Desarrollador("maria");
        Desarrollador d3 = new Desarrollador("rodri");

        originator.attach(d1);
        originator.attach(d2);
        originator.attach(d3);

        originator.restoreFromMemento(commits.getVersion(0));

        originator.deattach(d1);
        originator.deattach(d2);
        originator.deattach(d3);

        Desarrollador d4 = new Desarrollador("Jose");
        Desarrollador d5 = new Desarrollador("Andy");
        Desarrollador d6 = new Desarrollador("joseluis");

        originator.attach(d4);
        originator.attach(d5);
        originator.attach(d6);

        originator.restoreFromMemento(commits.getVersion(3));

    }
}

package EjerciciosPreSegundoParcial.ejercicio1Memento;

public class Originator {
    private Tesis state;

    public void setState(Tesis state) {
        System.out.println("**** Set State *****");
        state.showInfo();
        this.state = state;
    }

    public VersionTesis createVersion(){
        System.out.println("**** Create State *****");
        state.showInfo();;
        return new VersionTesis(this.state) ;
    }

    public void restoreFromMemento(VersionTesis version){
        this.state=version.getState();
        System.out.println("**** State Restored *****");
        this.state.showInfo();
    }
}
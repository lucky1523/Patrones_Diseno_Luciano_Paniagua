package Memento.ejercicios;


public class DataBaseOriginator {
    private Backup state;
    public DataBaseOriginator(){

    }

    public void setState(Backup state) {
        System.out.println("******* Set state *******");
        state.info();
        this.state = state;
    }

    public Memento createVersion(){
        System.out.println("******* create state *******");
        state.info();
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento){
        System.out.println("******* State Restored *******");
        this.state= memento.getState();
        this.state.info();
    }
}

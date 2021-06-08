package Command.ejercicios;

public class Atacar implements IAcciones{
    private Videojuego videojuego;

    public Atacar(Videojuego videojuego){
        this.videojuego=videojuego;
    }
    @Override
    public void execute() {
        System.out.println("atacando...");
        this.videojuego.atacar();
    }
}


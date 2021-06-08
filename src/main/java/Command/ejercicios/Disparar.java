package Command.ejercicios;

public class Disparar implements IAcciones{
    private Videojuego videojuego;

    public Disparar(Videojuego videojuego){
        this.videojuego=videojuego;
    }
    @Override
    public void execute() {
        System.out.println("disparando...");
        this.videojuego.disparar();
    }
}

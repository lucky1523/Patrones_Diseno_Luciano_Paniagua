package Command.ejercicios;

public class ModoDefensa implements IAcciones{
    private Videojuego videojuego;

    public ModoDefensa(Videojuego videojuego){
        this.videojuego=videojuego;
    }
    @Override
    public void execute() {
        System.out.println("activando modo defensa...");
        this.videojuego.modoDefensa();
    }
}

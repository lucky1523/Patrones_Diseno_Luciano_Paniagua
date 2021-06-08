package Command.ejercicios;

public class Videojuego {
    private String nombre = "Monster";
    private boolean freeToPlay;


    public Videojuego(String nombre, boolean freeToPlay){
        this.nombre = nombre;
        this.freeToPlay = freeToPlay;
    }

    public void showInfo(){
        System.out.println("version "+ nombre);
        System.out.println("isFreeVersion "+ freeToPlay);
    }

    public void disparar(){
        System.out.println("Command> disparar! ");
        this.showInfo();
    }
    public void modoDefensa(){
        System.out.println("Command> modo Defensa! " );
        this.showInfo();
    }
    public void atacar(){
        System.out.println("Command> atacar! " );
        this.showInfo();
    }



}

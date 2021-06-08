package Command.ejercicios;

public class Client {
    public static void main(String[]args){
        Videojuego videojuego = new Videojuego("Monster",true);
        Disparar disparar = new Disparar(videojuego);
        ModoDefensa modoDefensa = new ModoDefensa(videojuego);
        Atacar atacar = new Atacar(videojuego);

        Invoker makeBuild = new Invoker();

        makeBuild.addCommand(disparar);
        makeBuild.addCommand(modoDefensa);
        makeBuild.addCommand(atacar);

        makeBuild.executeCommand();

    }
}

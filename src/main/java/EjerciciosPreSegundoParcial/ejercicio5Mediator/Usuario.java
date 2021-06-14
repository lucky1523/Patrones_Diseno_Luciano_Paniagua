package EjerciciosPreSegundoParcial.ejercicio5Mediator;




public abstract class Usuario {
    protected ICanalDeComunicacion mediator;

    public Usuario(ICanalDeComunicacion mediator){
        this.mediator=mediator;
    }

    public abstract void sendPerson(String message,Usuario destino);

    public abstract void sendGroup(String message,String grupo);


    public abstract void messageReceived(String message);
}

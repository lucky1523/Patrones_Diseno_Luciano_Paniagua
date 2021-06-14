package EjerciciosPreSegundoParcial.ejercicio5Mediator;



public interface ICanalDeComunicacion {
    void send( String message, Usuario usuario);
    void sendGroup(String message, String nombreGrupo, Usuario Origen);

}
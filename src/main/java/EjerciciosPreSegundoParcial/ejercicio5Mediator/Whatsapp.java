package EjerciciosPreSegundoParcial.ejercicio5Mediator;


import java.util.LinkedList;
import java.util.List;

public class Whatsapp implements ICanalDeComunicacion{

    private List<Grupo> grupos = new LinkedList<Grupo>();

    public void addGrupo(Grupo grupo) {
        grupos.add(grupo);
    }
    @Override
    public void send(String message, Usuario usuario) {
        usuario.messageReceived(message);
    }

    @Override
    public void sendGroup(String message, String nombreGrupo, Usuario origen) {
        Grupo grupoActual = new Grupo("");
        for (Grupo grupoUsuarios : grupos) {
            if(grupoUsuarios.getNombre().equals(nombreGrupo)) {
                grupoActual=grupoUsuarios;
                break;
            }
        }
        for (Usuario usuario : grupoActual.getGrupo()) {
            if(!usuario.equals(origen)) {
                usuario.messageReceived(message);
            }
        }
    }


}
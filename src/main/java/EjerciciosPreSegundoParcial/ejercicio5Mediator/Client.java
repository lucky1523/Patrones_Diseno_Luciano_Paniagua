package EjerciciosPreSegundoParcial.ejercicio5Mediator;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Whatsapp whatsapp = new Whatsapp();

        Usuario u1 = new UsuarioDeWhatsapp(whatsapp, "Andres");
        Usuario u2 = new UsuarioDeWhatsapp(whatsapp, "Maria");
        Usuario u3 = new UsuarioDeWhatsapp(whatsapp, "Pepe");
        Usuario u4 = new UsuarioDeWhatsapp(whatsapp, "Abel");
        Usuario u5 = new UsuarioDeWhatsapp(whatsapp, "Juan");
        Usuario u6 = new UsuarioDeWhatsapp(whatsapp, "Alex");
        Usuario u7 = new UsuarioDeWhatsapp(whatsapp, "Conor");
        Usuario u8 = new UsuarioDeWhatsapp(whatsapp, "Luis");
        Usuario u9 = new UsuarioDeWhatsapp(whatsapp, "Andrea");
        Usuario u10 = new UsuarioDeWhatsapp(whatsapp, "Antonio");

        List<Usuario> lista1 = new LinkedList<>();

        lista1.add(u1);
        lista1.add(u2);
        lista1.add(u3);
        lista1.add(u4);
        lista1.add(u5);
        lista1.add(u6);
        lista1.add(u7);
        lista1.add(u8);
        lista1.add(u9);
        lista1.add(u10);

        Grupo grupo = new Grupo("Amigos");

        grupo.setGrupo(lista1);

        whatsapp.addGrupo(grupo);

        u1.sendPerson("hola", u2);

        u10.sendGroup("que tal!", grupo.getNombre());

    }
}

package EjerciciosPreUltimoParcial.Ejercicio4Proxy;

import java.util.LinkedList;
import java.util.List;

public class Proxy implements IServidor {
    List<Usuario> usuarios;
    IServidor servidor1;
    IServidor servidor2;
    int numeroUsuarios;

    public Proxy(IServidor servidor1, IServidor servidor2) {
        usuarios = new LinkedList<Usuario>();
        this.servidor1 = servidor1;
        this.servidor2 = servidor2;
        numeroUsuarios = 0;
    }

    public void registrar(String usuario, String contrasena) {
        numeroUsuarios++;
        usuarios.add(new Usuario(numeroUsuarios, usuario, contrasena));
    }

    @Override
    public void ingresar(String usuario, String password) {
        for (Usuario user : usuarios) {
            if (user.getUsuario().equals(usuario)) {
                if (user.getContrasena().equals(password)) {
                    if (user.id % 2 == 0) {
                        System.out.println("El servidor 2 en una acción");
                        servidor2.ingresar(usuario, password);
                    } else {
                        System.out.println("El servidor 1 en una acción");
                        servidor1.ingresar(usuario, password);
                    }
                } else {
                    System.out.println("Contraseña incorrecta");
                }
            }
        }

    }

}

package Bridge.ejercicioSinBridge;

public class Client {
    public static void main(String[] args) {

        IPlataforma linux = new Linux();
        linux.instalarlinux64();
        linux.instalarLinux86();
        linux.instalarWindows86();
        linux.instalarWindows128();
    }
}
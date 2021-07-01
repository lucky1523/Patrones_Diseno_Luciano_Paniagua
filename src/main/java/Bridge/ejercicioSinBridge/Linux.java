package Bridge.ejercicioSinBridge;



public class Linux implements IPlataforma {

    @Override
    public void instalarWindows86() {
        System.out.println("No se puede instalar");
    }

    @Override
    public void instalarWindows64() {
        System.out.println("No se puede instalar");    }

    @Override
    public void instalarlinux64() {
        System.out.println("instalando Linux 64");
    }

    @Override
    public void instalarLinux86() {
        System.out.println("instalando Linux 86");
    }

    @Override
    public void instalarWindows128() {
        System.out.println("No se puede instalar");
    }
}

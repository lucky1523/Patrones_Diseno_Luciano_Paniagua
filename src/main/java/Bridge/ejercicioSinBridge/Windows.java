package Bridge.ejercicioSinBridge;



public class Windows implements IPlataforma {

    @Override
    public void instalarWindows86() {
        System.out.println("instalando Windows 86");
    }

    @Override
    public void instalarWindows64() {
        System.out.println("instalando Windows 64");
    }

    @Override
    public void instalarlinux64() {
        System.out.println("No se puede instalar");
    }

    @Override
    public void instalarLinux86() {
        System.out.println("No se puede instalar");
    }

    @Override
    public void instalarWindows128() {
        System.out.println("instalando Windows 128");
    }
}

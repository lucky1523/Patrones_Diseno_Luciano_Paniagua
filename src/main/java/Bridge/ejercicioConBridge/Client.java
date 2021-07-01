package Bridge.ejercicioConBridge;

public class Client {
    public static void main(String[]args){
        IPlataforma windows = new Windows(new WindowsX64());
        windows.nuevaArquitectura();

        IPlataforma linux = new Linux(new LinuxX64());
        linux.nuevaArquitectura();

        IPlataforma windows2 = new Windows(new WindowsX128());
        windows2.nuevaArquitectura();
    }
}

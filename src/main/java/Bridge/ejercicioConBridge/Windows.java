package Bridge.ejercicioConBridge;

public class Windows implements IPlataforma{
    private IArquitectura arquitectura;
    public Windows(IArquitectura arquitectura){
        this.arquitectura=arquitectura;
    }
    @Override
    public void nuevaArquitectura() {
        System.out.println("Agregando... ");
        arquitectura.Arquitecura();
    }
}

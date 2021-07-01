package Bridge.ejercicioConBridge;

public class Linux implements IPlataforma{
    private IArquitectura arquitectura;
    public Linux(IArquitectura arquitectura){
        this.arquitectura=arquitectura;
    }
    @Override
    public void nuevaArquitectura() {
        System.out.println("Agregando... ");
        arquitectura.Arquitecura();
    }
}

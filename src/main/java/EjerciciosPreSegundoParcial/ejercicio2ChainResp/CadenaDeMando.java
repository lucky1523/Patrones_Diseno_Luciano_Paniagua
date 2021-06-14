package EjerciciosPreSegundoParcial.ejercicio2ChainResp;


public class CadenaDeMando implements IEjercito {
    private IEjercito next;

    @Override
    public void setNext(IEjercito iejercito) {
        this.next = iejercito;
    }

    @Override
    public IEjercito next() {
        return next;
    }

    @Override
    public void accion(String accion) {
        General general = new General();
        this.setNext(general);

        Teniente teniente = new Teniente();
        general.setNext(teniente);

        Coronel coronel = new Coronel();
        teniente.setNext(coronel);

        Cabo cabo = new Cabo();
        coronel.setNext(cabo);

        this.next.accion(accion);
    }

}

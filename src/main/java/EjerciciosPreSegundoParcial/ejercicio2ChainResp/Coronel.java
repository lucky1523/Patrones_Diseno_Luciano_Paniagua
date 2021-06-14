package EjerciciosPreSegundoParcial.ejercicio2ChainResp;
public class Coronel implements IEjercito {
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
        if (accion.equals("Desbloqueos")) {
            System.out.println("El Coronel esta desbloqueando caminos");
        } else if (accion.equals("Manifestaciones")) {
            System.out.println("El Coronel esta ayudando en la manifestaciones");
        } else {
            this.next.accion(accion);
        }

    }

}

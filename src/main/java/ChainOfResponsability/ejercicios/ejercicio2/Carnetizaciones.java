package ChainOfResponsability.ejercicios.ejercicio2;

public class Carnetizaciones implements ICarnetizacion{
    private ICarnetizacion next;
    @Override
    public void setNext(ICarnetizacion handler) {
        this.next=handler;
    }

    @Override
    public ICarnetizacion next() {
        return this.next;
    }

    @Override
    public void realizarCarnetizacion(Carnetizacion carnetizacion) {
        ResponsableCarnetizacion responsableCarnetizacion = new ResponsableCarnetizacion();
        this.setNext(responsableCarnetizacion);

        Notario notario = new Notario();
        responsableCarnetizacion.setNext(notario);

        Cajero cajero = new Cajero();
        notario.setNext(cajero);

        AyudaAlCliente ayudaAlCliente = new AyudaAlCliente();
        cajero.setNext(ayudaAlCliente);

        this.next.realizarCarnetizacion(carnetizacion);
    }
}

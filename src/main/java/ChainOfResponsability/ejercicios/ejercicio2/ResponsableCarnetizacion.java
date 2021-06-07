package ChainOfResponsability.ejercicios.ejercicio2;

public class ResponsableCarnetizacion implements ICarnetizacion{

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
        if ( carnetizacion.isCertificadoDeNacimiento() && carnetizacion.isFicha() && carnetizacion.isPagoAlBanco()){
            //logica o algoritmos
            System.out.println("INFO> El responsable de la carnetizacion lo hara" );

        } else {
            this.next.realizarCarnetizacion(carnetizacion);

        }
    }
}

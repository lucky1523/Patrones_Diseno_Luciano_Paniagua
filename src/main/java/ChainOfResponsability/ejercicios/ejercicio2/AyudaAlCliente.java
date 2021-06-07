package ChainOfResponsability.ejercicios.ejercicio2;

public class AyudaAlCliente implements ICarnetizacion{

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
        if (( (carnetizacion.isCertificadoDeNacimiento()==false) && (carnetizacion.isFicha()==false) ) ||
                ((carnetizacion.isFicha()==false)&&(carnetizacion.isPagoAlBanco()==false)) ||
                ((carnetizacion.isCertificadoDeNacimiento()==false)&&(carnetizacion.isPagoAlBanco()==false))){
            //logica o algoritmos
            System.out.println("INFO> Ayuda al cliente sera el encargado" );

        } else {
            System.out.println("Sus datos no concuerdan en la busqueda de ayuda");
        }
    }
}
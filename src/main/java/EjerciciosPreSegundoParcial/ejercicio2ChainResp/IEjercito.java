package EjerciciosPreSegundoParcial.ejercicio2ChainResp;

public interface IEjercito {
    void setNext(IEjercito iejercito);
    IEjercito next();
    void accion (String accion);
}

package ChainOfResponsability.ejercicios.ejercicio2;

import ChainOfResponsability.ejercicios.Solicitud;

public interface ICarnetizacion {
    void setNext(ICarnetizacion handler); // saber el siguiente responsable
    ICarnetizacion next();      //ir al siguiente responsable
    void realizarCarnetizacion(Carnetizacion carnetizacion);     //resolver o moverse al siguiente responsable

}
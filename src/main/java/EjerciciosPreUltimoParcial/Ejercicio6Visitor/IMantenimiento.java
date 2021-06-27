package EjerciciosPreUltimoParcial.Ejercicio6Visitor;

public interface IMantenimiento {
    void mantenimiento(Celular celular);

    void mantenimiento(Computadora computadora);

    void mantenimiento(Televisor televisor);

}

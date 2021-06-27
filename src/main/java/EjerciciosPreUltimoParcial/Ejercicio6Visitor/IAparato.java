package EjerciciosPreUltimoParcial.Ejercicio6Visitor;

public interface IAparato {
    public void mostrarInfo();

    public void recibirMantenimiento(IMantenimiento mantenimiento);
}
package EjerciciosPreUltimoParcial.Ejercicio1Decorator;

public interface IPersonaje {
    public String nombre();

    public int nivel();

    public void subirNivel(int niveles);

    public String armas();

    public void equiparArma(String arma);

    public int porcentajeArmadura();

    public void aumentarArmadura(int porcentaje);

    public int puntosAtaque();

    public void aumentarAtaque(int puntos);

    public int puntosDefensa();

    public void aumentarDefensa(int puntos);

    public int puntosRegeneracion();

    public void aumentarRegeneracion(int puntos);

    public void info();

}
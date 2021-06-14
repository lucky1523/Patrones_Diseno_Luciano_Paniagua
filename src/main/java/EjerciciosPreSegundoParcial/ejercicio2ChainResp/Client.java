package EjerciciosPreSegundoParcial.ejercicio2ChainResp;


public class Client {
    public static void main(String[] args) {
        CadenaDeMando cadenaDeMando = new CadenaDeMando();

        cadenaDeMando.accion("Manifestaciones");
        cadenaDeMando.accion("Arrestar");
        cadenaDeMando.accion("Entrevistas");
        cadenaDeMando.accion("Disciplina");
        cadenaDeMando.accion("Desbloqueos");
        cadenaDeMando.accion("Limpiezas");


    }
}

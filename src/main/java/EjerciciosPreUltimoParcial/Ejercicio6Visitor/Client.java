package EjerciciosPreUltimoParcial.Ejercicio6Visitor;

public class Client {

    public static void main(String[] args) {
        Celular celular = new Celular("Huawei", "64Gb", "30 Mpx", "4Gb", "Android");
        Computadora computadora = new Computadora("Lenovo idea", "512Gb", "15Gb");
        Televisor televisor = new Televisor("LG", "High Quality", "2 años", true);

        AplicMantenimiento app = new AplicMantenimiento();

        celular.recibirMantenimiento(app);
        computadora.recibirMantenimiento(app);
        televisor.recibirMantenimiento(app);


    }

}

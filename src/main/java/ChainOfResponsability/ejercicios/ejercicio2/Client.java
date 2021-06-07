package ChainOfResponsability.ejercicios.ejercicio2;



public class Client {

    public static void main (String []ar){
        Carnetizaciones carnetizaciones = new Carnetizaciones();

        carnetizaciones.realizarCarnetizacion(new Carnetizacion(true,true,true));
        carnetizaciones.realizarCarnetizacion(new Carnetizacion(false,true,true));
        carnetizaciones.realizarCarnetizacion(new Carnetizacion(true,false,true));
        carnetizaciones.realizarCarnetizacion(new Carnetizacion(false,false,false));


    }

}
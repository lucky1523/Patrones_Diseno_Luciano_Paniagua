package FactoryMethod.ejercicios;


public class Client {
    public  static void main (String[]args){
        PasajeSolidario pasaje1 = (PasajeSolidario) new CreatorPasajeSolidario().create();
        pasaje1.setNumeroAsiento("235");
        pasaje1.setNombrePasajero("Marcos salinas");
        pasaje1.crear();

        PasajeSolidario pasaje2 = (PasajeSolidario) new CreatorPasajeSolidario().create();
        pasaje2.setNumeroAsiento("435");
        pasaje2.setNombrePasajero("Estefany salazar");
        pasaje2.crear();

        PasajeEstandar pasaje3 = (PasajeEstandar) new CreatorPasajeEstandar().create();
        pasaje3.setNumeroAsiento("767");
        pasaje3.setNombrePasajero("Karina Torrez");
        pasaje3.crear();

        PasajeEstandar pasaje4 = (PasajeEstandar) new CreatorPasajeEstandar().create();
        pasaje4.setNumeroAsiento("233");
        pasaje4.setNombrePasajero("Esteban Quito");
        pasaje4.crear();

        PasajeInfantil pasaje5 = (PasajeInfantil) new CreatorPasajeInfantil().create();
        pasaje5.setNumeroAsiento("113");
        pasaje5.setNombrePasajero("Ignacio Perez");
        pasaje5.crear();


        PasajeInfantil pasaje6 = (PasajeInfantil) new CreatorPasajeInfantil().create();
        pasaje6.setNumeroAsiento("563");
        pasaje6.setNombrePasajero("Mario Avila");
        pasaje6.crear();





    //    PasajeSolidario pasaje3 = (PasajeSolidario) new CreatorPasajeSolidario().create();
     //       Pasajero pasajero1 = (Pasajero) new CreatorPasajero().create();
      //      pasajero1.setNombre("Marcos salinas");
        //    pasajero1.setCi("12343455");
          //  pasaje3.setNumeroAsiento("245");
       // pasaje3.setPasajero(pasajero1);
       // pasaje3.crear();


    }
}

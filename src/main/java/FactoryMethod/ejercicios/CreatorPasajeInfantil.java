package FactoryMethod.ejercicios;

public class CreatorPasajeInfantil extends CreatorPasajes{
    @Override
    public IPasaje create() {
        Origen origen = new Origen();
        origen.setAeropuerto("Miami Int Airport");
        origen.setCiudad("Miami");
        origen.setPais("EEUU");

        Destino destino = new Destino();
        destino.setAeropuerto("El Alto");
        destino.setCiudad("La Paz");
        destino.setPais("Bolivia");

        Avion avion = new Avion();
        avion.setCapacidad("250");
        avion.setMarca("Boeing");
        avion.setModelo("101");
        avion.setNumeroDeAsientos("250");

        Pasajero pasajero = new Pasajero();
        pasajero.setCi("xxxxx");
        pasajero.setNombre("xxxxxx");


        PasajeInfantil pasajeInfantil = new PasajeInfantil();
        pasajeInfantil.setCostoEspecial("100 bs");
        pasajeInfantil.setAvion(avion);
        pasajeInfantil.setPasajero(pasajero);
        pasajeInfantil.setDestino(destino);
        pasajeInfantil.setOrigen(origen);
        pasajeInfantil.setNumeroVuelo("321");
        pasajeInfantil.setNumeroAsiento("000");
        return pasajeInfantil;

    }
}

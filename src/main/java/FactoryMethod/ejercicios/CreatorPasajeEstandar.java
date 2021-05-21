package FactoryMethod.ejercicios;

public class CreatorPasajeEstandar extends CreatorPasajes{
    @Override
    public IPasaje create() {
        Origen origen = new Origen();
        origen.setAeropuerto("Viru Viru");
        origen.setCiudad("Santa cruz");
        origen.setPais("Bolivia");

        Destino destino = new Destino();
        destino.setAeropuerto("El Alto");
        destino.setCiudad("La Paz");
        destino.setPais("Bolivia");

        Avion avion = new Avion();
        avion.setCapacidad("200");
        avion.setMarca("Boeing");
        avion.setModelo("707");
        avion.setNumeroDeAsientos("200");

        Pasajero pasajero = new Pasajero();
        pasajero.setCi("xxxxx");
        pasajero.setNombre("xxxxxx");


        PasajeEstandar pasajeEstandar = new PasajeEstandar();
        pasajeEstandar.setCostoDePasaje("350 bs");
        pasajeEstandar.setAvion(avion);
        pasajeEstandar.setPasajero(pasajero);
        pasajeEstandar.setDestino(destino);
        pasajeEstandar.setOrigen(origen);
        pasajeEstandar.setNumeroVuelo("123");
        pasajeEstandar.setNumeroAsiento("000");
        return pasajeEstandar;

    }
}

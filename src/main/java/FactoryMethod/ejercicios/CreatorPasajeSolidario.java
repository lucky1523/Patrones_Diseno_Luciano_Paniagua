package FactoryMethod.ejercicios;

public class CreatorPasajeSolidario extends CreatorPasajes{
    @Override
    public IPasaje create() {
        Origen origen = new Origen();
        origen.setAeropuerto("Tokio Int Airport");
        origen.setCiudad("Tokio");
        origen.setPais("Japon");

        Destino destino = new Destino();
        destino.setAeropuerto("Miami Int Airport");
        destino.setCiudad("Miami");
        destino.setPais("EEUU");

        Avion avion = new Avion();
        avion.setCapacidad("400");
        avion.setMarca("Boeing");
        avion.setModelo("203");
        avion.setNumeroDeAsientos("400");

        Pasajero pasajero = new Pasajero();
        pasajero.setCi("xxxxx");
        pasajero.setNombre("xxxxxx");


        PasajeSolidario pasajeSolidario = new PasajeSolidario();
        pasajeSolidario.setCostoDePasaje("300 bs");
        pasajeSolidario.setAvion(avion);
        pasajeSolidario.setPasajero(pasajero);
        pasajeSolidario.setDestino(destino);
        pasajeSolidario.setOrigen(origen);
        pasajeSolidario.setNumeroVuelo("213");
        pasajeSolidario.setNumeroAsiento("000");
        pasajeSolidario.setDescuento("100bs");
        pasajeSolidario.setMotivoDeDescuento("Discapacidad");
        return pasajeSolidario;

    }
}


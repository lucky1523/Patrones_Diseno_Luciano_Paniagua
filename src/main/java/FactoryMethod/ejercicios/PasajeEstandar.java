package FactoryMethod.ejercicios;

public class PasajeEstandar implements IPasaje{

    private String numeroVuelo;
    private String numeroAsiento;
    private String costoDePasaje;
    private Destino destino;
    private Origen origen;
    private Avion avion;
    private Pasajero pasajero;
    private String nombrePasajero;

    public PasajeEstandar(){
        destino = new Destino();
        origen = new Origen();
        avion = new Avion();
        pasajero = new Pasajero();
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getCostoDePasaje() {
        return costoDePasaje;
    }

    public void setCostoDePasaje(String costoDePasaje) {
        this.costoDePasaje = costoDePasaje;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    @Override
    public void crear() {
        System.out.println("numeroAsiento: "+numeroAsiento);
        System.out.println("numeroVuelo: "+numeroVuelo);
        System.out.println("costoDePasaje: "+costoDePasaje);
        System.out.println("nombrePasajero: "+nombrePasajero);
        destino.showInfo();
        origen.showInfo();
        avion.showInfo();
        pasajero.showInfo();
    }
}

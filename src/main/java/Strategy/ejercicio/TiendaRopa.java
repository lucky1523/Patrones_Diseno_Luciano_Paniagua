package Strategy.ejercicio;



public class TiendaRopa {
    private IEstrategiaVenta estrategiaVenta;
    private Ropa ropa;
    private String tipoDeRopa;

    public  TiendaRopa(){}

    public Ropa getRopa() {
        return ropa;
    }

    public void setRopa(Ropa ropa) {
        this.ropa = ropa;
    }

    public IEstrategiaVenta getEstrategiaVenta() {
        return estrategiaVenta;
    }

    public void setEstrategiaVenta(IEstrategiaVenta estrategiaVenta) {
        this.estrategiaVenta = estrategiaVenta;
    }

    public String getTipoDeRopa() {
        return tipoDeRopa;
    }

    public void setTipoDeRopa(String tipoDeRopa) {
        this.tipoDeRopa = tipoDeRopa;
    }

    public void establecerTemporada(){
        this.estrategiaVenta.vender(this.ropa);
    }
}

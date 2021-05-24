package AbstractFactory.ejercicios.HeladeriaAbstract;



public class HeladoMixto extends Helados{

    private String tamano;
    private String forma;
    private Fruta fruta;
    private Base base;
    private Crema crema;
    private String costo;

    public HeladoMixto() {
        fruta = new Fruta();
        base = new Base();
        crema = new Crema();
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Crema getCrema() {
        return crema;
    }

    public void setCrema(Crema crema) {
        this.crema = crema;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    @Override
    public void crearHelado(String helado) {
        System.out.println("Helado Mixto - tamano: "+tamano);
        System.out.println("Helado Mixto - forma: "+forma);
        System.out.println("Helado Mixto - costo: "+costo);

        fruta.showInfo();
        base.showInfo();
        crema.showInfo();
    }
}
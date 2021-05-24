package AbstractFactory.ejercicios.HeladeriaAbstract;

public class HeladoAgua extends Helados{
    private String tamano;
    private String forma;
    private Fruta fruta;
    private Base base;
    public HeladoAgua(){
        fruta = new Fruta();
        base = new Base();
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

    @Override
    public void crearHelado(String helado) {
        System.out.println("Helado De Agua - tamano: "+tamano);
        System.out.println("Helado De Agua - forma: "+forma);
        fruta.showInfo();
        base.showInfo();
    }
}

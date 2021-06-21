package Adapter.ejercicios;

public class RefrigeradorAdaptada implements IElectronicosPequenos{
    private Refrigeradores refrigerador;
    public RefrigeradorAdaptada(Refrigeradores refrigerador){
        this.refrigerador = refrigerador;

    }
    @Override
    public void prenderElectronico() {

        System.out.println("Adaptando Refrigerador a la familia de Electronicos pequeños");
        this.refrigerador.iniciarArtefacto();
    }

    @Override
    public void comprarElectronico() {
        System.out.println("Adaptando Refrigerador a la familia de Electronicos pequeños");
        this.refrigerador.adquirirArtefacto();

    }
}

package Adapter.ejercicios;

public class LavadoraAdaptada implements IElectronicosPequenos{
    private Lavadoras lavadora;
    public LavadoraAdaptada(Lavadoras lavadora){
        this.lavadora=lavadora;

    }
    @Override
    public void prenderElectronico() {

        System.out.println("Adaptando Lavadora a la familia de Electronicos pequeños");
        this.lavadora.iniciarArtefacto();
    }

    @Override
    public void comprarElectronico() {
        System.out.println("Adaptando Lavadora a la familia de Electronicos pequeños");
        this.lavadora.adquirirArtefacto();

    }
}

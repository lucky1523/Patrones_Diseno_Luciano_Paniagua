package Adapter.ejercicios;

public class TelevisorAdaptada implements IElectronicosPequenos{
    private Televisores televisor;
    public TelevisorAdaptada(Televisores televisor){
        this.televisor = televisor;

    }
    @Override
    public void prenderElectronico() {

        System.out.println("Adaptando Televisor a la familia de Electronicos pequeños");
        this.televisor.iniciarArtefacto();
    }

    @Override
    public void comprarElectronico() {
        System.out.println("Adaptando Televisor a la familia de Electronicos pequeños");
        this.televisor.adquirirArtefacto();

    }
}

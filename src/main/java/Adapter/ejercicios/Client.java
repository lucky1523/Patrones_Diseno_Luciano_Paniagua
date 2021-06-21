package Adapter.ejercicios;

public class Client {
    public static void main(String[]args){
        Lavadoras lavadora1 = new Lavadoras(100,"1 año");
        Refrigeradores refrigerador1 = new Refrigeradores(200,"1año");
        Televisores televisor1 = new Televisores(75,"5 años");
        Computadoras computadora1 = new Computadoras(50,"2 años");
        Celulares celular1 = new Celulares(25,"3 años");
        Tablets tablet1 = new Tablets(35,"2 años");

        computadora1.comprarElectronico();
        computadora1.prenderElectronico();

        System.out.println("****************");
        // ADAPTANDO LAVADORA
        LavadoraAdaptada lavadoraAdaptada = new LavadoraAdaptada(lavadora1);
        lavadoraAdaptada.prenderElectronico();
        lavadoraAdaptada.comprarElectronico();

        System.out.println("****************");

        // ADAPTANDO REFRIGERADOR
        RefrigeradorAdaptada refrigeradorAdaptada = new RefrigeradorAdaptada(refrigerador1);
        refrigeradorAdaptada.prenderElectronico();
        refrigeradorAdaptada.comprarElectronico();

        System.out.println("****************");

        // ADAPTANDO TELEVISOR
        TelevisorAdaptada televisorAdaptada = new TelevisorAdaptada(televisor1);
        televisorAdaptada.prenderElectronico();
        televisorAdaptada.comprarElectronico();


    }

}

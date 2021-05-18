package Singleton.ejercicios;

public class LibreCamb {
    public LibreCamb(){

    }

    public void cambiarDinero(String TypeOfMoney, String TypeOfMoneyWanted, double amount){
        System.out.println("Dinero "+ TypeOfMoney + amount + "a" + TypeOfMoneyWanted);
        Singleton.ejercicios.Empresa.getInstance().getAmount(TypeOfMoney,TypeOfMoneyWanted,amount);
    }
}

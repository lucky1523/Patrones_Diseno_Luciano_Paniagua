package Singleton.ejercicios;

public class Empresa {
    private static Empresa instance = null;


    private Empresa(){

        System.out.println("***** Creando empresa");
    }

    public static synchronized Empresa getInstance(){
        if (instance == null)
            instance = new Empresa();
        return instance;
    }

    public double getAmount(String TypeOfMoney, String TypeOfMoneyWanted, double amount){
        if (TypeOfMoney.equals("euro") && TypeOfMoneyWanted.equals("dolar")){
            amount=amount*1.22;
        }else if (TypeOfMoney.equals("dolar")&&TypeOfMoneyWanted.equals("euro")) {
            amount=amount*0.82;
        } else if (TypeOfMoney.equals("dolar")&&TypeOfMoneyWanted.equals("boliviano")){
            amount=amount*6.89;
        }  else if (TypeOfMoney.equals("boliviano")&&TypeOfMoneyWanted.equals("dolar")){
            amount=amount*0.15;
        } else if (TypeOfMoney.equals("euro")&&TypeOfMoneyWanted.equals("boliviano")){
            amount=amount*8.43;
        }  else if (TypeOfMoney.equals("boliviano")&&TypeOfMoneyWanted.equals("euro")){
           amount=amount*0.12;
        }
        System.out.println("Tu cantidad es:"+amount+ " "+TypeOfMoneyWanted);
        return amount;
    }
}

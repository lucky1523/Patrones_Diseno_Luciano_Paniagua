package Singleton.ejercicios;


import Singleton.ejercicios.LibreCamb;
import Singleton.ejercicios.Banco;
import Singleton.ejercicios.CasaCambio;

public class Client {
    public static void main(String[] args) {
        Empresa.getInstance().getAmount("boliviano","dolar",350);
        Banco BancoLaPaz = new Banco();
        BancoLaPaz.cambiarDinero("euro","dolar",350);
        LibreCamb andres = new LibreCamb();
        andres.cambiarDinero("dolar","euro",350);
        CasaCambio casaDeCambio = new CasaCambio();
        casaDeCambio.cambiarDinero("dolar","euro",350);


    }

}


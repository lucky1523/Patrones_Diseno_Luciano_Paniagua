package Decorator.ejercicios;

public class Client {
    public static void main(String[] args) {
        Banco cuentaBanco1 = new CuentaBanco(300, "Juan");
        Banco cuentaBanco2 = new CuentaBanco(750, "José");
        Banco cuentaBanco3 = new CuentaBanco(1000, "Luis");

        cuentaBanco1 = new Promocion(cuentaBanco1);


        cuentaBanco2 = new BancaPorInternet(cuentaBanco2);
        ((BancaPorInternet)cuentaBanco2).enable();


        cuentaBanco3 = new SeguroCuenta(cuentaBanco3);

        cuentaBanco1.showData();
        cuentaBanco2.showData();
        cuentaBanco3.showData();
    }
}

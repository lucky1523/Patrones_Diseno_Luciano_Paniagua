package AbstractFactory.ejercicios.HeladeriaAbstract;

public class FactoryHelados {

    public enum typeHelados{
        HeladoAgua,HeladoCrema,HeladoMixto
    }
    public static Helados make(typeHelados type){
        Helados helados;
        switch (type){
            case HeladoAgua:
                helados = new HeladoAgua();

                break;
            case HeladoCrema:
                helados= new HeladoCrema();
                break;
            case HeladoMixto:
                helados= new HeladoMixto();
                break;
            default:
                helados= new HeladoAgua();
                break;
        }
        return helados;
    }
}

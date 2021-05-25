package Builder.ejercicios;

public abstract class BuilderPizza {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }
    public void createPizza(){
        pizza= new Pizza();
    }

    public abstract void ingredientes();
    public abstract void tipoDeMasa();
    public abstract void tipoDeQueso();
}

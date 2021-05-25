package Builder.ejercicios;

public class Cocinero {
    private BuilderPizza builderPizza;

    public void setBuilderPizza(BuilderPizza builderPizza) {
        this.builderPizza = builderPizza;
    }

    public Pizza getBuilderPizza() {
        return builderPizza.getPizza();
    }

    public void cocinarpizza(){
        this.builderPizza.createPizza();
        this.builderPizza.ingredientes();
        this.builderPizza.tipoDeQueso();
        this.builderPizza.tipoDeMasa();

    }
}

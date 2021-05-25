package Builder.ejercicios;

public class PizzaClasica extends BuilderPizza{
    @Override
    public void ingredientes() {
        pizza.setIngredientes("Salsa de tomate, Oregano, Jamon");
    }

    @Override
    public void tipoDeMasa() {
        pizza.setTipoDeMasa("delgada");

    }

    @Override
    public void tipoDeQueso() {
        pizza.setTipoDeQueso("mozzarella");

    }
}

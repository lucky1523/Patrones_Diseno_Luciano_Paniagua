package Builder.ejercicios;

public class PizzaHawaiana extends BuilderPizza{
    @Override
    public void ingredientes() {
        pizza.setIngredientes("piña, Salsa de tomate, Cherries, Jamon");
    }

    @Override
    public void tipoDeMasa() {
        pizza.setTipoDeMasa("crujiente");

    }

    @Override
    public void tipoDeQueso() {
        pizza.setTipoDeQueso("Parmesano");

    }
}

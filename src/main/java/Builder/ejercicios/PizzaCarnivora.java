package Builder.ejercicios;

public class PizzaCarnivora extends BuilderPizza{
    @Override
    public void ingredientes() {
        pizza.setIngredientes("Carne, Salsa de tomate, Salami y Salchicha");
    }

    @Override
    public void tipoDeMasa() {
        pizza.setTipoDeMasa("gruesa");

    }

    @Override
    public void tipoDeQueso() {
        pizza.setTipoDeQueso("regular");

    }
}

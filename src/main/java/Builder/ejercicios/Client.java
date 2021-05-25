package Builder.ejercicios;

public class Client {

    public static void main (String []args) {
        Cocinero Juan = new Cocinero();
        PizzaCarnivora pizzaCarnivora = new PizzaCarnivora();
        PizzaClasica pizzaClasica= new PizzaClasica();
        PizzaHawaiana pizzaHawaiana = new PizzaHawaiana();

        Juan.setBuilderPizza(pizzaCarnivora);
        Juan.cocinarpizza();

        Pizza pizzaCarnivora1 = Juan.getBuilderPizza();
        pizzaCarnivora1.showData();

        Juan.setBuilderPizza(pizzaClasica);
        Juan.cocinarpizza();

        Pizza pizzaClasica2 = Juan.getBuilderPizza();
        pizzaClasica2.showData();

        Juan.setBuilderPizza(pizzaHawaiana);
        Juan.cocinarpizza();

        Pizza pizzaHawaiana3 = Juan.getBuilderPizza();
        pizzaHawaiana3.showData();



    }
}

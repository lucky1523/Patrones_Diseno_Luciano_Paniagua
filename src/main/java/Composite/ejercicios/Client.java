package Composite.ejercicios;

public class Client {
    public static void main (String[] args){
        Computadora cpu1 = new Computadora("Componente1");
        Computadora cpu2 = new Computadora("Componente2");
        Computadora cpu3 = new Computadora("Componente3");

        cpu1.setPrecio(100);
        cpu2.setPrecio(100);
        cpu3.setPrecio(100);

        Composite laboratorio1 =new Composite("Laboratorio 1");
        laboratorio1.add(cpu1);
        laboratorio1.add(cpu2);
        laboratorio1.add(cpu3);

        Composite laboratorio2 =new Composite("Laboratorio 2");
        laboratorio2.add(cpu1);
        laboratorio2.add(cpu2);
        laboratorio2.add(cpu3);

        Composite Laboratorio3 =new Composite("Laboratorio 3");
        Laboratorio3.add(cpu1);
        Laboratorio3.add(cpu2);
        Laboratorio3.add(cpu3);

        Composite contenedor1 = new Composite("Contenedor 1");
        contenedor1.add(laboratorio1);
        contenedor1.add(laboratorio2);
        contenedor1.add(Laboratorio3);

        contenedor1.totalEstimacion();
    }

}
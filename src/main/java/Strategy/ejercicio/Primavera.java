package Strategy.ejercicio;

public class Primavera implements IEstrategiaVenta{
    @Override
    public void vender(Ropa ropa) {
        if (ropa.getEstacion().toLowerCase().equals("primavera")){
            ropa.setPrecio(ropa.getPrecio());
            ropa.showInfo();
        }
    }
}

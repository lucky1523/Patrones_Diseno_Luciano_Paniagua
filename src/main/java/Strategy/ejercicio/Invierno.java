package Strategy.ejercicio;

public class Invierno implements IEstrategiaVenta{
    @Override
    public void vender(Ropa ropa) {
        if (ropa.getEstacion().toLowerCase().equals("invierno")){
            double precioModificado= ropa.getPrecio()*0.10;
            ropa.setPrecio(ropa.getPrecio()+precioModificado);
            ropa.showInfo();
        }
    }
}

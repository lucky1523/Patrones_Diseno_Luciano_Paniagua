package Strategy.ejercicio;

public class Otono implements IEstrategiaVenta{
    @Override
    public void vender(Ropa ropa) {
        if (ropa.getEstacion().toLowerCase().equals("otono")){
            double precioModificado= ropa.getPrecio()*0.5;
            ropa.setPrecio(ropa.getPrecio()-precioModificado);
            ropa.showInfo();
        }
    }

}

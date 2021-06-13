package Strategy.ejercicio;

public class Verano implements IEstrategiaVenta{
    @Override
    public void vender(Ropa ropa) {
        if (ropa.getEstacion().toLowerCase().equals("verano")){
            double precioModificado= ropa.getPrecio()*0.10;
            ropa.setPrecio(ropa.getPrecio()-precioModificado);
            ropa.showInfo();
        }
    }

}

package EjerciciosPreUltimoParcial.Ejercicio6Visitor;

public class Televisor implements IAparato {
    private String modelo;
    private String resolucion;
    private String garantia;
    private boolean smart;

    public Televisor(String modelo, String resolucion, String garantia, boolean smart) {
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.garantia = garantia;
        this.smart = smart;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Resolucion: " + resolucion);
        System.out.println("Garantis: " + garantia);
        System.out.println("Es smart: " + smart);

    }

    @Override
    public void recibirMantenimiento(IMantenimiento mantenimiento) {
        mantenimiento.mantenimiento(this);

    }

}

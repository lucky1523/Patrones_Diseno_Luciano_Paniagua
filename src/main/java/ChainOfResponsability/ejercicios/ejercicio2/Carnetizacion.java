package ChainOfResponsability.ejercicios.ejercicio2;

public class Carnetizacion {

    private boolean certificadoDeNacimiento;
    private boolean pagoAlBanco;
    private boolean ficha;


    public Carnetizacion(boolean certificadoDeNacimiento,boolean pagoAlBanco,boolean ficha){
        this.certificadoDeNacimiento=certificadoDeNacimiento;
        this.pagoAlBanco=pagoAlBanco;
        this.ficha=ficha;
    }

    public boolean isCertificadoDeNacimiento() {
        return certificadoDeNacimiento;
    }

    public void setCertificadoDeNacimiento(boolean certificadoDeNacimiento) {
        this.certificadoDeNacimiento = certificadoDeNacimiento;
    }

    public boolean isPagoAlBanco() {
        return pagoAlBanco;
    }

    public void setPagoAlBanco(boolean pagoAlBanco) {
        this.pagoAlBanco = pagoAlBanco;
    }

    public boolean isFicha() {
        return ficha;
    }

    public void setFicha(boolean ficha) {
        this.ficha = ficha;
    }

    public void info(){
        System.out.println("certificadoDeNacimiento > " + certificadoDeNacimiento);
        System.out.println("pagoAlBanco > " + pagoAlBanco);
        System.out.println("ficha > " + ficha);

    }
}
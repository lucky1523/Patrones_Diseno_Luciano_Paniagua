package Prototype.ejercicios;

import Prototype.ejemplos.Boletos.Persona;
import Prototype.ejemplos.Boletos.Tiempo;

public class SamsungR10 implements CelularBase{
    private String tamano;
    private String cpu;
    private String memoria;
    private String versionAndroid;
    private String camara;
    private String bluetooth;
    private String cantidadDeMemoriaExterna;
    private String tipoBateria;
    private Accesorios accesorios;
    private Sim sim;

    public SamsungR10(){}

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getCantidadDeMemoriaExterna() {
        return cantidadDeMemoriaExterna;
    }

    public void setCantidadDeMemoriaExterna(String cantidadDeMemoriaExterna) {
        this.cantidadDeMemoriaExterna = cantidadDeMemoriaExterna;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public Accesorios getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Accesorios accesorios) {
        this.accesorios = accesorios;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    @Override
    public Object clone() {
        SamsungR10 ObjClone = new SamsungR10();
        ObjClone.setTamano(this.tamano);
        ObjClone.setTipoBateria(this.tipoBateria);
        ObjClone.setBluetooth(this.bluetooth);
        ObjClone.setCamara(this.camara);
        ObjClone.setCantidadDeMemoriaExterna(this.cantidadDeMemoriaExterna);
        ObjClone.setCpu(this.cpu);
        ObjClone.setVersionAndroid(this.versionAndroid);
        ObjClone.setMemoria(this.memoria);
        ObjClone.sim=this.sim;  //SUPERFICIAL
        ObjClone.setAccesorios(this.accesorios); //PROFUNDO
        return ObjClone;
    }
    public void showInformation(){
        System.out.println("******************************");
        System.out.println("tamaño: "+tamano);
        System.out.println("bateria: "+tipoBateria);
        System.out.println("bluetooth: "+bluetooth);
        System.out.println("camara: "+camara);
        System.out.println("Memoria externa: "+cantidadDeMemoriaExterna);
        System.out.println("CPU: "+cpu);
        System.out.println("Version de android: "+versionAndroid);
        System.out.println("memoria: "+memoria);
        System.out.println("Sim (Empresa y Numero de telefono):"+ " "+sim.getNomEmpresa() + " "+ sim.getNumTelefono());
        System.out.println("Accesorios(Audifonos, cargador, estuche): "+ " "+ accesorios.isAudifonos() + " "+
                            accesorios.isEstuche()+ " " + accesorios.isCargador());
    }
}

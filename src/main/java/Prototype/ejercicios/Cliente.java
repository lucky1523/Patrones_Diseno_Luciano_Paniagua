package Prototype.ejercicios;

public class Cliente {
    public static void main (String[] args) {
        SamsungR10 samsungR10 = new SamsungR10();
        samsungR10.setMemoria("32 GB");
        samsungR10.setCamara("0");
        samsungR10.setTamano("15 pld");
        samsungR10.setCpu("SnapDragon 652");
        samsungR10.setTipoBateria("4000 mAh");
        samsungR10.setVersionAndroid("version 12");
        samsungR10.setCantidadDeMemoriaExterna("0");
        samsungR10.setBluetooth("si");
        samsungR10.setAccesorios(new Accesorios(true, true, true));
        samsungR10.setSim(new Sim("", 000000));


        SamsungR10 samsungR10_v1 = (SamsungR10) samsungR10.clone();
        samsungR10_v1.setCamara("12 Mpx");
        samsungR10_v1.setCantidadDeMemoriaExterna("128 GB");
        samsungR10_v1.setAccesorios(new Accesorios(true,false,false));
        samsungR10.setSim(new Sim("Viva",71546240));

        SamsungR10 samsungR10_v2 = (SamsungR10) samsungR10.clone();
        samsungR10_v2.setCamara("18 Mpx");
        samsungR10_v2.setCantidadDeMemoriaExterna("64 GB");
        samsungR10_v2.setAccesorios(new Accesorios(false,false,false));
        samsungR10.setSim(new Sim("Tigo",72446457));

        SamsungR10 samsungR10_v3 = (SamsungR10) samsungR10.clone();
        samsungR10_v3.setCamara("22 Mpx");
        samsungR10_v3.setCantidadDeMemoriaExterna("264 GB");
        samsungR10_v3.setAccesorios(new Accesorios(true,true,true));
        samsungR10.setSim(new Sim("Entel",73727078));

        samsungR10_v1.showInformation();
        samsungR10_v2.showInformation();
        samsungR10_v3.showInformation();




    }
}

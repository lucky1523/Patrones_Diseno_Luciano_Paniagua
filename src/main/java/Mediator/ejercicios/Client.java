package Mediator.ejercicios;



public class Client {

    public static void main (String[] args){
        Skype skype= new Skype();

        Persona dev1 = new Persona(skype);
        dev1.setDev(new DEV(skype));
        dev1.getDev().setCargo("DEV");
        dev1.getDev().setName("dev1");
        dev1.getDev().setCi("111");

        Persona dev2 = new Persona(skype);
        dev2.setDev(new DEV(skype));
        Persona dev3 = new Persona(skype);
        dev3.setDev(new DEV(skype));
        Persona qa1 = new Persona(skype);
        qa1.setQa(new QA(skype));
        Persona qa2 = new Persona(skype);
        qa2.setQa(new QA(skype));
        Persona sm1 = new Persona(skype);
        sm1.setSm(new SM(skype));

        dev2.getDev().setCargo("DEV");
        dev2.getDev().setName("dev2");
        dev2.getDev().setCi("1112");
        dev3.getDev().setCargo("DEV");
        dev3.getDev().setName("dev3");
        dev3.getDev().setCi("1113");
        qa1.getQa().setCargo("QA");
        qa1.getQa().setName("qa1");
        qa1.getQa().setCi("11133");
        qa2.getQa().setCargo("QA");
        qa2.getQa().setName("qa2");
        qa2.getQa().setCi("111533");
        sm1.getSm().setCargo("SM");
        sm1.getSm().setName("sm11");
        sm1.getSm().setCi("1115533");

        skype.addPersonasAlChat(dev1);
        skype.addPersonasAlChat(dev2);
        skype.addPersonasAlChat(dev3);
        skype.addPersonasAlChat(qa1);
        skype.addPersonasAlChat(qa2);
        skype.addPersonasAlChat(sm1);

        dev1.send("hola como estan todos los DEVs");
        dev2.send("todo bien DEVs");

        qa2.send("hola a todos los QAs");

        sm1.send("hola a todos!! hoy acaba el sprint");

    }

}
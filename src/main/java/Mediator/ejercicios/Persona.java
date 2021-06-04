package Mediator.ejercicios;



public class Persona extends Colleague {

    private QA qa;
    private DEV dev;
    private SM sm;

    public Persona(ICanalDeComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
           }

    public QA getQa() {
        return qa;
    }

    public void setQa(QA qa) {
        this.qa = qa;
    }

    public DEV getDev() {
        return dev;
    }

    public void setDev(DEV dev) {
        this.dev = dev;
    }

    public SM getSm() {
        return sm;
    }

    public void setSm(SM sm) {
        this.sm = sm;
    }

    @Override
    public void messageReceived(String message) {
        /*
        if (qa!=null){
            System.out.println("INFO - Message Received "+"QA"+","+qa.getName()+">"+message);
        } else if (dev!=null){
            System.out.println("INFO - Message Received "+"QA"+","+dev.getName()+">"+message);
        } else {
            System.out.println("INFO - Message Received "+"QA"+","+sm.getName()+">"+message);
        }
    }
*/
    }

}

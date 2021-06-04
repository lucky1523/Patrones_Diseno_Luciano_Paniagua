package Mediator.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Skype implements ICanalDeComunicacion {

 //  Map<Persona, String> personasChat1 = new HashMap<Persona, String>();
    private List<Persona> personasChat= new ArrayList<>();

    public void addPersonasAlChat(Persona persona){
        personasChat.add(persona);
    }

    @Override
    public void send(String message, Colleague personaOrigen) {
        Persona personaParseOrigen= (Persona) personaOrigen;
        for (Persona persona:personasChat) {
            if ( !personaParseOrigen.getSm().getCi().equals(persona.getSm().getCi())){
                if (personaParseOrigen.getSm().getCargo().equals("SM")){
                    persona.getSm().messageReceived(message);
                }
                if (personaParseOrigen.getQa().getCargo().equals("QA") && persona.getQa().getCargo().equals("QA")){
                    persona.getQa().messageReceived(message);
                }
                if (personaParseOrigen.getDev().getCargo().equals("DEV") && persona.getDev().getCargo().equals("DEV")){
                    persona.getDev().messageReceived(message);
                }
            }
        }
    }
}

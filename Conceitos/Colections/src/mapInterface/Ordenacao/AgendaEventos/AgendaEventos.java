package mapInterface.Ordenacao.AgendaEventos;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new TreeMap<>();
    }

    protected void adicionarEventos(LocalDate data, String nomeEvento, String nomeAtracao){
        eventosMap.put(data, new Evento(nomeEvento,nomeAtracao));
    }

    protected void exibirAgenda(){
        System.out.println(eventosMap);
    }

    protected Map<LocalDate, Evento> obterProximoEvento(){
        Map<LocalDate,Evento> proximosEventos = new TreeMap<>();
        LocalDate hoje = LocalDate.now();
        if(!eventosMap.isEmpty()){
            for (Map.Entry<LocalDate,Evento> entry : eventosMap.entrySet()){
                LocalDate dataEvento = entry.getKey();
                if(dataEvento.isAfter(hoje)){
                    proximosEventos.put(entry.getKey(),entry.getValue());
                }
            }
        } return proximosEventos;
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEventos(LocalDate.of(2023,01,25),"Lolapalooza","Metálica");
        agenda.adicionarEventos(LocalDate.of(2025,02,19),"Lolapalooza","Xuxa");

        agenda.exibirAgenda();
        System.out.println(agenda.obterProximoEvento());

    }

}

package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento (nome, atracao);
        eventosMap.put(data, evento);
    }

    /**
     * Usando TreeMap neste método para ordenar
     * os eventos, ele ordena.
     */
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            LocalDate dataEvento = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
        }
    }

    /**
     * Esse método só foi possível de ser feito assim
     * porque foi usado o TreeSet para ordenar anteriormente
     */
    public void obterProximoEvento(){
        // Set<LocalDate> dataSet = eventosMap.keySet();
        // Collection<Evento> values = eventosMap.values();
        // eventosMap.get(values);
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximEvento = entry.getValue();
                System.out.println("O próximo evento: " +proximEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 7), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 8), "Evento 5", "Atração 5");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}

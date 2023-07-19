import java.time.LocalDateTime;

public class PrenotazioneController {

    public void visualizzaStoricoPrenotazioni(FiltroPrenotazioni filtro) {
        List<Object> servizi = GestoreCataloghi.uniqueInstance.consultaCatalogoServizi(filtro);
        List<EventiSpeciali> eventiSpeciali = GestoreCataloghi.uniqueInstance.consultaCatalogoEventiSpeciali(filtro);
        
        // Produci, genera dati
    };

    public void selezionaEventoSpeciale(CatalogoEventi eventoSpeciale, ClienteFedele clienteFedele) {

        // Genera id autoincrementato
        int id;
        new EventoSpeciale(id, eventoSpeciale, LocalDateTime.now(), clienteFedele);
    };

}

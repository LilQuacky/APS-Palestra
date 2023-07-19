public class EventoSpeciale {
    final private int id;
    final private CatalogoEventi evento;
    final private LocalDateTime dataPrenotazione;
    final private ClienteFedele clienteFedele;

    public EventoSpeciale(int id, CatalogoEventi evento, LocalDateTime dataPrenotazione, ClienteFedele clienteFedele) {
        this.id = id;
        this.evento = evento;
        this.dataPrenotazione = dataPrenotazione;
        this.clienteFedele = clienteFedele;
    }

    public int getId() {
        return id;
    }

    public CatalogoEventi getEvento() {
        return evento;
    }

    public LocalDateTime getDataPrenotazione() {
        return dataPrenotazione;
    }

}


    

    


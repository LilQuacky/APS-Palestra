import java.time.LocalDateTime; 

public class FiltroPrenotazioni {
    final public LocalDateTime dataInizio;
    final public LocalDateTime dataFine;
    final public TipologiaAbbonamento tipologiaAbbonamento;
    final public TipologiaCliente tipologiaCliente;

    public FiltroPrenotazioni(
            LocalDateTime dataInizio,
            LocalDateTime dataFine,
            TipologiaAbbonamento tipologiaAbbonamento,
            TipologiaCliente tipologiaCliente) {
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.tipologiaAbbonamento = tipologiaAbbonamento;
        this.tipologiaCliente = tipologiaCliente;
    }

}
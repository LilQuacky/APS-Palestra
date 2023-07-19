public class GestoreCataloghi {
    GestoreCataloghi uniqueInstance;

    public GestoreCataloghi(){
        this.uniqueInstance = this;
    }

    public static void consultaCatalogoEventiSpeciali(FiltroPrenotazioni filtro){
        // Prendo l'instanza del catalogoEventi
        CatalogoEventi catalogoEventi = new CatalogoEventi();
        catalogoEventi.read(filtro);

        // Altre cose...
    }

    public static void consultaCatalogoServizi(FiltroPrenotazioni filtro){
        // Uguale a sopra
    }

    public static void consultaCatalogoProdotti(FiltroPrenotazioni filtro){
        // Uguale a sopra
    }
}

package dep.inj;

/**
 * Questa classe rappresenta un'applicazione per la lettura di stringhe da una sorgente specifica.
 * Utilizza un'istanza di un oggetto che implementa l'interfaccia ReadStringInterface per eseguire l'operazione di lettura.
 */
public class ReadStringApp {
    
    private ReadStringInterface reader; // Oggetto che esegue l'operazione di lettura
    
    /**
     * Costruisce un'istanza di ReadStringApp con l'oggetto che implementa l'interfaccia ReadStringInterface fornito.
     *
     * @param reader l'oggetto che implementa l'interfaccia ReadStringInterface utilizzato per eseguire l'operazione di lettura
     */
    public ReadStringApp(ReadStringInterface reader) {
        this.reader = reader;
    }
    
    /**
     * Esegue l'operazione di lettura utilizzando l'oggetto reader fornito.
     *
     * @return la stringa letta dall'oggetto reader
     */
    public String read() {
        return this.reader.execute();
    }

}

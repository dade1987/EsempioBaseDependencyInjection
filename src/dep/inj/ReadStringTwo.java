package dep.inj;

/**
 * Questa classe rappresenta un'implementazione specifica dell'interfaccia ReadStringInterface.
 * Fornisce un'implementazione del metodo execute() che restituisce una stringa specifica ("Stringa Due").
 */
public class ReadStringTwo implements ReadStringInterface {

    /**
     * Restituisce una stringa specifica ("Stringa Due").
     *
     * @return la stringa "Stringa Due"
     */
    public String execute() {
        return "Stringa Due";
    }
    
}

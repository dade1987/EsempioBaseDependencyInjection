package dep.inj;

/**
 * Questa classe rappresenta un'implementazione specifica dell'interfaccia ReadStringInterface.
 * Fornisce un'implementazione del metodo execute() che restituisce una stringa specifica ("Stringa Uno").
 */
public class ReadStringOne implements ReadStringInterface {

    /**
     * Restituisce una stringa specifica ("Stringa Uno").
     *
     * @return la stringa "Stringa Uno"
     */
    public String execute() {
        return "Stringa Uno";
    }
    
}
package dep.inj;

/**
 * Questa interfaccia definisce il contratto per le classi che eseguono l'operazione di lettura di una stringa da una sorgente specifica.
 * Le classi che implementano questa interfaccia devono fornire un'implementazione del metodo execute() che esegue l'operazione di lettura.
 */
public interface ReadStringInterface {
    
    /**
     * Esegue l'operazione di lettura della stringa da una sorgente specifica.
     *
     * @return la stringa letta dalla sorgente
     */
    String execute();

}

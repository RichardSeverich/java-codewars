package codewars.com.micky.patronesdiseno.comportamiento.strategy;

/**
 * Class.
 */
public class Contexto {
    private IEstrategia estrategia;

    /**
     * Constructor.
     */
    public Contexto() {
    }

    /**
    * @param estrategia estrategia.
    */
    public void setEstrategia(final IEstrategia estrategia) {
        this.estrategia = estrategia;
    }

    /**
    * @return String.
    */
    public String ejecutar() {
        return estrategia.analizar();
    }
}

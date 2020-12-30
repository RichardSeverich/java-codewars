package codewars.com.micky.patronesdiseno.comportamiento.strategy;

/**
 * Abstract Class.
 */
public abstract class AnalisisSimple implements IEstrategia {

    /**
     * {@inheritDoc}
     */
    @Override
    public String analizar() {
        analizarDiscoD();
        analizarDiscoC();
        analizarDiscoF();
        return analizarDiscoD() + " " + analizarDiscoC() + " " + analizarDiscoF();
    }

    /**
    * @return String.
    */
    public abstract String analizarDiscoD();

    /**
    * @return String.
    */
    public abstract String analizarDiscoC();

    /**
    * @return String.
    */
    public abstract String analizarDiscoF();
}

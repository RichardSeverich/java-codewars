package codewars.com.micky.patronesdiseno.comportamiento.strategy;

/**
 * Class.
 */
public class AntivirusSimple extends AnalisisSimple {

    /**
     * Constructor.
     */
    public AntivirusSimple() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String analizarDiscoD() {
        return "disco D analizado";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String analizarDiscoC() {
        return "disco C analizado";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String analizarDiscoF() {
        return "disco F analizado";
    }
}

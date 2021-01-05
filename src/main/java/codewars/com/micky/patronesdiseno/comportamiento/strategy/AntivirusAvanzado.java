package codewars.com.micky.patronesdiseno.comportamiento.strategy;

/**
 * Class.
 */
public class AntivirusAvanzado extends AnalisisAvanzado {

    /**
     * Constructor.
     */
    public AntivirusAvanzado() {
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
    public String analizarCarpetasD() {
        return "carpetas D analizadas";
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
    public String analizarCarpetasC() {
        return "carpetas C analizadas";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String analizarDiscoF() {
        return "disco F analizado";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String analizarCarpetasF() {
        return "carpetas F analizadas";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String analizarHardware() {
        return "hardware analizado";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String analizarCarpetasHardware() {
        return "carpetas hardware analizadas";
    }
}

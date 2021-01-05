package codewars.com.micky.patronesdiseno.comportamiento.strategy;

/**
 * Abstract Class.
 */
public abstract class AnalisisAvanzado implements IEstrategia {

    /**
     * {@inheritDoc}
     */
    @Override
    public String analizar() {
        analizarDiscoD();
        analizarCarpetasD();
        analizarDiscoC();
        analizarCarpetasC();
        analizarDiscoF();
        analizarCarpetasF();
        analizarHardware();
        analizarCarpetasHardware();
        return analizarDiscoD() + " " + analizarCarpetasD() + " " + analizarDiscoC()
            + " " + analizarCarpetasC() + " " + analizarDiscoF() + " " + analizarCarpetasF()
            + " " + analizarHardware() + " " + analizarCarpetasHardware();
    }

    /**
    * @return String.
    */
    public abstract String analizarDiscoD();

    /**
    * @return String.
    */
    public abstract String analizarCarpetasD();

    /**
    * @return String.
    */
    public abstract String analizarDiscoC();

    /**
    * @return String.
    */
    public abstract String analizarCarpetasC();

    /**
    * @return String.
    */
    public abstract String analizarDiscoF();

    /**
    * @return String.
    */
    public abstract String analizarCarpetasF();

    /**
    * @return String.
    */
    public abstract String analizarHardware();

    /**
    * @return String.
    */
    public abstract String analizarCarpetasHardware();
}

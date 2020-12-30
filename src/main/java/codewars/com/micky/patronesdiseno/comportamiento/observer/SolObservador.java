package codewars.com.micky.patronesdiseno.comportamiento.observer;

/**
 * Class.
 */
public class SolObservador extends Observador {
    private int valorCambio = 2;

    /**
     * Constructor.
     */
    public SolObservador() {
    }

    /**
    * @param sujeto sujeto.
    */
    public void setSolObservador(final Sujeto sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregarObservador(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String actualizar() {
        return "Sol: " + sujeto.getMontoCambiar() * valorCambio;
    }
}

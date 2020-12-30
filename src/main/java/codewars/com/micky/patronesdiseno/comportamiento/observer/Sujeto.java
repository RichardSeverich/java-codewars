package codewars.com.micky.patronesdiseno.comportamiento.observer;

import java.util.ArrayList;

/**
 * Class.
 */
public class Sujeto {
    private ArrayList<Observador> observadoresList = new ArrayList<>();
    private int montoCambiar;

    /**
     * Constructor.
     */
    public Sujeto() {
    }

    /**
    * @param montoCambiar montoCambiar.
    */
    public void setMontoCambiar(final int montoCambiar) {
        this.montoCambiar = montoCambiar;
        notificarObservadores();
    }

    /**
    * @return int.
    */
    public int getMontoCambiar() {
        return this.montoCambiar;
    }

    /**
    * @param observador observador.
    */
    public void agregarObservador(final Observador observador) {
        observadoresList.add(observador);
    }

    /**
    * Method.
    */
    public void notificarObservadores() {
        for (Observador observador : observadoresList) {
            observador.actualizar();
        }
    }
}

package codewars.com.micky.patronesdiseno.comportamiento.observer;

/**
 * Abstract Class.
 */
public abstract class Observador {
    protected Sujeto sujeto;

    /**
    * @return String.
    */
    public abstract String actualizar();
}

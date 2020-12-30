package codewars.com.micky.patronesdiseno.estructurales.adapter;

/**
* Class.
*/
public class GuitarraElectrica implements  IGuitarra {

    /**
     * Constructor.
     */
    public GuitarraElectrica() {
    }

    /**
     * @return String.
     */
    public String encender() {
        return "encendido";
    }

    /**
     * @return String.
     */
    public String apagar() {
        return "apagado";
    }
}

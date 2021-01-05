package codewars.com.micky.estructuras.list;

/**
* Class.
* @param <T> T.
*/
public class Nodo<T> {
    protected T valor;
    protected Nodo<T> nodoSiguiente;

    /**
    * Constructor.
    */
    public Nodo() {
        this.valor = null;
        this.nodoSiguiente = null;
    }
}

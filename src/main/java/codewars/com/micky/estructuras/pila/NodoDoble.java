package codewars.com.micky.estructuras.pila;

/**
* Class.
* @param <T> T.
*/
public class NodoDoble<T> {
    protected T valor;
    protected NodoDoble<T> nodoSiguiente;
    protected NodoDoble<T> nodoAnterior;

    /**
    * Constructor.
    */
    public NodoDoble() {
        this.valor = null;
        this.nodoSiguiente = null;
        this.nodoAnterior = null;
    }
}

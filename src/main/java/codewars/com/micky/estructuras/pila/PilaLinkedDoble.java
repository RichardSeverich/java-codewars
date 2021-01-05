package codewars.com.micky.estructuras.pila;

/**
 * Class.
 *
 * @param <T> T.
 */
public class PilaLinkedDoble<T> implements IPila<T> {
    private NodoDoble<T> cola;
    private NodoDoble<T> cabeza;
    private int tamano;

    /**
     * Constructor.
     */
    public PilaLinkedDoble() {
        cola = null;
        cabeza = null;
        tamano = 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void push(final T elementoPush) {
        NodoDoble<T> nuevoNodo = new NodoDoble<T>();
        nuevoNodo.valor = elementoPush;
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.nodoAnterior = cola;
            cola.nodoSiguiente = nuevoNodo;
            cola = nuevoNodo;
        }
        tamano++;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void pop() {
        if (tamano == 1) {
            cabeza = null;
            cola = null;
            tamano--;
        }
        if (tamano > 1) {
            NodoDoble<T> nodoAnterior = cola.nodoAnterior;
            nodoAnterior.nodoSiguiente = null;
            cola = nodoAnterior;
            tamano--;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T top() {
        T t = cola.valor;
        return t;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int tamano() {
        return this.tamano;
    }
}

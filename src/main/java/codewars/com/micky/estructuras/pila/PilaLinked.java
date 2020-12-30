package codewars.com.micky.estructuras.pila;

/**
* Class.
* @param <T> T.
*/
public class PilaLinked<T> implements IPila<T> {
    private Nodo<T> cola;
    private Nodo<T> cabeza;
    private int tamano;

    /**
     * Constructor.
     */
    public PilaLinked() {
        cola = null;
        cabeza = null;
        tamano = 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void push(final T elementoPush) {
        Nodo<T> nuevoNodo = new Nodo<T>();
        nuevoNodo.valor = elementoPush;
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
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
            Nodo<T> nodoAnterior = obtenerNodo(tamano - 2);
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

    /**
     * @param indice indice.
     * @return nodo.
     */
    private Nodo<T> obtenerNodo(final int indice) {
        Nodo<T> nodo = cabeza;
        int index = 0;
        while (nodo.nodoSiguiente != null) {
            if (index == indice) {
                return nodo;
            }
            nodo = nodo.nodoSiguiente;
            index++;
        }
        return nodo;
    }
}

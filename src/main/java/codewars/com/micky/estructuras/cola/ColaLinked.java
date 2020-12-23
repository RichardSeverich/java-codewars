package codewars.com.micky.estructuras.cola;

/**
* Class.
* @param <T> T.
*/
public class ColaLinked<T> implements ICola<T> {
    private Nodo<T> cola;
    private Nodo<T> cabeza;
    private int tamano;

    /**
     * Constructor.
     */
    public ColaLinked() {
        cola = null;
        cabeza = null;
        tamano = 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void push(T elementoPush) {
        Nodo<T> nuevoNodo = new Nodo<T>();
        nuevoNodo.valor = elementoPush;
        if(cabeza == null) {
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
        if(tamano > 0) {
            cabeza = cabeza.nodoSiguiente;
            tamano--;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T front() {
        T t = cabeza.valor;
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

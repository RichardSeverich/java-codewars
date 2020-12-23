package codewars.com.micky.estructuras.list;

/**
* Class.
* @param <T> T.
*/
public class LinkedList<T> implements ILista<T> {
    private int tamano;
    private Nodo<T> cola;
    private Nodo<T> cabeza;

    /**
     * Constructor.
     */
    public LinkedList() {
        cabeza = null;
        cola = null;
        tamano = 0;
    }

    /**
     * @param valor valor.
     */
    @Override
    public void anadir(final T valor) {
        Nodo<T> nuevoNodo = new Nodo<T>();
        nuevoNodo.valor = valor;
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
     * @param indice indice.
     * @param valor valor.
     */
    @Override
    public void editar(final int indice, final T valor) {
        validarIndice(indice);
        obtenerNodo(indice).valor = valor;
    }

    /**
     * @param indice indice.
     */
    @Override
    public void eliminar(final int indice) {
        validarIndice(indice);
        if (indice == 0) {
            cabeza = cabeza.nodoSiguiente;
        } else if (tamano - 1 == indice) {
            Nodo<T> nodoAnterior = obtenerNodo(indice - 1);
            nodoAnterior.nodoSiguiente = null;
            cola = nodoAnterior;
        } else {
            Nodo<T> nodoAnterior = obtenerNodo(indice - 1);
            Nodo<T> nodoSgte = obtenerNodo(indice + 1);
            nodoAnterior.nodoSiguiente = nodoSgte;
        }
    }

    /**
     * @param indice indice.
     * @return Nodo.
     */
    @Override
    public T obtener(final int indice) {
        validarIndice(indice);
        return obtenerNodo(indice).valor;
    }

    /**
     * @return tamano.
     */
    @Override
    public int tamano() {
        return tamano;
    }

    /**
     * if index is negative or greater than size of size, we throw Exception.
     *
     * @param indice indice.
     */
    private void validarIndice(final int indice) {
        if (indice < 0 || indice >= tamano) {
            throw new IndexOutOfBoundsException("indice: " + indice + ", tamano " + indice);
        }
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

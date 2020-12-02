package codewars.com.micky.estructures.list;

import java.util.Arrays;

/**
* Class.
* @param <T> T.
*/
public class ArrayList<T> implements ILista<T> {
    private static final int CAPACIDAD_INICIAL = 5;
    private int tamano = 0;
    private Object[] arrayElementos;

    /**
    * Constructor.
    */
    public ArrayList() {
        arrayElementos = new Object[CAPACIDAD_INICIAL];
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void anadir(final T elemento) {
        if (arrayElementos.length == tamano) {
            subirCapacidad();
        }
        arrayElementos[tamano] = elemento;
        tamano++;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void editar(final int indice, final T elemento) {
        validarIndice(indice);
        arrayElementos[indice] = elemento;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void eliminar(final int indice) {
        validarIndice(indice);
        System.arraycopy(arrayElementos, indice + 1, arrayElementos, indice, tamano - 1 - indice);
        tamano--;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("unchecked")
    public T obtener(final int indice) {
        validarIndice(indice);
        return (T) arrayElementos[indice];
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int tamano() {
        return this.tamano;
    }

    /**
     * Update capacity of custom ArrayList.
     * Method increases capacity of list by making it double.
     */
    private void subirCapacidad() {
        int nuevaCapacidad = arrayElementos.length * 2;
        arrayElementos = Arrays.copyOf(arrayElementos, nuevaCapacidad);
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
}


package codewars.com.micky.estructures.pilas;

import java.util.Arrays;

public class Cola<T> implements ICola<T> {
    private int tamano;
    private Object[] arrayElementos;
    private static int CAPACIDAD_INICIAL = 5;

    /**
     * Constructor.
     */
    public Cola() {
        tamano = 0;
        arrayElementos = new Object[CAPACIDAD_INICIAL];
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void push(T elementoPush) {
        if (tamano == CAPACIDAD_INICIAL) {
            subirCapacidad();
        }
        arrayElementos[tamano] = elementoPush;
        tamano++;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void pop() {
        if (tamano != 1) {
            for (int i = 0; i < arrayElementos.length; i++) {
                int elementoSiguiente = 1;
                arrayElementos[i] = arrayElementos[elementoSiguiente];
                elementoSiguiente++;
            }
        }
        if (tamano != 0) {
            tamano--;
            arrayElementos[tamano] = null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("unchecked")
    public T front() {
        T t = (T) arrayElementos[0];
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
     * Update capacity of custom ArrayList. Method increases capacity of list by
     * making it double.
     */
    private void subirCapacidad() {
        int nuevaCapacidad = arrayElementos.length * 2;
        arrayElementos = Arrays.copyOf(arrayElementos, nuevaCapacidad);
    }
}

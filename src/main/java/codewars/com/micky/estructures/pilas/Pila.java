package codewars.com.micky.estructures.pilas;

import java.util.Arrays;

/**
 * Class.
 * 
 * @param <T> T.
 */
public class Pila<T> implements IPila<T> {
    private static int CAPACIDAD_INICIAL = 10;
    private int tamano;
    private Object[] arrayElementos;

    /**
     * Constructor.
     */
    public Pila() {
        arrayElementos = new Object[CAPACIDAD_INICIAL];
        tamano = 0;
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
        if (tamano > 0) {
            tamano--;
            arrayElementos[tamano] = null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("unchecked")
    public T top() {
        T t = (T) arrayElementos[tamano - 1];
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

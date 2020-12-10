package codewars.com.micky.estructures.cola;

/**
* Interface.
* @param <T> T.
*/
public interface ICola<T> {

    /**
     * @param elementoPush elementoPush.
     */
    void push(final T elementoPush);

    /**
     * pop.
     */
    void pop();

    /**
     * @return T.
     */
    T front();

    /**
     * @return tamano.
     */
    int tamano();
}

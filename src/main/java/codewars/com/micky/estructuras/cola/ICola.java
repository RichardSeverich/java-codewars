package codewars.com.micky.estructuras.cola;

/**
* Interface.
* @param <T> T.
*/
public interface ICola<T> {

    /**
     * @param elementoPush elementoPush.
     */
    void push(T elementoPush);

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

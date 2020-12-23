package codewars.com.micky.estructuras.pila;

/**
* Interface.
* @param <T> T.
*/
public interface IPila<T> {

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
    T top();

    /**
     * @return tamano.
     */
    int tamano();
}

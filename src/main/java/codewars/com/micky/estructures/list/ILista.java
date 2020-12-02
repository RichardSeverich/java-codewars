package codewars.com.micky.estructures.list;

/**
* Interface.
* @param <T> T.
*/
public interface ILista<T> {

    /**
     * @param elemento elemento.
     */
    void anadir(T elemento);

    /**
     * @param indice indice.
     * @param elemento elemento.
     */
    void editar(int indice,  T elemento);

    /**
     * @param indice indice.
     */
    void eliminar(int indice);

    /**
     * @param indice indice.
     * @return T.
     */
    T obtener(int indice);

    /**
     * @return int.
     */
    int tamano();
}

package codewars.com.micky.estructuras.arbolbinario;

import java.util.ArrayList;

/**
* Interface.
* @param <T> T.
*/
public interface IArbol<T> {

    /**
    * @param numeroNodo numeroNodo.
    * @param valor valor.
    */
    void agregar(int numeroNodo, T valor);

    /**
    * @return ArrayList ArrayList.
    * @param nodo nodo.
    */
    ArrayList<Integer> enOrden(Nodo<T> nodo);

    /**
    * @return ArrayList ArrayList.
    * @param nodo nodo.
    */
    ArrayList<Integer> preOrden(Nodo<T> nodo);

    /**
    * @return Nodo Nodo.
    * @param numeroNodo numeroNodo.
    */
    Nodo<T> dameNodo(int numeroNodo);

    /**
    * @return boolean boolean.
    * @param numeroNodo numeroNodo.
    */
    boolean eliminar(int numeroNodo);
}

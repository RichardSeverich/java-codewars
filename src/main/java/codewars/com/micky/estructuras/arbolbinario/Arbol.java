package codewars.com.micky.estructuras.arbolbinario;

import java.util.ArrayList;
import java.util.Stack;

/**
* Class.
* @param <T> T.
*/
public class Arbol<T> implements IArbol<T>{
    Nodo<T> raiz;
    private ArrayList<Integer> result = new ArrayList<>();

    /**
    * Constructor.
    */
    public Arbol() {
        raiz = null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void agregar(int numeroNodo, T valor) {
        Nodo<T> nuevoNodo = new Nodo<T>(numeroNodo);
        nuevoNodo.valor = valor;
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            Nodo<T> nodoAuxiliar = raiz;
            posicionarNodo(nodoAuxiliar, nuevoNodo);
            volverPadre(nuevoNodo);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArrayList<Integer> enOrden(Nodo<T> nodo) {
        if(nodo != null) {
            enOrden(nodo.izquierda);
            result.add(nodo.numeroNodo);
            enOrden(nodo.derecha);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArrayList<Integer> preOrden(Nodo<T> nodo) {
        ArrayList<Integer> preOrdenResult = new ArrayList<>();
        if (nodo == null){
            return preOrdenResult;
        }
        Stack<Nodo<T>> pila = new Stack<>();
        pila.push(nodo);
        while(! pila.empty()){
            Nodo<T> n = pila.pop();
            preOrdenResult.add(n.numeroNodo);
            if(n.derecha != null){
                pila.push(n.derecha);
            }
            if(n.izquierda != null){
                pila.push(n.izquierda);
            }
        }
        return preOrdenResult;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Nodo<T> dameNodo(int numeroNodo) {
        Nodo<T> auxiliar = raiz;
        while (auxiliar.numeroNodo != numeroNodo) {
            if (numeroNodo < auxiliar.numeroNodo) {
                auxiliar = auxiliar.izquierda;
            } else {
                auxiliar = auxiliar.derecha;
            }
            if (auxiliar == null) {
                return null;
            }
        }
        return auxiliar;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean eliminar(int numeroNodo) {
        Nodo<T> auxiliar = raiz;
        Nodo<T> padre = raiz;
        boolean esIzquierdo = true;
        while(numeroNodo != auxiliar.numeroNodo) {
            padre = auxiliar;
            if(numeroNodo < auxiliar.numeroNodo) {
                auxiliar = auxiliar.izquierda;
                esIzquierdo = true;
            } else {
                auxiliar = auxiliar.derecha;
                esIzquierdo = false;
            }
            if(auxiliar == null) {
                return false;
            }
        }
        if (auxiliar.izquierda == null && auxiliar.derecha == null) {
            if(auxiliar == raiz) {
                raiz = null;
            } else if(esIzquierdo == true) {
                padre.izquierda = null;
            } else {
                padre.derecha = null;
            }
        } else if(auxiliar.derecha == null) {
            if(auxiliar == raiz) {
                raiz = auxiliar.izquierda;
            } else if(esIzquierdo == true) {
                padre.izquierda = auxiliar.izquierda;
            } else {
                padre.derecha = auxiliar.izquierda;
        }
        } else if(auxiliar.izquierda == null) {
            if(auxiliar == raiz) {
                raiz = auxiliar.derecha;
            } else if(esIzquierdo == true) {
                padre.izquierda = auxiliar.derecha;
            } else {
                padre.derecha = auxiliar.izquierda;
            }
        } else {
            Nodo<T> reemplazo = obtenerReemplazo(auxiliar);
            if(auxiliar == raiz) {
                raiz = reemplazo;
            } else if(esIzquierdo == true) {
                padre.izquierda = reemplazo;
            } else {
                padre.derecha = reemplazo;
            }
            reemplazo.izquierda = auxiliar.izquierda;
        }
        return true;
    }

    /**
    * @param nodoReemplazar nodoReemplazar.
    * @return Nodo.
    */
    private Nodo<T> obtenerReemplazo(Nodo<T> nodoReemplazar) {
        Nodo<T> reemplazaPadre = nodoReemplazar;
        Nodo<T> reemplazo = nodoReemplazar;
        Nodo<T> auxiliar = nodoReemplazar.derecha;
        while(auxiliar != null) {
            reemplazaPadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.izquierda;
        }
        if(reemplazo != nodoReemplazar.derecha) {
            reemplazaPadre.izquierda = reemplazo.derecha;
            reemplazo.derecha = nodoReemplazar.derecha;
        }
        return reemplazo;
    }

    /**
    * @param nodoAux nodoAux.
    * @param nuevoNodo nuevoNodo.
    */
    private void posicionarNodo(Nodo<T> nodoAux, Nodo<T> nuevoNodo) {
        while (nodoAux != null) {
            nuevoNodo.padre = nodoAux;
            if (nuevoNodo.numeroNodo >= nodoAux.numeroNodo) {
                nodoAux = nodoAux.derecha;
            } else {
                nodoAux = nodoAux.izquierda;
            }
        }
    }

    /**
    * @param nodo nodo.
    */
    private void volverPadre(Nodo<T> nodo) {
        if (nodo.numeroNodo < nodo.padre.numeroNodo) {
            nodo.padre.izquierda = nodo;
        } else {
            nodo.padre.derecha = nodo;
        }
    }
}

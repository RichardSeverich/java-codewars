package codewars.com.micky.estructuras.arbolbinario;

/**
* Class.
* @param <T> T.
*/
public class Nodo<T> {
  protected T valor;
  protected Nodo<T> padre;
  protected Nodo<T> izquierda;
  protected Nodo<T> derecha;
  protected int numeroNodo;

  /**
  * Constructor.
  * @param indice indice.
  */
  public Nodo(int numeroNodo) {
    this.valor = null;
    this.padre = null;
    this.izquierda =null;
    this.derecha = null;
    this.numeroNodo = numeroNodo;
  }
}

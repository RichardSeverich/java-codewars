package codewars.com.structures.navigationstack;

/**
 * @param <T> IAction.
 */
public interface INavigationStack<T> {


    /**
     * @return true if the stack can undo.
     */
    boolean canUndo();

    /**
     * @return true if the stack can redo.
     */
    boolean canRedo();

    /**
     * Desaser.
     *
     * @return should execute the undo method from the object.
     */
    void undo();

    /**
     * Reaser.
     *
     * @return should execute the redo method from the object.
     */
    void redo();

}

package codewars.com.structures.navigationstack;


/**
 * @param <T> generic.
 */
public class Navigation<T> implements INavigationStack {

    private Stack customStackUndo;

    private Stack customStackActions;

    /**
     * Constructor.
     */
    Navigation() {
        customStackUndo = new Stack<T>();
        customStackActions = new Stack<T>();
    }

    /**
     * @param element element.
     * @return Navigation.
     */
    @SuppressWarnings("unchecked")
    Navigation add(final T element) {
        customStackActions.push(element);
        return this;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public boolean canUndo() {
        return customStackActions.size() > 0;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public boolean canRedo() {
        return customStackUndo.size() > 0;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void undo() {
        if (canUndo()) {
            customStackUndo.push(customStackActions.pop());
        }
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void redo() {
        if (canRedo()) {
            customStackActions.push(customStackUndo.pop());
        }
    }

    /**
     * @return ArrayOfElements.
     */
    Object[] getArrayOfElements() {
        return customStackActions.getArrayOfElements();
    }
}

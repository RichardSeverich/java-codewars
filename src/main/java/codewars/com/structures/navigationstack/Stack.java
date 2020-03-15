package codewars.com.structures.navigationstack;

import java.util.Arrays;

/**
 * @param <T> generic.
 */
class Stack<T> {

    private static final int INITIAL_SIZE = 10;
    private int currentElementPosition = 0;
    private Object[] elementData;

    /**
     * Constructor which initializes the array to be used as the stack.
     */
    @SuppressWarnings("unchecked")
    Stack() {
        elementData = new Object[INITIAL_SIZE];
    }

    /**
     * Pop operation that recovers(get) the top element of the stack.
     *
     * @return generic element.
     */
    @SuppressWarnings("unchecked")
    T pop() {
        // retrieve top most element
        T t = (T) elementData[--currentElementPosition];
        // empty its position
        elementData[currentElementPosition] = null;
        return t;
    }

    /**
     * Push operation which adds item to the stack.
     *
     * @param elementToPush elementToPush elementToPush.
     * @return CustomStack.
     */
    Stack<T> push(final T elementToPush) {
        // check if array is full
        if (currentElementPosition == elementData.length) {
            expandSize();
        }
        elementData[currentElementPosition++] = elementToPush;
        return this;
    }

    /**
     * @return size.
     */
    int size() {
        return currentElementPosition;
    }

    /**
     * Increases the size of the array by double its existing size.
     */
    private void expandSize() {
        int increasedSize = elementData.length * 2;
        // create a new array with double size and copy existing contents into it
        elementData = Arrays.copyOf(elementData, increasedSize);
    }

    /**
     * @return array.
     */
    Object[] getArrayOfElements() {
        return elementData;
    }
}

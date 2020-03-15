package codewars.com.structures.customarraylist;

import java.util.Arrays;

/**
 * @param <E> generic.
 */
public class CustomArrayList<E> {

    // Define INITIAL_CAPACITY, size of elements of custom ArrayList.
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object[] elementData;

    /**
     * Constructor.
     */
    public CustomArrayList() {
        elementData = new Object[INITIAL_CAPACITY];
    }

    /**
     * @param element is a element.
     * @return CustomArrayList.
     */
    public CustomArrayList add(final E element) {
        if (size == elementData.length) {
            upCapacity(); // increase current capacity of list, make it double.
        }
        elementData[size++] = element;
        return this;
    }

    /**
     * SuppressWarnings: the unchecked category allows suppression of compiler warnings generated as a
     * result of unchecked type casts.
     *
     * @param index index.
     * @return return value on index.
     */
    @SuppressWarnings("unchecked")
    public E get(int index) {
        validateIndex(index);
        return (E) elementData[index]; // return value on index (SuppressWarnings).
    }

    /**
     * if index is negative or greater than size of size, we throw Exception.
     *
     * @param index index.
     */
    private void validateIndex(final int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
    }

    /**
     * remove element.
     *
     * @param index index.
     * @return CustomArrayList.
     */
    public CustomArrayList remove(final int index) {
        validateIndex(index);
        System.arraycopy(elementData, index + 1, elementData, index, size - 1 - index);
        size--; // reduce size of ArrayListCustom after removal of element.
        return this;
    }

    /**
     * Update capacity of custom ArrayList.
     * Method increases capacity of list by making it double.
     */
    private void upCapacity() {
        int newIncreasedCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }
}

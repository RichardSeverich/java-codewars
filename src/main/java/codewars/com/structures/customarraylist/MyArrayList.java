package codewars.com.structures.customarraylist;

/**
 * Class.
 */
public class MyArrayList {

    private static final int FIVE = 5;
    private int size;
    private int currentPosition;
    private String[] myArray;

    /**
     * Constructor.
     */
    MyArrayList() {
        this.size = FIVE;
        this.currentPosition = 0;
        this.myArray = new String[size];
    }

    /**
     * @param item item.
     * @return MyArrayList.
     */
    public MyArrayList add(final String item) {
        if (myArray[size - 1] != null) {
            size = size + size;
            this.copyArray();
        }
        myArray[currentPosition] = item;
        currentPosition++;
        return this;
    }

    /**
     * @param ind ind
     * @return value.
     */
    public String get(final int ind) {
        if (ind >= currentPosition) {
            throw new IndexOutOfBoundsException();
        }
        return myArray[ind];
    }

    /**
     * @param ind ind.
     * @return MyArrayList.
     */
    public MyArrayList delete(final int ind) {
        if (ind >= currentPosition) {
            throw new IndexOutOfBoundsException();
        }
        myArray[ind] = null;
        this.removeNull();
        currentPosition--;
        return this;
    }

    /**
     * removeNull.
     */
    private void removeNull() {
        for (int i = 0; i < size; i++) {
            if (i < size - 1 && myArray[i] == null && myArray[i + 1] != null) {
                myArray[i] = myArray[i + 1];
                myArray[i + 1] = null;
            }
        }
    }

    /**
     * copyArray.
     */
    private void copyArray() {
        String[] myNewArray = new String[size];
        System.arraycopy(myArray, 0, myNewArray, 0, myArray.length);
        myArray = myNewArray;
    }
}

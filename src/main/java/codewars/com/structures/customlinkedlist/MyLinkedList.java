package codewars.com.structures.customlinkedlist;

/**
 * Class.
 */
public class MyLinkedList {

    private ItemLinked currentlyItem;
    private ItemLinked firstItem;
    private int currentlyPosition;

    /**
     * Constructor.
     */
    MyLinkedList() {
        currentlyItem = null;
        firstItem = null;
        currentlyPosition = 0;
    }

    /**
     * @param value value
     * @return MyLinkedList.
     */
    public MyLinkedList add(final String value) {
        if (currentlyItem == null) {
            currentlyItem = new ItemLinked(value);
            firstItem = currentlyItem;
            currentlyPosition++;
            return this;
        }
        ItemLinked newItem = new ItemLinked(value);
        currentlyItem.setNexItem(newItem);
        currentlyItem = newItem;
        currentlyPosition++;
        return this;
    }

    /**
     * @param ind ind.
     * @return value.
     */
    public String get(final int ind) {
        if (ind >= currentlyPosition) {
            throw new IndexOutOfBoundsException();
        }
        return getValue(firstItem, ind, 0);
    }

    /**
     * @param ind ind.
     * @return MyLinkedList.
     */
    public MyLinkedList delete(final int ind) {
        if (ind >= currentlyPosition) {
            throw new IndexOutOfBoundsException();
        } else if (ind == 0) {
            firstItem = firstItem.getNextItem();
        } else if (currentlyPosition == 2 && ind == 1) {
            ItemLinked previousItem = firstItem.getNextItem();
            previousItem.setNexItem(null);
            currentlyItem = previousItem;
        } else {
            ItemLinked previousItem = getItem(firstItem, ind - 1, 0);
            ItemLinked deleteItem = getItem(firstItem, ind, 0);
            previousItem.setNexItem(deleteItem.getNextItem());
        }
        currentlyPosition--;
        return this;
    }

    /**
     * @param itemLinked   itemLinked.
     * @param ind          ind.
     * @param itemPosition itemPosition.
     * @return ItemLinked.
     */
    private ItemLinked getItem(final ItemLinked itemLinked, final int ind, final int itemPosition) {
        if (itemPosition == ind) {
            return itemLinked;
        } else {
            return getItem(itemLinked.getNextItem(), ind, itemPosition + 1);
        }
    }

    /**
     * @param itemLinked   itemLinked.
     * @param ind          ind.
     * @param itemPosition itemPosition.
     * @return value.
     */
    private String getValue(final ItemLinked itemLinked, final int ind, final int itemPosition) {
        if (itemPosition == ind) {
            return itemLinked.getValue();
        } else {
            return getValue(itemLinked.getNextItem(), ind, itemPosition + 1);
        }
    }
}

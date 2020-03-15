package codewars.com.structures.customlinkedlist;

/**
 * Class.
 */
public class ItemLinked {
    private String value;
    private ItemLinked nextItem;

    /**
     * @param value value.
     */
    ItemLinked(final String value) {
        this.value = value;
        this.nextItem = null;
    }

    /**
     * @param item item.
     * @return ItemLinked.
     */
    public ItemLinked setNexItem(final ItemLinked item) {
        this.nextItem = item;
        return this;
    }

    /**
     * @return value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return nextItem.
     */
    public ItemLinked getNextItem() {
        return nextItem;
    }
}

package codewars.com.kataPurchaseFilter;

/**
 * Class.
 */
public class Purchase {

    private String name;
    private Change currencyChange;
    private int quantity;
    private String dateOfPurchase;

    /**
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name name.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return currencyChange.
     */
    public Change getCurrencyChange() {
        return currencyChange;
    }

    /**
     * @param currencyChange currencyChange.
     */
    public void setCurrencyChange(final Change currencyChange) {
        this.currencyChange = currencyChange;
    }

    /**
     * @return quantity.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity quantity.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return quantity.
     */
    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    /**
     * @param dateOfPurchase dateOfPurchase.
     */
    public void setDateOfPurchase(final String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
}

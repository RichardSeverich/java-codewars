package codewars.com.kataPurchaseFilter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * given the following model
 * <p>
 * product: Shoe
 * currencyChange: USD/EURO
 * quantity: 2
 * DateOfPurchase: 31/02/2020 08:00 am
 * <p>
 * product: Pants
 * currencyChange: USD/BOLIVIAN
 * quantity: 10
 * DateOfPurchase: 31/05/2020 09:00 am
 * <p>
 * 1. Given 5 purchases, show items purchased by the same currencyChange and ordered by Date (ascending)
 * 2. Given 5 purchases, show the most sold item (major quantity)
 */
public class Filter {

    /**
     * @param listPurchase listPurchase.
     * @param change       change.
     * @return List.
     */
    public List<Purchase> filterByCurrencyChange(List<Purchase> listPurchase, Change change) {
        return listPurchase.stream()
                .filter(purchase -> (purchase.getCurrencyChange() == change))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * @param arrayListPurchase arrayListPurchase
     * @return Purchase Purchase.
     */
    public Purchase getMaxPurchaseByQuantity(List<Purchase> arrayListPurchase) {
        return arrayListPurchase
                .stream()
                .max(Comparator.comparing(Purchase::getQuantity))
                .orElseThrow(NoSuchElementException::new);
    }

    /**
     * @param arrayListPurchase arrayListPurchase
     * @return Purchase Purchase.
     */
    public Purchase getMinPurchaseByQuantity(List<Purchase> arrayListPurchase) {
        return arrayListPurchase
                .stream()
                .min(Comparator.comparing(Purchase::getQuantity))
                .orElseThrow(NoSuchElementException::new);
    }

    /**
     * @param arrayListPurchase arrayListPurchase.
     * @return List.
     */
    public List<Purchase> orderByDate(List<Purchase> arrayListPurchase) {
        Collections.sort(arrayListPurchase, new Comparator<Purchase>() {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm a");  //or your pattern

            @Override
            public int compare(Purchase o1, Purchase o2) {
                try {
                    return formatter.parse(o1.getDateOfPurchase()).compareTo(formatter.parse(o2.getDateOfPurchase()));

                } catch (ParseException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        });
        return arrayListPurchase;
    }
}

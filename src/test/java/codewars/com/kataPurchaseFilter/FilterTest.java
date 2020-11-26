package codewars.com.kataPurchaseFilter;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;

/**
 * Test.
 */
public class FilterTest {

    private Filter filter;
    private ArrayList<Purchase> arrayListPurchase;
    private Purchase purchaseOne;
    private Purchase purchaseTwo;
    private Purchase purchaseThree;
    private Purchase purchaseFour;
    private Purchase purchaseFive;


    /**
     * Constructor.
     */
    public FilterTest() {
        arrayListPurchase = new ArrayList<>();
        // declare
        purchaseOne = new Purchase();
        purchaseTwo = new Purchase();
        purchaseThree = new Purchase();
        purchaseFour = new Purchase();
        purchaseFive = new Purchase();
        // build Purchases
        // One
        purchaseOne.setName("shoe");
        purchaseOne.setCurrencyChange(Change.USD_EURO);
        purchaseOne.setQuantity(2);
        purchaseOne.setDateOfPurchase("28/06/2020 09:00 am");
        // Two
        purchaseTwo.setName("pants");
        purchaseTwo.setCurrencyChange(Change.EURO_USD);
        purchaseTwo.setQuantity(10);
        purchaseTwo.setDateOfPurchase("28/12/2020 09:00 am");
        // three
        purchaseThree.setName("shorts");
        purchaseThree.setCurrencyChange(Change.EURO_BOLIVIAN);
        purchaseThree.setQuantity(5);
        purchaseThree.setDateOfPurchase("31/12/2020 10:00 am");
        // Four
        purchaseFour.setName("sneakers");
        purchaseFour.setCurrencyChange(Change.EURO_BOLIVIAN);
        purchaseFour.setQuantity(15);
        purchaseFour.setDateOfPurchase("01/01/2020 08:00 am");
        // Four
        purchaseFive.setName("cap");
        purchaseFive.setCurrencyChange(Change.EURO_BOLIVIAN);
        purchaseFive.setQuantity(50);
        purchaseFive.setDateOfPurchase("01/05/2020 21:00 pm");
        // Add
        arrayListPurchase.add(purchaseOne);
        arrayListPurchase.add(purchaseTwo);
        arrayListPurchase.add(purchaseThree);
        arrayListPurchase.add(purchaseFour);
        arrayListPurchase.add(purchaseFive);
    }

    /**
     * Before.
     */
    @Before
    public void setUp() {
        filter = new Filter();
    }

    /**
     * Test 1.
     */
    @Test
    public void test01() {
        List<Purchase> actualResult = filter.filterByCurrencyChange(arrayListPurchase, Change.EURO_BOLIVIAN);
        /*for (Purchase purchase : actualResult) { System.out.println(purchase.getName());}*/
        List<Purchase> expectedResult = Arrays.asList(purchaseThree, purchaseFour, purchaseFive);
        assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

    /**
     * Test 2.
     */
    @Test
    public void test02() {
        Purchase actualResult = filter.getMaxPurchaseByQuantity(arrayListPurchase);
        assertThat(actualResult, CoreMatchers.is(purchaseFive));
    }

    /**
     * Test 3.
     */
    @Test
    public void test03() {
        Purchase actualResult = filter.getMinPurchaseByQuantity(arrayListPurchase);
        assertThat(actualResult, CoreMatchers.is(purchaseOne));
    }

    /**
     * Test 4.
     */
    @Test
    public void test04() {
        List<Purchase> actualResult = filter.orderByDate(arrayListPurchase);
        List<Purchase> expectedResult = Arrays.asList(purchaseFour, purchaseFive, purchaseOne,
                purchaseTwo, purchaseThree);
        assertThat(actualResult, CoreMatchers.is(expectedResult));
    }

}

package codewars.com.micky.solid.dependencyinversion.good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddEmployedTest {
    private AddEmployed addEmployed;

    /**
     * Before.
     */
    @Before
    public void instance() {
        addEmployed = new AddEmployed();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Gerent gerent1 = new Gerent("1", "naruto");
        Gerent gerent2 = new Gerent("2", "kabuto");
        addEmployed.addEmployeds(gerent1);
        addEmployed.addEmployeds(gerent2);

        // Gerent 1
        Assert.assertEquals("1", addEmployed.getEmployeds().get(0).getId());
        Assert.assertEquals("naruto", addEmployed.getEmployeds().get(0).getName());

        // Gerent 2
        Assert.assertEquals("2", addEmployed.getEmployeds().get(1).getId());
        Assert.assertEquals("kabuto", addEmployed.getEmployeds().get(1).getName());
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        Seller seller1 = new Seller("1", "ragnar");
        Seller seller2 = new Seller("2", "rollo");
        addEmployed.addEmployeds(seller1);
        addEmployed.addEmployeds(seller2);

        // Seller 1
        Assert.assertEquals("1", addEmployed.getEmployeds().get(0).getId());
        Assert.assertEquals("ragnar", addEmployed.getEmployeds().get(0).getName());

        // Seller 2
        Assert.assertEquals("2", addEmployed.getEmployeds().get(1).getId());
        Assert.assertEquals("rollo", addEmployed.getEmployeds().get(1).getName());
    }
}

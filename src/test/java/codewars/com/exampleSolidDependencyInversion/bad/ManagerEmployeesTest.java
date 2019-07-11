package codewars.com.exampleSolidDependencyInversion.bad;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Test.
 */
public class ManagerEmployeesTest {

    private ManagerEmployees managerEmployees;


    /**
     * Before.
     */
    @Before
    public void setUp() {
        this.managerEmployees = new ManagerEmployees();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        final Developer developerOne = new Developer("1", "Axel", 700);
        final Developer developerTwo = new Developer("2", "Slash", 800);
        final Developer developerThree = new Developer("3", "Duff", 900);
        managerEmployees.addDevelopers(developerOne);
        managerEmployees.addDevelopers(developerTwo);
        managerEmployees.addDevelopers(developerThree);

        // Developer 1
        Assert.assertEquals("1", managerEmployees.getListDevelopers().get(0).getId());
        Assert.assertEquals("Axel", managerEmployees.getListDevelopers().get(0).getName());
        Assert.assertEquals(758, managerEmployees.getListDevelopers().get(0).getSalary());

        // Developer 2
        Assert.assertEquals("2", managerEmployees.getListDevelopers().get(1).getId());
        Assert.assertEquals("Slash", managerEmployees.getListDevelopers().get(1).getName());
        Assert.assertEquals(866, managerEmployees.getListDevelopers().get(1).getSalary());

        // Developer 3
        Assert.assertEquals("3", managerEmployees.getListDevelopers().get(2).getId());
        Assert.assertEquals("Duff", managerEmployees.getListDevelopers().get(2).getName());
        Assert.assertEquals(975, managerEmployees.getListDevelopers().get(2).getSalary());
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        final Tester testerOne = new Tester("1", "Axel", 700);
        final Tester testerTwo = new Tester("2", "Slash", 800);
        final Tester testerThree = new Tester("3", "Duff", 900);
        managerEmployees.addTesters(testerOne);
        managerEmployees.addTesters(testerTwo);
        managerEmployees.addTesters(testerThree);

        // Tester 1
        Assert.assertEquals("1", managerEmployees.getListTesters().get(0).getId());
        Assert.assertEquals("Axel", managerEmployees.getListTesters().get(0).getName());
        Assert.assertEquals(700, managerEmployees.getListTesters().get(0).getSalary());

        // Tester 2
        Assert.assertEquals("2", managerEmployees.getListTesters().get(1).getId());
        Assert.assertEquals("Slash", managerEmployees.getListTesters().get(1).getName());
        Assert.assertEquals(800, managerEmployees.getListTesters().get(1).getSalary());

        // Tester 3
        Assert.assertEquals("3", managerEmployees.getListTesters().get(2).getId());
        Assert.assertEquals("Duff", managerEmployees.getListTesters().get(2).getName());
        Assert.assertEquals(900, managerEmployees.getListTesters().get(2).getSalary());
    }
}

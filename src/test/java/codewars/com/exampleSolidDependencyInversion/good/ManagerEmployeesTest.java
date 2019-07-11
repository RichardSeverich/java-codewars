package codewars.com.exampleSolidDependencyInversion.good;

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
        final Employee developerOne = new Developer("1", "Axel", 700);
        final Employee developerTwo = new Developer("2", "Slash", 800);
        final Employee developerThree = new Developer("3", "Duff", 900);
        managerEmployees.addEmployees(developerOne);
        managerEmployees.addEmployees(developerTwo);
        managerEmployees.addEmployees(developerThree);

        // Developer 1
        Assert.assertEquals("1", managerEmployees.getListEmployees().get(0).getId());
        Assert.assertEquals("Axel", managerEmployees.getListEmployees().get(0).getName());
        Assert.assertEquals(758, managerEmployees.getListEmployees().get(0).getSalary());

        // Developer 2
        Assert.assertEquals("2", managerEmployees.getListEmployees().get(1).getId());
        Assert.assertEquals("Slash", managerEmployees.getListEmployees().get(1).getName());
        Assert.assertEquals(866, managerEmployees.getListEmployees().get(1).getSalary());

        // Developer 3
        Assert.assertEquals("3", managerEmployees.getListEmployees().get(2).getId());
        Assert.assertEquals("Duff", managerEmployees.getListEmployees().get(2).getName());
        Assert.assertEquals(975, managerEmployees.getListEmployees().get(2).getSalary());
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        final Employee testerOne = new Tester("1", "Axel", 700);
        final Employee testerTwo = new Tester("2", "Slash", 800);
        final Employee testerThree = new Tester("3", "Duff", 900);
        managerEmployees.addEmployees(testerOne);
        managerEmployees.addEmployees(testerTwo);
        managerEmployees.addEmployees(testerThree);

        // Tester 1
        Assert.assertEquals("1", managerEmployees.getListEmployees().get(0).getId());
        Assert.assertEquals("Axel", managerEmployees.getListEmployees().get(0).getName());
        Assert.assertEquals(700, managerEmployees.getListEmployees().get(0).getSalary());

        // Tester 2
        Assert.assertEquals("2", managerEmployees.getListEmployees().get(1).getId());
        Assert.assertEquals("Slash", managerEmployees.getListEmployees().get(1).getName());
        Assert.assertEquals(800, managerEmployees.getListEmployees().get(1).getSalary());

        // Tester 3
        Assert.assertEquals("3", managerEmployees.getListEmployees().get(2).getId());
        Assert.assertEquals("Duff", managerEmployees.getListEmployees().get(2).getName());
        Assert.assertEquals(900, managerEmployees.getListEmployees().get(2).getSalary());
    }
}

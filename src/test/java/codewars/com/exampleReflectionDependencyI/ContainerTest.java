package codewars.com.exampleReflectionDependencyI;

import codewars.com.exampleUtils.Group;
import codewars.com.exampleUtils.Movie;
import codewars.com.exampleUtils.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 */
public class ContainerTest {

    /**
     * Before.
     */
    @Before
    public void setUp() {
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Container.<User, User>setInstance();
        Container.<Movie, Movie>setInstance();
        Container.<Group, Group>setInstance();
        Assert.assertTrue(Container.getInstance() instanceof User);
        Assert.assertTrue(Container.getInstance() instanceof Movie);
        Assert.assertTrue(Container.getInstance() instanceof Group);
    }
}

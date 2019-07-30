package codewars.com.exampleReflectionDependencyInjection;

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
        Container.set(User.class);
        Container.set(Movie.class);
        Container.set(Group.class);
        Assert.assertTrue(Container.getInstance(User.class) instanceof User);
        Assert.assertTrue(Container.getInstance(Movie.class) instanceof Movie);
        Assert.assertTrue(Container.getInstance(Group.class) instanceof Group);
    }
}

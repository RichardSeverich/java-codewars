package codewars.com.exampleReflectionDependencyI;

import codewars.com.exampleUtils.IDog;
import codewars.com.exampleUtils.DogBulldog;
import codewars.com.exampleUtils.User;
import codewars.com.exampleUtils.Movie;
import codewars.com.exampleUtils.Group;
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
        // Verify Container with interface
        IDog dog = new DogBulldog();
        Container.<IDog, DogBulldog>setInstance(dog, new DogBulldog());
        Assert.assertTrue(Container.getInstance(dog) instanceof DogBulldog);


        // Verify Container with User class
        User user = new User();
        Container.<User>setInstance(user);
        Assert.assertTrue(Container.getInstance(user) instanceof User);

        // Verify Container with Movie class
        Movie movie = new Movie();
        Container.<Movie>setInstance(movie);
        Assert.assertTrue(Container.getInstance(movie) instanceof Movie);

        // Verify Container with Group class
        Group group = new Group();
        Container.<Group>setInstance(group);
        Assert.assertTrue(Container.getInstance(group) instanceof Group);
    }
}

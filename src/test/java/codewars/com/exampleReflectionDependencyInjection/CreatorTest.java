package codewars.com.exampleReflectionDependencyInjection;

import codewars.com.exampleUtils.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Test.
 */
public class CreatorTest {


    private Creator<User> creator;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        creator = new Creator<>();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertNotNull(creator.getInstance(User.class));
    }
}

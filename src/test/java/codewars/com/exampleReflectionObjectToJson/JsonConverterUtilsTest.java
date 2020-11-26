package codewars.com.exampleReflectionObjectToJson;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/** Class. */
public class JsonConverterUtilsTest {

    private JsonConverterUtils jsonConverterUtils;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        jsonConverterUtils = new JsonConverterUtils();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertFalse(jsonConverterUtils.isPrimitiveArray(new String[]{"Aly", "Molly", "Rachel"}));
        Assert.assertTrue(jsonConverterUtils.isPrimitiveArray(new int[]{0, 1, 2, 3}));
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        Assert.assertTrue(jsonConverterUtils.isArray(new String[]{"Aly", "Molly", "Rachel"}));
        Assert.assertTrue(jsonConverterUtils.isArray(new int[]{0, 1, 2, 3}));
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        final List<String> parameter = new ArrayList<>();
        parameter.add("a");
        parameter.add("b");
        parameter.add("c");
        Assert.assertFalse(jsonConverterUtils.isCollection(new String[]{"Aly", "Molly", "Rachel"}));
        Assert.assertFalse(jsonConverterUtils.isCollection(new int[]{0, 1, 2, 3}));
        Assert.assertTrue(jsonConverterUtils.isCollection(parameter));
    }

}

package codewars.com.exampleSolidInterfaceSegregation.good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/** Test. */
public class StudentTest {

    private Student student;
    private static final List<String> LIST_PROFESSORS = Arrays.asList("P1", "P2", "P3");

    /**
     * Before.
     */
    @Before
    public void setUp() {
        this.student = new Student("1", "Luis", LIST_PROFESSORS);
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertEquals("1", student.getId());
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        Assert.assertEquals("Luis", student.getName());
    }


    /**
     * Test 3.
     */
    @Test
    public void test3() {
        Assert.assertArrayEquals(LIST_PROFESSORS.toArray(), student.geListProfessors().toArray());
    }

}

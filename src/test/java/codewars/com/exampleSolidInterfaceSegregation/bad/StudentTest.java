package codewars.com.exampleSolidInterfaceSegregation.bad;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Test.
 */
public class StudentTest {

    private Student student;
    private static final List<String> LIST_PROFESSORS = Arrays.asList("P1", "P2", "P3");
    private static final List<String> LIST_STUDENTS = Arrays.asList("E1", "E2", "E3");

    /**
     * Before.
     */
    @Before
    public void setUp() {
        this.student = new Student("1", "Luis", "800", LIST_PROFESSORS, LIST_STUDENTS);
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
        Assert.assertEquals("800", student.getSalary());
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        Assert.assertArrayEquals(LIST_PROFESSORS.toArray(), student.geListProfessors().toArray());
    }


    /**
     * Test 5.
     */
    @Test
    public void test5() {
        Assert.assertArrayEquals(LIST_STUDENTS.toArray(), student.geListStudents().toArray());
    }
}

package codewars.com.exampleSolidInterfaceSegregation.good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/** Class. */
public class ProfessorTest {

    private Professor professor;
    private static final List<String> LIST_STUDENTS = Arrays.asList("E1", "E2", "E3");

    /**
     * Before.
     */
    @Before
    public void setUp() {
        this.professor = new Professor("1", "Luis", "800", LIST_STUDENTS);
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Assert.assertEquals("1", professor.getId());
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        Assert.assertEquals("Luis", professor.getName());
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        Assert.assertEquals("800", professor.getSalary());
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        Assert.assertArrayEquals(LIST_STUDENTS.toArray(), professor.geListStudents().toArray());
    }
}

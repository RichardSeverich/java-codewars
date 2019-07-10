package codewars.com.exampleSolidDependencyInversion.bad;

/**
 * Class.
 */
public class Tester {

    private String id;
    private String name;
    private int salary;

    /**
     * @param id     id.
     * @param name   name.
     * @param salary salary.
     */
    Tester(final String id, final String name, final int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * @return id.
     */
    String getId() {

        return id;
    }

    /**
     * @return name.
     */
    String getName() {
        return name;

    }

    /**
     * @return salary.
     */
    int getSalary() {
        return salary;
    }
}

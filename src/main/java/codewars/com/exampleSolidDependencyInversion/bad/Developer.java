package codewars.com.exampleSolidDependencyInversion.bad;

/**
 * Class.
 */
public class Developer {

    private String id;
    private String name;
    private int salary;
    private static final int BONUS_COEFFICIENT = 12;

    /**
     * @param id     id.
     * @param name   name.
     * @param salary salary.
     */
    Developer(final String id, final String name, final int salary) {
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
        return salary + salary / BONUS_COEFFICIENT;
    }
}

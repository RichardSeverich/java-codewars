package codewars.com.exampleSolidDependencyInversion.good;

/**
 * Interface.
 */
abstract class Employee {

    private String id;
    private String name;
    private int salary;

    /**
     * @param id   id.
     * @param name name.
     */
    Employee(final String id, final String name, final int salary) {
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

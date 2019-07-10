package codewars.com.exampleSolidInterfaceSegregation.good;

import java.util.List;

/**
 * Class.
 */
public class Professor implements IProfessor {

    private String id;
    private String name;
    private String salary;
    private List<String> listStudents;

    /**
     * @param id           id.
     * @param name         name.
     * @param salary       salary.
     * @param listStudents listStudents.
     */
    Professor(final String id, final String name, final String salary, final List<String> listStudents) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.listStudents = listStudents;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSalary() {
        return salary;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> geListStudents() {
        return listStudents;
    }

}

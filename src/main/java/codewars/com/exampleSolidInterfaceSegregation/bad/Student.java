package codewars.com.exampleSolidInterfaceSegregation.bad;

import java.util.List;

/**
 * Class.
 */
public class Student implements User {


    private String id;
    private String name;
    private String salary;
    private List<String> listProfessors;
    private List<String> listStudents;


    /**
     * @param id             id.
     * @param name           name.
     * @param salary         salary.
     * @param listProfessors listProfessors.
     * @param listStudents   listStudents.
     */
    Student(final String id, final String name, final String salary,
              final List<String> listProfessors, final List<String> listStudents) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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
    public List<String> geListProfessors() {
        return listProfessors;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> geListStudents() {
        return listStudents;
    }
}

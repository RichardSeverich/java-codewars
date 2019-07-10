package codewars.com.exampleSolidInterfaceSegregation.good;

import java.util.List;

/**
 * Class.
 */
public class Student implements IStudent {

    private String id;
    private String name;
    private List<String> listProfessors;

    /**
     * @param id             id.
     * @param name           name.
     * @param listProfessors listStudents.
     */
    Student(final String id, final String name, final List<String> listProfessors) {
        this.id = id;
        this.name = name;
        this.listProfessors = listProfessors;
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
    public List<String> geListProfessors() {
        return listProfessors;
    }

}

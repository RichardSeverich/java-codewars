package codewars.com.exampleSolidDependencyInversion.bad;

import java.util.ArrayList;
import java.util.List;

/**
 * Class.
 */
public class ManagerEmployees {

    protected List<Developer> listDevelopers;
    protected List<Tester> listTesters;

    /**
     * Constructor.
     */
    ManagerEmployees() {
        this.listDevelopers = new ArrayList<>();
        this.listTesters = new ArrayList<>();
    }

    /**
     * @param employee employee.
     */
    public void addDevelopers(final Developer employee) {
        listDevelopers.add(employee);
    }


    /**
     * @return List of developers.
     */
    public List<Developer> getListDevelopers() {
        return this.listDevelopers;
    }


    /**
     * @param employee employee.
     */
    public void addTesters(final Tester employee) {
        listTesters.add(employee);
    }


    /**
     * @return List of testers.
     */
    public List<Tester> getListTesters() {
        return this.listTesters;
    }

}

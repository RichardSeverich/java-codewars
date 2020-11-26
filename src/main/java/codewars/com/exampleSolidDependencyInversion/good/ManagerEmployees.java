package codewars.com.exampleSolidDependencyInversion.good;

import java.util.ArrayList;
import java.util.List;

/**
 * Class.
 */
public class ManagerEmployees {

    private List<Employee> listEmployee;

    /**
     * Constructor.
     */
    ManagerEmployees() {
        this.listEmployee = new ArrayList<>();
    }

    /**
     * @param employee employee.
     */
    public void addEmployees(final Employee employee) {
        listEmployee.add(employee);
    }


    /**
     * @return List of employees.
     */
    public List<Employee> getListEmployees() {
        return this.listEmployee;
    }
}

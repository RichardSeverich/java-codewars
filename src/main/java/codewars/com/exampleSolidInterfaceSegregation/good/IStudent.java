package codewars.com.exampleSolidInterfaceSegregation.good;

import java.util.List;

/**
 * Interface.
 */
public interface IStudent extends IUser {

    /**
     * @return ListProfessors
     */
    public List<String> geListProfessors();
}

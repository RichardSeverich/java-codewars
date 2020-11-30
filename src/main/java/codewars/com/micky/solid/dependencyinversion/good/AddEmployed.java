package codewars.com.micky.solid.dependencyinversion.good;

import java.util.ArrayList;

/**
 * Class.
 */
public class AddEmployed {

    private ArrayList<Employed> listEmployeds = new ArrayList<>();

    /**
     * @param employed employed
     */
    public void addEmployeds(final Employed employed) {
        listEmployeds.add(employed);
    }

    /**
     * @return listEmployeds.
     */
    public ArrayList<Employed> getEmployeds() {
        return listEmployeds;
    }
}

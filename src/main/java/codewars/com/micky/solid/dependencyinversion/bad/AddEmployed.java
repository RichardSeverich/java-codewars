package codewars.com.micky.solid.dependencyinversion.bad;

import java.util.ArrayList;

/**
 * Class.
 */
public class AddEmployed {

    private ArrayList<Gerent> listGerents = new ArrayList<>();
    private ArrayList<Seller> listSellers = new ArrayList<>();

    /**
     * @param gerent gerent.
     */
    public void addGerents(final Gerent gerent) {
        listGerents.add(gerent);
    }

    /**
     * @return gerents.
     */
    public ArrayList<Gerent> getGerents() {
        return listGerents;
    }

    /**
     * @param seller seller.
     */
    public void addSellers(final Seller seller) {
        listSellers.add(seller);
    }

    /**
     * @return sellers.
     */
    public ArrayList<Seller> getSellers() {
        return listSellers;
    }
}

package codewars.com.micky.katas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/**
 * Class.
 */
public class SevenKyuReturnArrayList {

    /**
     * @param a a.
     * @param b b.
     * @return listB.
     */
    public static List<Character> diff(final Collection<Character> a, final Collection<Character> b) {

        ArrayList<Character> listA = (ArrayList) a;
        ArrayList<Character> listB = (ArrayList) b;
        eliminarRepetidos(listA);
        eliminarRepetidos(listB);
        if (listA.size() == 0) {
            Collections.sort(listB);
            return listB;
        }
        ArrayList<Character> listResult = new ArrayList<>();
        compareArrays(listA, listB, listResult);
        compareArrays(listB, listA, listResult);
        Collections.sort(listResult);
        return listResult;
    }

    /**
     * @param listCompare listCompare.
     * @param b           b.
     * @return boolean.
     */
    public static boolean existeEnArray(final ArrayList<Character> listCompare, final Character b) {
        for (Character valor : listCompare) {
            if (valor == b) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param listA      listA.
     * @param listB      listB.
     * @param listResult listResult.
     */
    public static void compareArrays(final ArrayList<Character> listA, final ArrayList<Character> listB,
            final ArrayList<Character> listResult) {
        for (int i = 0; i < listA.size(); i++) {
            if (!existeEnArray(listB, listA.get(i))) {
                listResult.add(listA.get(i));
                listB.add(listA.get(i));
            }
        }
    }

    /**
     * @param lista lista.
     */
    public static void eliminarRepetidos(final ArrayList<Character> lista) {
        Set<Character> set = new HashSet<>(lista);
        lista.clear();
        lista.addAll(set);
    }
}

package codewars.com.micky.katas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/**
 * Class.
 */
public class SevenKyuReturnArrayListGood {

    /**
     * @param a a.
     * @param b b.
     * @return result.
     */
    public static List<Character> diff(final Collection<Character> a, final Collection<Character> b) {
        Set<Character> setA = new HashSet<>(a);
        Set<Character> setB = new HashSet<>(b);

        Set<Character> intersection = new HashSet<>();
        intersection.addAll(setA);
        intersection.retainAll(setB);

        Set<Character> union = new HashSet<>();
        union.addAll(setA);
        union.addAll(setB);

        Set<Character> symmetricDifference = new HashSet<>();
        symmetricDifference.addAll(union);
        symmetricDifference.removeAll(intersection);

        List<Character> result = new ArrayList<>(symmetricDifference);
        result.sort(Character::compareTo);
        return result;
    }

}

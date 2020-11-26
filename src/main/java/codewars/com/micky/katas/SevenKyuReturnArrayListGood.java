package codewars.com.micky.katas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class SevenKyuReturnArrayListGood {

  public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
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

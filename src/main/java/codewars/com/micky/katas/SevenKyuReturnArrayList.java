package codewars.com.micky.katas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class SevenKyuReturnArrayList {

  public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
    
    ArrayList<Character> listA = (ArrayList)a;
    ArrayList<Character> listB = (ArrayList)b;
    eliminarRepetidos(listA);
    eliminarRepetidos(listB);
    if (listA.size() == 0){
      Collections.sort(listB);
      return listB;
    }
    ArrayList<Character> listResult = new ArrayList<>();
    compareArrays(listA, listB, listResult);
    compareArrays(listB, listA, listResult);
    Collections.sort(listResult);
    return listResult;
  }

  public static boolean existeEnArray(ArrayList<Character> listCompare, Character b){
    for (Character valor : listCompare){
      if (valor == b){
        return true;
      }
    }
    return false;
  }

  public static void compareArrays(ArrayList<Character> listA, ArrayList<Character> listB, ArrayList<Character> listResult){
    for (int i = 0; i < listA.size(); i ++){
      if (! existeEnArray(listB,listA.get(i))){
        listResult.add(listA.get(i));
        listB.add(listA.get(i));
      }
    }
  }

  public static void eliminarRepetidos (ArrayList<Character> lista){
    Set<Character> set = new HashSet<>(lista);
    lista.clear();
    lista.addAll(set);
  }
}

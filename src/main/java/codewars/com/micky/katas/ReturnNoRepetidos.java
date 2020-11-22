package codewars.com.micky.katas;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnNoRepetidos{

  public static Integer[] getNoRepetidos(int[] array){
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < array.length; i++){
      if (! existeEnArray(list, array[i])){
        list.add(array[i]);
      }
    }
    Integer[] arrayResult = list.stream().toArray(Integer[]::new);
    return arrayResult;
  }

  public static boolean existeEnArray(ArrayList<Integer> list, int busqueda){
    for (Integer value :list){
      if (value == busqueda){
        return true;
      }
    }
    return false;
  }
  
  //FORMA GOOD
  public static Integer[] getNoRepetidosGod(int[] array){
    List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
    return list.stream().distinct().collect(Collectors.toList()).stream().toArray(Integer[]::new);
  }
}

package codewars.com.micky.katas;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class.
 */
public final class ReturnNoRepetidos {

    /**
    * Constructor.
    */
    private ReturnNoRepetidos() {
    }

    /**
     * @param array array.
     * @return arrayResult.
     */
    public static Integer[] getNoRepetidos(final int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!existeEnArray(list, array[i])) {
                list.add(array[i]);
            }
        }
        Integer[] arrayResult = list.stream().toArray(Integer[]::new);
        return arrayResult;
    }

    /**
     * @param list     list.
     * @param busqueda busqueda.
     * @return boolean.
     */
    public static boolean existeEnArray(final ArrayList<Integer> list, final int busqueda) {
        for (Integer value : list) {
            if (value == busqueda) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array array.
     * @return list.
     */
    // FORMA GOOD
    public static Integer[] getNoRepetidosGod(final int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        return list.stream().distinct().collect(Collectors.toList()).stream().toArray(Integer[]::new);
    }
}

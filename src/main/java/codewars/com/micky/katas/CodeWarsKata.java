package codewars.com.micky.katas;

import java.util.ArrayList;

/**
 * Class.
 */
public final class CodeWarsKata {

    /**
    * Constructor.
    */
    private CodeWarsKata() {
    }

    /**
     * @param arr arr.
     * @param n   n.
     * @return result.
     */
    public static int[] take(final int[] arr, final int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }
        int[] result = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }
        return result;
    }
}

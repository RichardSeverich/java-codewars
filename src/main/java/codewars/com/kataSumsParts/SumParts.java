package codewars.com.kataSumsParts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * Let us consider this example (array written in general format):
 * <p>
 * ls = [0, 1, 3, 6, 10]
 * <p>
 * Its following parts:
 * ls = [0, 1, 3, 6, 10]
 * ls = [1, 3, 6, 10]
 * ls = [3, 6, 10]
 * ls = [6, 10]
 * ls = [10]
 * ls = []
 * <p>
 * The corresponding sums are (put together in a list): [20, 20, 19, 16, 10, 0]
 * <p>
 * The function parts_sums (or its variants in other languages) will take as parameter
 * a list ls and return a list of the sums of its parts as defined above.
 */
public class SumParts {

    /**
     * Constructor.
     */
    public SumParts() {

    }

    /**
     * Bat Performance.
     *
     * @param array array.
     * @return array.
     */
    public int[] sumParts1(final int[] array) {
        int[] newArray = new int[array.length + 1];
        for (int x = 0; x < array.length; x++) {
            newArray[x] = array[x];
            for (int y = x + 1; y < array.length; y++) {
                newArray[x] = newArray[x] + array[y];
            }
        }
        return newArray;
    }

    /**
     * Bat Performance.
     *
     * @param array array
     * @return newArray
     */
    public int[] sumParts2(final int[] array) {
        List<Integer> list = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
        int[] newArray = new int[array.length + 1];
        for (int index = 0; index < array.length; index++) {
            newArray[index] = list.stream().mapToInt(x -> x).sum();
            list.remove(0);
        }
        return newArray;
    }

    /**
     * Best Performance.
     *
     * @param array array.
     * @return array.
     */
    public int[] sumParts3(final int[] array) {
        int[] newArray = new int[array.length + 1];
        int length = array.length;
        int totalSum = IntStream.of(array).sum();
        for (int i = 0; i < length; i++) {
            newArray[i] = totalSum;
            totalSum = totalSum - array[i];
        }
        return newArray;
    }

    /**
     * Best Performance.
     *
     * @param array array.
     * @return array
     */
    public int[] sumParts4(final int[] array) {
        int[] result = new int[array.length + 1];
        int counter = 0;
        for (int idx = array.length - 1; idx >= 0; idx--) {
            counter = counter + array[idx];
            result[idx] = counter;
        }
        return result;
    }

}

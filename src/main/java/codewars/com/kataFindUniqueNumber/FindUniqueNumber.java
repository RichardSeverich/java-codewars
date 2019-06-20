package codewars.com.kataFindUniqueNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.Map.Entry;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


/**
 * 6 kyu
 * <p>
 * Hay una matriz con algunos números. Todos los números son iguales excepto uno. Intenta encontrarlo!
 * <p>
 * Kata.findUnique (nuevo doble [] {1, 1, 1, 2, 1, 1}); // => 2
 * Kata.findUnique (nuevo doble [] {0, 0, 0.55, 0, 0}); // => 0.55
 * Se garantiza que la matriz contiene más de 3 números.
 * <p>
 * Las pruebas contienen algunos arreglos muy grandes, así que piensa en el rendimiento.
 * <p>
 * Este es el primer kata en serie:
 * <p>
 * Encuentra el número único (este kata)
 * Encuentra la cadena única
 * Encontrar el único
 */
public class FindUniqueNumber {

    /**
     * Constructor.
     */
    FindUniqueNumber() {

    }

    /**
     * Execution Timed Out.
     *
     * @param array array.
     * @return double.
     */
    public double findUnique(final double[] array) {
        List<Double> listDuplicates = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    count++;
                }
            }
            if (count > 0 && !listDuplicates.contains(array[i])) {
                listDuplicates.add(array[i]);
            }
        }
        ArrayList<Double> finalList;
        finalList = DoubleStream.of(array).boxed().collect(Collectors.toCollection(ArrayList::new));
        for (Double duplicateNumber : listDuplicates) {
            finalList.removeIf(number -> number.equals(duplicateNumber));
        }
        return finalList.get(0);
    }

    /**
     * @param array array.
     * @return double.
     */
    public double findUniquePro(final double[] array) {
        int length = array.length;
        double noRepeated = array[0];
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (array[i] == array[j] && i != j) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                noRepeated = array[i];
                break;
            }
        }
        return noRepeated;
    }

    /**
     * @param array array.
     * @return number.
     */
    public double findUniqueGood(final double[] array) {
        return Arrays.stream(array).boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Entry::getKey)
                .orElse(0.0);
    }
}

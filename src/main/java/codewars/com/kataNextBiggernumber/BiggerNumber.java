package codewars.com.kataNextBiggernumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 4kyu
 * <p>
 * Bad performance.
 *
 * <p>
 * You have to create a function that takes a positive integer number and returns the next bigger number
 * formed by the same digits:
 * <p>
 * 12 ==> 21
 * 513 ==> 531
 * 2017 ==> 2071
 * If no bigger number can be composed using those digits, return -1:
 * <p>
 * 9 ==> -1
 * 111 ==> -1
 * 531 ==> -1
 */
public class BiggerNumber {

    /**
     * Constructor.
     */
    BiggerNumber() {

    }

    /**
     * @param number number.
     * @return bigger or -1.
     */
    public long biggerNumber1(final long number) {
        List<String> listString = this.getListOfPermutations(Long.toString(number));
        List<Long> listLong = new ArrayList<>();
        for (String string : listString) {
            listLong.add(Long.parseLong(string));
        }
        long bigger = Collections.max(listLong);
        if (bigger == number) {
            return -1;
        }
        return bigger;
    }

    /**
     * @param number number.
     * @return number.
     */
    public long biggerNumber2(final long number) {
        String myString = Long.toString(number);
        String[] array = myString.split("");
        List<Long> listLong = new ArrayList<>();
        for (String string : array) {
            listLong.add(Long.parseLong(string));
        }
        Collections.sort(listLong);
        Collections.reverse(listLong);
        StringBuilder sb = new StringBuilder();
        for (long element : listLong) {
            sb.append(element);
        }
        long result;
        result = Long.parseLong(sb.toString());
        if (result == number) {
            return -1;
        }
        return result;
    }

    /**
     * Bad performance.
     *
     * @param number number.
     * @return number.
     */
    public long nextBiggerNumber(final long number) {
        List<String> listString = this.getListOfPermutations(Long.toString(number));
        String stringResult = "-1";
        for (String stringElement : listString) {
            long actualNum = Long.parseLong(stringElement);
            int index = listString.indexOf(stringElement);
            if (actualNum == number && index < listString.size() - 1) {
                stringResult = listString.get(index + 1);
            }
        }
        return Long.parseLong(stringResult);
    }

    /**
     * Bat: Execution Timed Out.
     *
     * @param str string.
     * @return Stream.
     */
    private Stream<String> permutationsStream(final String str) {
        Stream<String> myStream;
        if (str.isEmpty()) {
            myStream = Stream.of("");
            return myStream;
        }
        myStream = IntStream.range(0, str.length())
                .boxed()
                .flatMap(i ->
                        permutationsStream(str.substring(0, i) + str.substring(i + 1)).map(t -> str.charAt(i) + t)
                );
        return myStream;
    }

    /**
     * @param str string.
     * @return list.
     */
    private List<String> getListOfPermutations(final String str) {
        // return without duplicates.
        return this.permutationsStream(str).distinct().collect(Collectors.toList());
    }
}

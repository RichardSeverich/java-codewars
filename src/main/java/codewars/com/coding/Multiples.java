package codewars.com.coding;

/**
 * Created by RichardSeverich on 6/12/2017.
 */
public class Multiples {

    /**
     * @param number Is number.
     * @return return Sum of multiples of 3 and 5.
     */
    public int solution(final int number) {
        int result = 0;
        final int three = 3;
        final int five = 5;
        for (int i = 0; i < number; i++) {
            if (i % three == 0 || i % five == 0) {
                result += i;
            }
        }
        return result;
    }
}

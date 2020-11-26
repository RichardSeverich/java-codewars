package codewars.com.coding;

/**
 * Created by RichardSeverich on 8/18/2017.
 */
public class Sequence {

    /**
     * @param num is the number to convert.
     * @return the sequence number.
     */
    long getScore(long num) {
        long result = 0;
        while (num > 0) {
            result += num;
            num -= 1;
        }
        final int fifty = 50;
        return result * fifty;
    }
}

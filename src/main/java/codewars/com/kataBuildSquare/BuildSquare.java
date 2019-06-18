package codewars.com.kataBuildSquare;

/**
 * 7 kyu
 * <p>
 * I will give you an integer. Give me back a shape that is as long and wide as the integer. The integer will be a whole number between 0 and 50.
 * <p>
 * Example
 * n = 3, so I expect a 3x3 square back just like below as a string:
 * <p>
 * +++
 * +++
 * +++
 */
public class BuildSquare {


    /**
     * Constructor.
     */
    BuildSquare() {
    }

    /**
     * @param number number.
     * @return String.
     */
    public String generateShape(int number) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                result.append("+");
            }
            if (i != number - 1) {
                //result.append("\n");
                result.append(System.getProperty("line.separator"));
            }
        }
        return result.toString();
    }
}

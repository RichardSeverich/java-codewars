package codewars.com.micky.katas;

/**
 * Class.
 */
public class School {

    /**
     * @param marks marks.
     * @return resultado.
     */
    public static int getAverage(final int[] marks) {
        int resultado = 0;
        for (int i = 0; i < marks.length; i++) {
            resultado = (resultado + marks[i]);
        }
        resultado = resultado / marks.length;
        return resultado;
    }
}

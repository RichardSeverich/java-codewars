package codewars.com.micky.katas;

/**
 * Class.
 */
public final class Counter {

    /**
    * Constructor.
    */
    public Counter() {
    }

    /**
     * @param arrayOfSheeps arrayOfSheeps.
     * @return contador.
     */
    public int countSheeps(final Boolean[] arrayOfSheeps) {
        int contador = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i]) {
                contador++;
            }
        }
        return contador;
    }
}

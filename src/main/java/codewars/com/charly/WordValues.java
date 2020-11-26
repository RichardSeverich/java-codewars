package codewars.com.charly;

/**
Dada una cadena "abc" y asumiendo que cada letra de la cadena tiene un valor igual a su posición
en el alfabeto, nuestra cadena tendrá un valor de 1 + 2 + 3 = 6. Esto significa que:
a = 1, b = 2, c = 3 .... z = 26.
Se le dará una lista de cadenas y su tarea será devolver los valores de las cadenas como se
explicó anteriormente multiplicado por la posición de esa cadena en la lista. Para nuestro
propósito, la posición comienza con 1.
nameValue ["abc", "abc abc"] debería devolver [6,24] debido a [6 * 1, 12 * 2]. Observe cómo se
ignoran los espacios.
"abc" tiene un valor de 6, mientras que "abc abc" tiene un valor de 12. Ahora, el valor en la
posición 1 se multiplica por 1 mientras que el valor en la posición 2 se multiplica por 2.
La entrada solo contendrá caracteres en minúscula y espacios.
¡Buena suerte!
Si te gusta este Kata, prueba:
Emparejamiento de cuerdas
Valor consonante
https://www.codewars.com/kata/598d91785d4ce3ec4f000018/train/java
 */
public final class WordValues {

    /** Constructor. */
    private WordValues() { }

    /**
    * @param arr arr.
    * @return int.
    */
    public static int[] nameValue(final String[] arr) {
        int[] array = new int[arr.length];
        int multiplicador = -1;
        int add;
        char ch;
        for (String obtString : arr) {
            add = 0;
            multiplicador++;
            final int magic = -64;
            for (int j = 0; j < obtString.length(); ++j) {
                  ch = obtString.charAt(j);
                  int n = (int) ch - (int) 'a' + 1;
                if (!(n == (magic))) {
                    add = add + n;
                }
                if (obtString.length() == j + 1) {
                    array[multiplicador] = (add * (multiplicador + 1));
                    System.out.println(array[multiplicador] + obtString);
                }
            }
        }
        return array;
    }
}

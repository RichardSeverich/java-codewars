package codewars.com.kataStringMix;

/**
 * Dadas las dos cadenas s1 y s2, queremos visualizar cuán diferentes son las dos cadenas.
 * Solo tendremos en cuenta las letras minúsculas (de la A a la Z). Primero, contemos la
 * frecuencia de cada letra minúscula en s1 y s2
 * <p>
 * s1 = "A aaaa bb c"
 * <p>
 * s2 = "& aaa bbb c d"
 * <p>
 * s1 has 4 'a', 2 'b', 1 'c'
 * <p>
 * s2 has 3 'a', 3 'b', 1 'c', 1 'd'
 * <p>
 * Entonces, el máximo para 'a' en s1 y s2 es 4 desde s1; el máximo para 'b' es 3 de s2.
 * En lo que sigue no consideraremos las letras cuando el máximo de sus ocurrencias sea menor o igual a 1.
 * <p>
 * Podemos resumir las diferencias entre s1 y s2 en la siguiente cadena:
 * "1: aaaa / 2: bbb", donde 1 en 1: aaaa significa cadena s1 y aaaa porque el máximo para a es 4.
 * De la misma manera 2: bbb representa la cadena s2 y bbb porque el máximo para b es 3.
 * <p>
 * La tarea es producir una cadena en la que cada letra minúscula de s1 o s2 aparezca tantas veces
 * como máximo si este máximo es estrictamente mayor que 1; Estas letras irán precedidas por el número
 * de la cadena donde aparecerán con su valor máximo y:. Si el máximo está en s1 y en s2, el prefijo es = :.
 * <p>
 * En el resultado, las subcadenas (una subcadena es por ejemplo 2: nnnnn o 1: hhh; contiene el prefijo)
 * estarán en orden decreciente de su longitud y cuando tengan la misma longitud clasificada en orden
 * lexicográfico ascendente (letras y dígitos - más ordenado precisamente por punto de código); Los
 * diferentes grupos estarán separados por '/'. Ver ejemplos y "Prueba de ejemplo".
 * <p>
 * Esperemos que otros ejemplos puedan aclarar esto.
 * <p>
 * s1 = "my&friend&Paul has heavy hats! &"
 * s2 = "my friend John has many many friends &"
 * mix(s1, s2) --> "2:nnnnn/1:aaaa/1:hhh/2:mmm/2:yyy/2:dd/2:ff/2:ii/2
 * <p>
 * s1 = "mmmmm m nnnnn y&friend&Paul has heavy hats! &"
 * s2 = "my frie n d Joh n has ma n y ma n y frie n ds n&"
 * mix(s1, s2) --> "1:mmmmmm/=:nnnnnn/1:aaaa/1:hhh/2:yyy/2:dd/2:ff/2:
 * <p>
 * s1="Are the kids at home? aaaaa fffff"
 * s2="Yes they are here! aaaaa fffff"
 * mix(s1, s2) --> "=:aaaaaa/2:eeeee/=:fffff/1:tt/2:rr/=:hh"
 * <p>
 * Note for Swift, R, PowerShell
 * The prefix =: is replaced by E:
 * s1 = "mmmmm m nnnnn y&friend&Paul has heavy hats! &"
 * s2 = "my frie n d Joh n has ma n y ma n y frie n ds n&"
 * mix(s1, s2) --> "1:mmmmmm/E:nnnnnn/1:aaaa/1:hhh/2:yyy/2:dd/2:ff/2:ii/2:rr/E:ee/E:ss"
 */
public class StringsMix {

    StringsMix() {

    }

    public String mix(String stringOne, String StringTwo) {
        // your code
        return "";
    }

    public String[][] getArrayWithRepeated(final String string) {
        String[] arrayStrings = string.split("");
        int arrayLength = arrayStrings.length;
        // Result String
        String[][] result = new String[arrayLength][2];
        int indexArrayRepeated = 0;
        int countRepeated;
        // Iterate in order to make result
        for (int i = 0; i < arrayLength; i++) {
            countRepeated = 0;
            //Verify if is lowercase and if the element was counted.
            if (isLowerCase(arrayStrings[i]) && !isStringExistInArray(result, arrayStrings[i])) {
                for (int j = i; j < arrayLength; j++) {
                    if (arrayStrings[i].equals(arrayStrings[j])) {
                        countRepeated++;
                    }
                }
                if (countRepeated > 1) {
                    result[indexArrayRepeated][0] = arrayStrings[i];
                    result[indexArrayRepeated][1] = Integer.toString(countRepeated);
                    indexArrayRepeated++;
                }
            }
        }
        return result;
    }


    /**
     * @param arrayString arrayString.
     * @param string      string.
     * @return boolean.
     */
    public boolean isStringExistInArray(final String[][] arrayString, final String string) {
        if (arrayString == null) {
            return false;
        }
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i][0] == null) {
                break;
            }
            if (arrayString[i][0].equals(string)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param string string.
     * @return boolean.
     */
    public boolean isLowerCase(final String string) {
        char c = string.charAt(0);
        return Character.isLowerCase(c);
    }
}


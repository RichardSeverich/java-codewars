package codewars.com.kataAjedrez;

import java.util.HashMap;
import java.util.Map;

/**
 * Ayúdame con el juego.
 * La entrada consiste en una imagen de arte ASCII de un tablero de ajedrez con piezas de ajedrez en la posición
 * descrita por la entrada.
 * <p>
 * •	mientras que las piezas del jugador negro son letras minúsculas.
 * •	las piezas del jugador blanco se muestran en letras mayúsculas,
 * <p>
 * Las letras son una de:
 * "k" (king) - (Rey)
 * "Q" (Queen) - (Reina)
 * "R" (Rook) - (Torre)
 * "B" (Bishop) - (Obispo) - (Alfil)
 * "N" (Knight) - (Caballero) – (Caballo)
 * "P" (Pawn) - (Peón)
 * <p>
 * El contorno del tablero de ajedrez está hecho de más ("+")
 * menos ("-") y caracteres de barra ("'|").
 * El campo negro está lleno de dos puntos (":"), el campo blanco con puntos (".")
 * <p>
 * OUTPUT
 * La salida consta de dos líneas:
 * •	La primera línea consiste en la cadena "blanca", Seguido de la descripción de las posiciones de las piezas del
 * jugador blanco.
 * •	La segunda línea consiste en la cadena "negra", Seguido de la descripción de las posiciones de las piezas del
 * jugador blanco.
 * <p>
 * <p>
 * <p>
 * <p>
 * La descripción de la posición de las piezas es una lista de términos separados por comas (sin espacios) que
 * describen las piezas del jugador apropiado, la descripción de una pieza consiste en una sola letra mayúscula que
 * denota el tipo de la pieza (excepto de peones para los que se omite este identificador).
 * <p>
 * Esta letra es seguida inmediatamente por la posición de la pieza en la notación de ajedrez estándar: una letra
 * minúscula entre "a" y “h”, que determina la columna
 * ("a" es la columna más a la izquierda en la entrada)
 * y un solo dígito entre 1 y 8, eso determina la fila (8 es la primera fila de la entrada).
 * <p>
 * •	a-h columna   (izquierda “a”)
 * •	1-8 fila. (8 es la primera fila de la entrada.)
 * Las piezas en la descripción deben aparecer en el siguiente orden:
 * •	Kings (Q)
 * •	Queens (Q)
 * •	Rooks (R) 2
 * •	Bishops (B) 2
 * •	Kinght (N) 2
 * •	Pawns
 * <p>
 * Tenga en cuenta que el número de piezas de os puede diferir de la posición inicial y podría incluso corresponder a
 * una situación que podría surgir en un juego de ajedrez válido
 * <p>
 * Blanco: En caso de que aparezcan dos piezas del mismo tipo en la entrada, la pieza con el número de fila más
 * pequeño debe describirse antes que la otra si las piezas son blancas
 * <p>
 * Negro: En caso de que aparezcan dos piezas del mismo tipo en la entrada la pieza con el número de fila más grande
 * debe describirse antes que la otra si las piezas son negras.
 * <p>
 * Si dos piezas del mismo tipo aparecen en la misma fila, la que tiene la letra de la columna más pequeña debe
 * aparecer primero.
 */
public class Chess {

    Map<Integer, String[][]> mapBlack;
    String[][] arrayBlack = new String[16][2];

    Chess() {
        mapBlack = new HashMap<>();
    }


    public String count(final String input) {
        String[] tempArray = input.split("");
        int rowPosition = 8;
        int columnPosition = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (!(tempArray[i].equals("+") || tempArray[i].equals("-") || tempArray[i].equals("|"))) {
                if (tempArray[i].equals(".") || tempArray[i].equals(".")) {

                }

            }
        }

        return input;
    }

    /**
     * @param str str.
     * @return return.
     */
    public String verifyType(final String str) {
        switch (str) {
            case "k":
                // code block
                break;
            case "q":
                // code block
                break;
            case "r":
                // code block
                break;
            case "b":
                // code block
                break;
            case "n":
                // code block
                break;
            case "p":
                // code block
                break;
            case "K":
                // code block
                break;
            case "Q":
                // code block
                break;
            case "R":
                // code block
                break;
            case "B":
                // code block
                break;
            case "N":
                // code block
                break;
            case "P":
                // code block
                break;
            default:
                // code block
        }
        return "";
    }


    /**
     * A = 0 – 2
     * B = 3 – 5
     * C = 7 – 8
     * D = 9 – 11
     * E = 12 – 14
     * F = 15 – 17
     * G = 18 – 20
     * E = 21- 23
     *
     * @param column column.
     * @return string.
     */
    public String mappingColumn(final int column) {
        if (column >= 0 && column <= 2) {
            return "a";
        } else if (column >= 3 && column <= 5) {
            return "b";
        } else if (column >= 7 && column <= 8) {
            return "c";
        } else if (column >= 9 && column <= 11) {
            return "d";
        } else if (column >= 12 && column <= 14) {
            return "e";
        } else if (column >= 15 && column <= 17) {
            return "e";
        } else if (column >= 18 && column <= 20) {
            return "e";
        } else if (column >= 21 && column <= 23) {
            return "e";
        } else {
            return "";
        }
    }
}

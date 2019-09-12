package codewars.com.kataAjedrez;

import java.util.*;

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

    // Arrays
    private List<String> listBack;
    private List<String> listWhite;

    // Helpers
    private int rowPosition;
    private int columnPosition;
    private int countLineSeparator;
    private String temp;


    /**
     * Constructor.
     */
    Chess() {
        //List
        listBack = new ArrayList<>();
        listWhite = new ArrayList<>();
        //Helpers
        rowPosition = 8;
        columnPosition = 0;
        countLineSeparator = 0;

        setDefaultValuesList();
    }


    /**
     *
     */
    private void setDefaultValuesList() {
        for (int i = 0; i < 16; i++) {
            listBack.add("empty");
            listWhite.add("empty");
        }
    }


    /**
     * @param input input.
     * @return positions.
     */
    public String getPosition(final String input) {
        String[] tempArray = input.split("");
        for (int i = 0; i < tempArray.length; i++) {
            temp = tempArray[i];
            this.updateRowPosition();
            if (isPlace()) {
                columnPosition++;
            }
            if (isPiece()) {
                columnPosition++;
                addPositionsToList();
            }
        }
        return input;
    }

    /**
     * @return boolean.
     */
    private boolean isPiece() {
        return !(temp.equals("+")
                || temp.equals("-")
                || temp.equals("|")
                || temp.equals(".")
                || temp.equals(":")
                || temp.equals(System.getProperty("line.separator")));
    }

    /**
     * @return boolean.
     */
    private boolean isPlace() {
        return temp.equals(".") || temp.equals(":");
    }

    /**
     * updateRowPosition.
     */
    private void updateRowPosition() {
        if (this.temp.equals(System.getProperty("line.separator"))) {
            this.countLineSeparator++;
            if (this.countLineSeparator == 2) {
                this.countLineSeparator = 0;
                this.rowPosition--;
            }
        }
    }


    /**
     *
     */
    public void addPositionsToList() {
        String column = mappingColumn(columnPosition);
        switch (temp) {
            case "k":
                listBack.add(0, "K" + column + rowPosition);
                break;
            case "q":
                listBack.add(1, "Q" + column + rowPosition);
                break;
            case "r":
                if (listBack.get(2).equals("empty")) {
                    listBack.add(2, "R" + column + rowPosition);
                } else {
                    listBack.add(3, "R" + column + rowPosition);
                }
                break;
            case "b":
                if (listBack.get(4).equals("empty")) {
                    listBack.add(4, "B" + column + rowPosition);
                } else {
                    listBack.add(5, "B" + column + rowPosition);
                }
                break;
            case "n":
                if (listBack.get(6).equals("empty")) {
                    listBack.add(6, "N" + column + rowPosition);
                } else {
                    listBack.add(7, "N" + column + rowPosition);
                }
                break;
            case "p":
                listBack.add(column + rowPosition);
                break;
            case "K":
                listWhite.add("K" + column + rowPosition);
                break;
            case "Q":
                listWhite.add("Q" + column + rowPosition);
                break;
            case "R":
                if (listWhite.get(2).equals("empty")) {
                    listWhite.add(2, "R" + column + rowPosition);
                } else {
                    listWhite.add(3, "R" + column + rowPosition);
                }
                break;
            case "B":
                if (listWhite.get(4).equals("empty")) {
                    listWhite.add(4, "B" + column + rowPosition);
                } else {
                    listWhite.add(5, "B" + column + rowPosition);
                }
                break;
            case "N":
                if (listWhite.get(6).equals("empty")) {
                    listWhite.add(6, "N" + column + rowPosition);
                } else {
                    listWhite.add(7, "N" + column + rowPosition);
                }
                break;
            case "P":
                listWhite.add(column + rowPosition);
                break;
            default:
        }
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

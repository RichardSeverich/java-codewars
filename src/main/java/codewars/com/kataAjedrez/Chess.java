package codewars.com.kataAjedrez;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * Ayúdame con el juego.
 * La entrada consiste en una imagen de arte ASCII de un tablero de ajedrez con piezas de ajedrez en la posición
 * descrita por la entrada.
 * <p>
 * •  mientras que las piezas del jugador negro son letras minúsculas.
 * •  las piezas del jugador blanco se muestran en letras mayúsculas,
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
 * •  La primera línea consiste en la cadena "blanca", Seguido de la descripción de las posiciones de las piezas del
 * jugador blanco.
 * •  La segunda línea consiste en la cadena "negra", Seguido de la descripción de las posiciones de las piezas del
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
 * minúscula entre "a" y "h", que determina la columna
 * ("a" es la columna más a la izquierda en la entrada)
 * y un solo dígito entre 1 y 8, eso determina la fila (8 es la primera fila de la entrada).
 * <p>
 * •  a-h columna   (izquierda "a")
 * •  1-8 fila. (8 es la primera fila de la entrada.)
 * Las piezas en la descripción deben aparecer en el siguiente orden:
 * •  Kings (Q)
 * •  Queens (Q)
 * •  Rooks (R) 2
 * •  Bishops (B) 2
 * •  Kinght (N) 2
 * •  Pawns
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

    private static final String LINE_SEPARATOR = "line.separator";

    // Strings
    private StringBuilder kingBlack;
    private StringBuilder queenBlack;
    private StringBuilder kingWhite;
    private StringBuilder queenWhite;

    // Arrays
    private List<String> listBlackRook;
    private List<String> listWhiteRook;
    private List<String> listBlackBishop;
    private List<String> listWhiteBishop;
    private List<String> listBlackKnight;
    private List<String> listWhiteKnight;
    private List<String> listBlackPawn;
    private List<String> listWhitePawn;

    // Helpers
    private int rowPosition;
    private int columnPosition;
    private int countLineSeparator;
    private String temp;


    /**
     * Constructor.
     */
    Chess() {
        // Strings
        kingBlack = new StringBuilder();
        queenBlack = new StringBuilder();
        kingWhite = new StringBuilder();
        queenWhite = new StringBuilder();
        //List black
        listBlackRook = new ArrayList<>();
        listBlackBishop = new ArrayList<>();
        listBlackKnight = new ArrayList<>();
        listBlackPawn = new ArrayList<>();
        //List white
        listWhiteRook = new ArrayList<>();
        listWhiteBishop = new ArrayList<>();
        listWhiteKnight = new ArrayList<>();
        listWhitePawn = new ArrayList<>();
        //Helpers
        final int rowPos = 8;
        rowPosition = rowPos;
        columnPosition = 0;
        countLineSeparator = 0;

    }

    /**
     * @param temp temp.
     */
    public void setTemp(final String temp) {
        this.temp = temp;
    }


    /**
     * @param input input.
     * @return positions.
     */
    public String getPositions(final String input) {
        final int  num = 33;
        String[] tempArray = input.split("");
        for (int i = num; i < tempArray.length; i++) {
            temp = tempArray[i];
            this.updateRowPosition();
            if (isPlace()) {
                columnPosition++;
            }
            if (isPiece()) {
                columnPosition++;
                fillPositionsToList();
            }
        }
        return this.getResult();
    }


    /**
     * fillPositionsToList.
     */
    public void fillPositionsToList() {
        if (isLowercase()) {
            addPositionsToList(kingBlack, queenBlack, listBlackRook, listBlackBishop, listBlackKnight, listBlackPawn);
        } else {
            addPositionsToList(kingWhite, queenWhite, listWhiteRook, listWhiteBishop, listWhiteKnight, listWhitePawn);
        }
    }

    /**
     * fillPositionsToList.
     * @return String.
     */
    public String getResult() {
        StringBuilder result = new StringBuilder();
        String start;
        start = "White: ";
        // Sort Lists
        final int three = 3;
        listWhitePawn = sort(listWhitePawn, 2);
        listWhiteRook = sort(listWhiteRook, three);
        listWhiteBishop = sort(listWhiteBishop, three);
        listWhiteKnight = sort(listWhiteKnight, three);
        result.append(buildResult(start, kingWhite, queenWhite, listWhiteRook, listWhiteBishop,
                listWhiteKnight, listWhitePawn));
        result.setLength(result.length() - 1);
        result.append(System.getProperty(LINE_SEPARATOR));
        start = "Black: ";
        result.append(buildResult(start, kingBlack, queenBlack, listBlackRook, listBlackBishop,
                listBlackKnight, listBlackPawn));
        result.setLength(result.length() - 1);
        return result.toString();
    }

    /**
     * @param start      start.
     * @param king       king.
     * @param queen      queen.
     * @param listRook   listRook.
     * @param listBishop listBishop.
     * @param listKnight listKnight.
     * @param listPawn   listPawn.
     * @return result.
     */
    public String buildResult(final String start, final StringBuilder king, final StringBuilder queen,
                              final List<String> listRook, final List<String> listBishop,
                              final List<String> listKnight, final List<String> listPawn) {
        StringBuilder sb = new StringBuilder();
        sb.append(start);
        sb.append(king.toString());
        sb.append(queen.toString());
        sb.append(getStringOfListElements(listRook));
        sb.append(getStringOfListElements(listBishop));
        sb.append(getStringOfListElements(listKnight));
        sb.append(getStringOfListElements(listPawn));
        return sb.toString();
    }

    /**
     * @param list list.
     * @return String.
     */
    public String getStringOfListElements(final List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
            sb.append(",");
        }
        return sb.toString();
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
                || temp.equals("\n")
                || temp.equals("\r"));
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
        if (this.temp.equals("\r")) {
            this.countLineSeparator++;
            if (this.countLineSeparator == 2) {
                this.countLineSeparator = 0;
                this.rowPosition--;
                this.columnPosition = 0;
            }
        }
    }

    /**
     * @return boolean.
     */
    public boolean isUppercase() {
        return temp.matches("[A-Z]+");
    }

    /**
     * @return boolean.
     */
    public boolean isLowercase() {
        return temp.matches("[a-z]+");
    }

    /**
     * @param king       king.
     * @param queen      queen.
     * @param listRook   listRook.
     * @param listBishop listBishop.
     * @param listKnight listKnight.
     * @param listPawn   listPawn.
     */
    public void addPositionsToList(final StringBuilder king, final StringBuilder queen,
                                   final List<String> listRook, final List<String> listBishop,
                                   final List<String> listKnight, final List<String> listPawn) {
        String column = mappingColumn();
        switch (temp.toUpperCase()) {
            case "K":
                king.append("K").append(column).append(rowPosition).append(",");
                break;
            case "Q":
                queen.append("Q").append(column).append(rowPosition).append(",");
                break;
            case "R":
                listRook.add("R" + column + rowPosition);
                break;
            case "B":
                listBishop.add("B" + column + rowPosition);
                break;
            case "N":
                listKnight.add("N" + column + rowPosition);
                break;
            case "P":
                listPawn.add(column + rowPosition);
                break;
            default:
        }
    }

    /**
     * A = 0 – 2.
     * B = 3 – 5
     * C = 7 – 8
     * D = 9 – 11
     * E = 12 – 14
     * F = 15 – 17
     * G = 18 – 20
     * E = 21- 23
     *
     * @return string.
     */
    public String mappingColumn() {
        final int two = 2;
        final int three = 3;
        final int five = 5;
        final int seven = 7;
        final int eight = 8;
        final int nine = 9;
        final int eleven = 11;
        final int twelve = 12;
        final int forTeen = 14;
        final int fiveTeen = 15;
        final int sevenTeen = 17;
        final int egihtTeen = 18;
        final int twenty = 20;
        final int twentyOne = 21;
        final int twentyThree = 23;
        if (columnPosition >= 0 && columnPosition <= two) {
            return "a";
        } else if (columnPosition >= three && columnPosition <= five) {
            return "b";
        } else if (columnPosition >= seven && columnPosition <= eight) {
            return "c";
        } else if (columnPosition >= nine && columnPosition <= eleven) {
            return "d";
        } else if (columnPosition >= twelve && columnPosition <= forTeen) {
            return "e";
        } else if (columnPosition >= fiveTeen && columnPosition <= sevenTeen) {
            return "f";
        } else if (columnPosition >= egihtTeen && columnPosition <= twenty) {
            return "g";
        } else if (columnPosition >= twentyOne && columnPosition <= twentyThree) {
            return "h";
        } else {
            return "null";
        }
    }

    /**
     * @param listParam       list.
     * @param stringSize stringSize.
     * @return list sorted.
     */
    public List<String> sort(final List<String> listParam, final int stringSize) {
        List<String> list = listParam;
        String[] spam = list.toArray(new String[0]);
        Arrays.sort(spam);
        list = Arrays.asList(spam);
        int indexNumber = stringSize - 1;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                char valueOne = list.get(i).charAt(indexNumber);
                char valueTwo = list.get(j).charAt(indexNumber);
                if (valueOne > valueTwo && i != j) {
                    String stringHelper = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, stringHelper);
                }
            }
        }
        return list;
    }
}

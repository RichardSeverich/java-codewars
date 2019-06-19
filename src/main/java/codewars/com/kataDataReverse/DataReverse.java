package codewars.com.kataDataReverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * 6kyu
 * <p>
 * Se recibe un flujo de datos y se debe revertir.
 * <p>
 * Cada segmento tiene una longitud de 8 bits, lo que significa que el orden de estos segmentos debe invertirse,
 * por ejemplo:
 * <p>
 * 11111111 00000000 00001111 10101010
 *   (byte1) (byte2) (byte3) (byte4)
 * debe convertirse:
 * <p>
 * 10101010 00001111 00000000 11111111
 *   (byte4) (byte3) (byte2) (byte1)
 * El número total de bits siempre será un múltiplo de 8.
 * <p>
 * Los datos se dan en una matriz como tal:
 * <p>
 * [1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1 , 0,1,0,1,0,1,0]
 * Nota: En los idiomas C y NASM se le da el tercer parámetro, que es el número de bloques de segmentos.
 */
public class DataReverse {

    /**
     * @param arrayInt arrayInt.
     * @return array.
     */
    public int[] getDataReverse(int[] arrayInt) {
        //Count number of rows
        int longBytes = 8;
        int[] singleArrayInt = new int[longBytes];
        List<Integer> listIntegerResult = new ArrayList<>();
        int indexSingle = 0;
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            singleArrayInt[indexSingle] = arrayInt[i];
            indexSingle++;
            if (indexSingle == longBytes) {
                // Convert array(int) to array(Integer).
                Stream<Integer> myStream = Arrays.stream(singleArrayInt).boxed();
                Integer[] arrayInteger = myStream.toArray(Integer[]::new);
                // Convert array(Integer) to list(Integer)
                List<Integer> listInteger = Arrays.asList(arrayInteger);
                // Reverse list.
                Collections.reverse(listInteger);
                // Add reverse to result arrayList.
                listIntegerResult.addAll(listInteger);
                indexSingle = 0;
            }
        }
        return listIntegerResult.stream().mapToInt(x -> x).toArray();
    }

    /**
     * @param data data.
     * @return array.
     */
    public int[] dataReverseGood1(int[] data) {
        int bytes[] = new int[data.length];
        for (int i = data.length - 8, j = 0; i >= 0; i -= 8, j += 8) {
            System.arraycopy(data, i, bytes, j, 8);
        }
        return bytes;
    }

    /**
     * @param data data.
     * @return array.
     */
    public int[] dataReverseGood2(int[] data) {
        return java.util.stream.IntStream.range(0, data.length)
                .map(i -> data[data.length - 8 - (i / 8 * 8) + (i % 8)])
                .toArray();
    }
}

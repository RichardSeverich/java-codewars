package codewars.com.micky.katas;

import java.util.ArrayList;

public class ReturnRepeat {

    //[a, a, b]
    public static String getRepeat(String[] array){
        int indexMayor = 0;
        int contadorActual = 0;
        int contadorAnterior = 0;
        String valid = "";
        for (int i = 0; i < array.length; i ++) {
            if (! valid.contains(array[i])){
                contadorActual = contarRepetidos(array, array[i]);
                if (contadorActual > contadorAnterior) {
                    contadorAnterior = contadorActual;
                    indexMayor = i;
                }
                valid = valid + array[i];
            }
        }
        return array[indexMayor];
    }

    public static int contarRepetidos(String[] array, String buscar) {
        int contador = 0;
        for (String valor : array) {
            if (buscar.equalsIgnoreCase(valor)) {
                contador ++;
            }
        }
        return contador;
    }
}

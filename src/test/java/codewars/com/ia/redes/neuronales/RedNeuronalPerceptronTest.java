package codewars.com.ia.redes.neuronales;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test.
 */
public class RedNeuronalPerceptronTest {


    private RedNeuronalPerceptron redNeuronal;
    private Neurona neurona;

    /**
     * Test 1.
     * NAND
     * Un perceptrón aprende a realizar la función binaria NAND con entradas X1 y X2
     * En este ejercicio usaremos Entradas: X0, X1 y X2, donde X1, se mantiene constante en 1.
     * https://es.wikipedia.org/wiki/Perceptron
     *
     */
    @Test
    public void test1() {
        // Datos Generales
        final Double bias =  0.0;
        final Double umbral =  0.5;
        final Double tasaAprendizaje =  0.1;
        // Datos Neurona
        // Numero de neuronas 4
        final Double[][] arrayEntradas = { 
            {1.0, 0.0, 0.0},
            {1.0, 0.0, 1.0},
            {1.0, 1.0, 0.0},
            {1.0, 1.0, 1.0},
        };
        Double[] arrayPesos = {0.0, 0.0, 0.0};
        final Double[] araySalidaDeseada = {1.0, 1.0, 1.0, 0.0};
        // Datos red neurona
        final int numeroInteraciones = 50;
        final int numeroNeuronas = 4;

        int index = 0;
        for(int i = 0; i < numeroInteraciones; i++) {
            if(index > numeroNeuronas - 1){
                System.out.println("******* ******* Interacion ******* ******* *******");
                index = 0;
            }
            neurona = new Neurona(
                arrayEntradas[index],
                arrayPesos,
                araySalidaDeseada[index],
                bias,
                umbral,
                tasaAprendizaje );
            redNeuronal = new RedNeuronalPerceptron(neurona);
            redNeuronal.entrenar();
            arrayPesos = neurona.arrayNuevosPesos;
            System.out.println("******* Neurona " + index + " *******");
            System.out.println("Resultado Esperado: " + neurona.salidaDeseada);
            System.out.println("Resultado Obtenido: " + neurona.sumatoria);
            System.out.println("Entradas: " + Arrays.toString(neurona.arrayEntradas));
            System.out.println("Pesos: " + Arrays.toString(neurona.arrayPesos));
            System.out.println("Pesos Nuevos: " + Arrays.toString(neurona.arrayNuevosPesos));
            System.out.println("Sensor: " + Arrays.toString(neurona.arraySensor));
            System.out.println("Red: " + neurona.red);
            System.out.println("Error: " + neurona.error);
            System.out.println("Correccion: " + neurona.correccion);
            System.out.println("Tasa Aprendizaje: " + neurona.tasaAprendizaje);
            System.out.println(" ");
            index++;
        }
    }
}

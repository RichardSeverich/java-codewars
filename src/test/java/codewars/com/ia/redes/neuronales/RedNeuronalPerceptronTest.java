package codewars.com.ia.redes.neuronales;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test.
 */
public class RedNeuronalPerceptronTest {


    private RedNeuronalPerceptron redneuronal;
    private Neurona neurona1;
    private Neurona neurona2;

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
        // Datos Neurona 1
        final Double[] arrayEntradas1 = {1.0, 0.0, 0.0};
        final Double[] arrayPesos1 = {0.0, 0.0, 0.0};
        final Double salidaDeseada1 = 1.0;
        neurona1 = new Neurona(
          arrayEntradas1, 
          arrayPesos1,
          salidaDeseada1,
          bias,
          umbral,
          tasaAprendizaje );
        redneuronal = new RedNeuronalPerceptron(neurona1);
        redneuronal.entrenar();
        System.out.println("sumatoria " + neurona1.sumatoria);
        System.out.println("error " + neurona1.error);
        System.out.println("red " + neurona1.red);
        System.out.println("salidaDeseada " + neurona1.salidaDeseada);
        System.out.println("correccion " + neurona1.correccion);
        System.out.println( Arrays.toString(neurona1.arrayNuevosPesos));
    }
}

package codewars.com.ia.redes.neuronales;

/**
 * Class.
 */
public class Neurona {

    protected Double[] arrayEntradas; // x1, x2 ... xn
    protected Double[] arrayPesos; // w1, w2 ... wn
    protected Double[] arrayNuevosPesos; //
    protected Double[] arraySensor; // c0, c1 ... cn
    protected Double sumatoria; // (s) (resultado obtenido)
    protected Double umbral; // (t) sesgo
    protected Double bias; // (b)
    protected Double tasaAprendizaje; // (r) epsilon
    protected Double error; // (e)
    protected Double red; // (n)
    protected Double salidaDeseada; // (z)
    protected Double correccion; // d

    /**
    * @param arrayEntradas arrayEntradas.
    * @param arrayPesos arrayPesos.
    * @param salidaDeseada salidaDeseada.
    * @param bias bias.
    * @param umbral umbral.
    * @param tasaAprendizaje tasaAprendizaje.
    */
    Neurona(
        final Double[] arrayEntradas,
        final Double[] arrayPesos,
        final Double salidaDeseada,
        final Double bias,
        final Double umbral,
        final Double tasaAprendizaje) {
        this.arrayEntradas = arrayEntradas;
        this.arrayPesos = arrayPesos;
        this.salidaDeseada = salidaDeseada;
        this.bias = bias;
        this.umbral = umbral;
        this.tasaAprendizaje = tasaAprendizaje;
        this.arrayNuevosPesos = new Double[arrayPesos.length];
        this.arraySensor = new Double[arrayEntradas.length];
        this.sumatoria = 0.0;
    }
}

package codewars.com.ia.redes.neuronales;

/**
 * Class.
 */
public class Neurona {

    public Double[] arrayEntradas; // x1, x2 ... xn
    public Double[] arrayPesos; // w1, w2 ... wn
    public Double[] arrayNuevosPesos; //
    public Double[] arraySensor; // c0, c1 ... cn
    public Double sumatoria; // (s) (resultado obtenido)
    public Double umbral; // (t) sesgo
    public Double bias; // (b)
    public Double tasaAprendizaje; // (r) epsilon
    public Double error; // (e)
    public Double red; // (n)
    public Double salidaDeseada; // (z)
    public Double correccion; // d

    /** 
    * @param arrayEntradas.
    * @param arrayPesos.
    * @param salidaDeseada.
    * @param bias.
    * @param umbral.
    * @param tasaAprendizaje.
    */
    Neurona (
        Double[] arrayEntradas, 
        Double[] arrayPesos,
        Double salidaDeseada,
        Double bias,
        Double umbral,
        Double tasaAprendizaje) {
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

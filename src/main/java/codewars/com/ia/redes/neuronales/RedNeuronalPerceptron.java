package codewars.com.ia.redes.neuronales;

/**
 * Class.
 * https://es.wikipedia.org/wiki/Perceptron
 */
public class RedNeuronalPerceptron implements IRedNeuronal {

    private Neurona neurona;

    /**
     * Constructor.
     * @param neurona neurona.
     */
    public RedNeuronalPerceptron(final Neurona neurona) {
        this.neurona = neurona;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void funcionAgregacion() {
        for (int i = 0; i < this.neurona.arrayEntradas.length; i++) {
            this.neurona.arraySensor[i] = this.neurona.arrayEntradas[i] * this.neurona.arrayPesos[i];
            this.neurona.sumatoria +=  this.neurona.arraySensor[i];
        }
        this.neurona.sumatoria += this.neurona.bias;
    }

    /**
     * {@inheritDoc}
     * funcion sigmoide.
     */
    @Override
    public void funcionActivacion() {
        this.neurona.red = this.neurona.sumatoria > this.neurona.umbral ? 1.0 : 0.0;
    }

    /** calcular error. */
    public void calcularError() {
        // Salida deseada - Salida obtenida
        this.neurona.error = this.neurona.salidaDeseada - neurona.red;
    }

    /** calcular correccion. */
    public void calcularCorreccion() {
        this.neurona.correccion = this.neurona.tasaAprendizaje * this.neurona.error;
    }

    /** calcular nuevos pesos. */
    public void calcularPesosNuevos() {
        for (int i = 0; i < this.neurona.arraySensor.length; i++) {
            this.neurona.arrayNuevosPesos[i] = this.neurona.arrayPesos[i]
            + this.neurona.correccion * this.neurona.arrayEntradas[i];
        }
    }

     /**
     * {@inheritDoc}
     */
    @Override
    public void entrenar() {
        funcionAgregacion();
        funcionActivacion();
        calcularError();
        calcularCorreccion();
        calcularPesosNuevos();
    }
}

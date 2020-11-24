package codewars.com.ia.redes.neuronales;

/**
 * Class. 
 * https://es.wikipedia.org/wiki/Perceptron
 */
public class RedNeuronalPerceptron implements IRedNeuronal {

    private Neurona neurona;

    /**
     * Constructor.
     */
    public RedNeuronalPerceptron(final Neurona neurona) {
        this.neurona = neurona;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void funcionAgregacion() {
        for(int i = 0; i < this.neurona.arrayEntradas.length; i++) {
            this.neurona.arraySensor[i] = this.neurona.arrayEntradas[i] * this.neurona.arrayPesos[i];
            this.neurona.sumatoria +=  this.neurona.arraySensor[i];
        }
    }

    /**
     * {@inheritDoc}
     * funcion sigmoide.
     */
    @Override
    public void funcionActivacion() {
        this.neurona.red = this.neurona.sumatoria > this.neurona.umbral ? 1.0 : 0.0;
    }

    /** calcular error */
    public void calcularError(){
        this.neurona.error = this.neurona.salidaDeseada-neurona.red;
    }

    /** calcular correccion */
    public void calcularCorreccion(){
        this.neurona.correccion = this.neurona.tasaAprendizaje * this.neurona.error;
    }

    /** calcular nuevos pesos */
    public void calcularPesosNuevos(){
        int index = 0;
        for(Double entrada: this.neurona.arrayEntradas){
            this.neurona.arrayNuevosPesos[index] = entrada * this.neurona.correccion;
            index++;
        }
    }

     /**
     * {@inheritDoc}
     */
    @Override
    public void entrenar(){
        funcionAgregacion();
        funcionActivacion();
        calcularError();
        calcularCorreccion();
        calcularPesosNuevos();
    }
}

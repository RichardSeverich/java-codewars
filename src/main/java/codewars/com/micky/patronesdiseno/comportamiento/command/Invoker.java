package codewars.com.micky.patronesdiseno.comportamiento.command;

import java.util.ArrayList;

/**
 * Class.
 */
public class Invoker {
    private ArrayList<IOperacion> operacionList = new ArrayList<>();

    /**
     * Constructor.
     */
    public Invoker() {
    }

    /**
    * @param operacion operacion.
    */
    public void recibirOperacion(final IOperacion operacion) {
        operacionList.add(operacion);
    }

    /**
    * Method.
    */
    public void hacerOperacion() {
        for (IOperacion operacion : operacionList) {
            operacion.executar();
        }
        operacionList.clear();
    }
}

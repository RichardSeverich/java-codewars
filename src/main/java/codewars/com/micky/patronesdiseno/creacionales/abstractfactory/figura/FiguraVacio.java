package codewars.com.micky.patronesdiseno.creacionales.abstractfactory.figura;

/**
 * Class.
 */
public class FiguraVacio implements IFigura {

    /**
     * Constructor.
     */
    public FiguraVacio() {
    }

    /**
    * @return String.
    */
    @Override
    public String descripcion() {
        return "No eligio figura";
    }
}

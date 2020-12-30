package codewars.com.micky.patronesdiseno.creacionales.abstractfactory.color;

/**
 * Class.
 */
public class ColorVacio implements IColor {

    /**
     * Constructor.
     */
    public ColorVacio() {
    }

    /**
    * @return String.
    */
    public String descripcion() {
        return "no introdujo color";
    }
}

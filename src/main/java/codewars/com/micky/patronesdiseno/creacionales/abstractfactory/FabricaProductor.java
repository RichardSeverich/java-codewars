package codewars.com.micky.patronesdiseno.creacionales.abstractfactory;

/**
 * Class.
 */
public class FabricaProductor {

    /**
     * Constructor.
     */
    protected FabricaProductor() {
    }

    /**
     * @param tipoFabrica tipoFabrica.
     * @return FabricaAbstracta.
     */
    public static FabricaAbstracta getFabrica(final String tipoFabrica) {
        switch (tipoFabrica) {
            case "figura":
                return new FabricaFigura();
            case "color":
                return new FabricaColor();
            default:
                return null;
        }
    }
}

package codewars.com.micky.solid.interfacesegregation.good;

/**
 * Class.
 */
public class Impresora implements Imprimir, Engrampar, Copiar, EnviarFax, SubirInternet, ImprimirLaser, ImprimirColores,
        ImprimirNegro {

    /**
     * @return String.
     */
    public String getImprimir() {
        return "se imprimio";
    }

    /**
     * @return String.
     */
    public String getEngrampar() {
        return "se engrampo";
    }

    /**
     * @return String.
     */
    public String getCopiar() {
        return "se copio";
    }

    /**
     * @return String.
     */
    public String getEnviarFax() {
        return "se envio fax";
    }

    /**
     * @return String.
     */
    public String getSubirInternet() {
        return "se subio a internet";
    }

    /**
     * @return String.
     */
    public String getImprimirLaser() {
        return "se imprimio laser";
    }

    /**
     * @return String.
     */
    public String getImprimirColores() {
        return "se imprimio colores";
    }

    /**
     * @return String.
     */
    public String getImprimirNegro() {
        return "se imprimio negro";
    }
}

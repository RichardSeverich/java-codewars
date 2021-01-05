package codewars.com.micky.patronesdiseno.creacionales.factory;

import codewars.com.micky.patronesdiseno.creacionales.factory.productos.IFigura;
import codewars.com.micky.patronesdiseno.creacionales.factory.productos.FiguraCuadrado;
import codewars.com.micky.patronesdiseno.creacionales.factory.productos.FiguraCirculo;
import codewars.com.micky.patronesdiseno.creacionales.factory.productos.FiguraRectangulo;
import codewars.com.micky.patronesdiseno.creacionales.factory.productos.FiguraVacio;

/**
 * Class.
 */
public class FabricaFigura {

    /**
     * Constructor.
     */
    public FabricaFigura() {
    }

    /**
     * @param tipoFigura tipoFigura.
     * @return IFigura.
     */
    public IFigura crearFigura(final String tipoFigura) {
        switch (tipoFigura) {
            case "cuadrado":
                return new FiguraCuadrado();
            case "rectangulo":
                return new FiguraRectangulo();
            case "circulo":
                return new FiguraCirculo();
            case "":
                return new FiguraVacio();
            default:
                return new FiguraVacio();
        }
    }
}

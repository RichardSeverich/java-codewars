package codewars.com.micky.patronesdiseno.creacionales.abstractfactory;

import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.color.IColor;
import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.figura.FiguraCirculo;
import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.figura.FiguraCuadrado;
import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.figura.FiguraRectangulo;
import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.figura.FiguraVacio;
import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.figura.IFigura;

/**
 * Class.
 */
public class FabricaFigura implements FabricaAbstracta {

    /**
     * Constructor.
     */
    public FabricaFigura() {
    }

    /**
     * @param figura figura.
     * @return IFigura.
     */
    @Override
    public IFigura crearFigura(final String figura) {
        switch (figura) {
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

    /**
     * @param color color.
     * @return IColor.
     */
    @Override
    public IColor crearColor(final String color) {
        return null;
    }

}

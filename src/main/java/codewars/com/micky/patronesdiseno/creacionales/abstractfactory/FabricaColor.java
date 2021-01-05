package codewars.com.micky.patronesdiseno.creacionales.abstractfactory;

import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.figura.IFigura;
import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.color.ColorAzul;
import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.color.ColorRojo;
import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.color.ColorVacio;
import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.color.ColorVerde;
import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.color.IColor;

/**
 * Class.
 */
public class FabricaColor implements FabricaAbstracta {

    /**
     * Constructor.
     */
    public FabricaColor() {
    }

    /**
     * @param color color.
     * @return IColor.
     */
    @Override
    public IColor crearColor(final String color) {
        switch (color) {
            case "verde":
                return new ColorVerde();
            case "rojo":
                return new ColorRojo();
            case "azul":
                return new ColorAzul();
            case "":
                return new ColorVacio();
            default:
              return new ColorVacio();
        }
    }

    /**
     * @param figura figura.
     * @return IFigura.
     */
    @Override
    public IFigura crearFigura(final String figura) {
        return null;
    }
}

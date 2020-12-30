package codewars.com.micky.patronesdiseno.creacionales.abstractfactory;

import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.figura.IFigura;
import codewars.com.micky.patronesdiseno.creacionales.abstractfactory.color.IColor;

/**
 * Interface.
 */
public interface FabricaAbstracta {

    /**
     * @param figura figura.
     * @return IFigura.
     */
    IFigura crearFigura(String figura);

    /**
     * @param color color.
     * @return IColor.
     */
    IColor crearColor(String color);
}

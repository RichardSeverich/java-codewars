package codewars.com.exampleSolidSingleResponsibility.bad;

/**
 * Class.
 */
public class Circle {

    /**
     * '
     *
     * @param option option
     * @param base   base
     * @param height height
     * @param radius radius
     * @return area
     */
    public double getArea(final String option, final double base, final double height, double radius) {
        switch (option) {
            case "Square":
                // area de un cuadrado
                return base * base;
            case "Rectangle":
                // area de un rectangulo
                return base * height;
            case "Circle":
                // area de un circulo
                return Math.PI * (Math.pow(radius, 2));
            case "Triangle":
                // area de un triangulo
                return (base * height) / 2;
            default:
                return 0;
        }
    }
}

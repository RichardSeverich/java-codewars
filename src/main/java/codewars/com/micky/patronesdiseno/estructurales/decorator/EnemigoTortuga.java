package codewars.com.micky.patronesdiseno.estructurales.decorator;

/**
 * Class.
 */
public class EnemigoTortuga implements ICrearEnemigo {

    /**
    * Constructor.
    */
    public EnemigoTortuga() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String crearEnemigo(final Enemigo enemigo) {
        return "se creo un enemigo de tipo " + enemigo.getTipo();
    }
}

package codewars.com.micky.patronesdiseno.estructurales.decorator;

/**
 * Class.
 */
public class EnemigoHongo implements ICrearEnemigo {

    /**
    * Constructor.
    */
    public EnemigoHongo() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String crearEnemigo(final Enemigo enemigo) {
        return "se creo un enemigo de tipo " + enemigo.getTipo();
    }
}

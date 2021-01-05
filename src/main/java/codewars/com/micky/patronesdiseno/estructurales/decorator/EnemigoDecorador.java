package codewars.com.micky.patronesdiseno.estructurales.decorator;

/**
 * Abstract Class.
 */
public abstract class EnemigoDecorador implements ICrearEnemigo {
    protected ICrearEnemigo enemigoDecorado;

    /**
    * Constructor.
    * @param enemigoDecorado enemigoDecorado.
    */
    public EnemigoDecorador(final ICrearEnemigo enemigoDecorado) {
        this.enemigoDecorado = enemigoDecorado;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String crearEnemigo(final Enemigo enemigo) {
        return this.enemigoDecorado.crearEnemigo(enemigo);
    }
}

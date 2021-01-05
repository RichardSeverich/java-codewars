package codewars.com.micky.patronesdiseno.estructurales.decorator;

/**
 * Class.
 */
public class ArmaduraEnemigo extends EnemigoDecorador {

    /**
    * Constructor.
    * @param enemigoDecorado enemigoDecorado.
    */
    public ArmaduraEnemigo(final ICrearEnemigo enemigoDecorado) {
        super(enemigoDecorado);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String crearEnemigo(final Enemigo enemigo) {
        return  enemigoDecorado.crearEnemigo(enemigo) + agrearArmadura(enemigo);
    }

    /**
     * @param enemigo enemigo.
     * @return String.
     */
    public String agrearArmadura(final Enemigo enemigo) {
        return " se agrego armadura";
    }
}

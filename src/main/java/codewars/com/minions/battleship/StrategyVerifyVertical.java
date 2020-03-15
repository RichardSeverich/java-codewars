package codewars.com.minions.battleship;

/**
 * Class.
 */
public class StrategyVerifyVertical implements StrategyShip {

    /**
     * {@inheritDoc}.
     */
    @Override
    public void action(final Ship ship, final Ocean ocean, final int ind) {
        ShipHelper.setValidPosition(!ocean.isOccupied(ind, ship.getBowColumn()));
        ShipHelper.verifyBorder(ocean, ind, ship.getBowColumn());
    }
}

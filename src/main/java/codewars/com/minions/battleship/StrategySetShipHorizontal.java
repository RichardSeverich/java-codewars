package codewars.com.minions.battleship;

/**
 * Class.
 */
public class StrategySetShipHorizontal implements StrategyShip {

    /**
     * {@inheritDoc}.
     */
    @Override
    public void action(final Ship ship, final Ocean ocean, final int ind) {
        ocean.getShipArray()[ship.getBowRow()][ind] = ship;
    }
}

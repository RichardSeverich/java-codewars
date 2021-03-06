package codewars.com.minions.battleship;

/**
 * Class.
 */
final class StrategyManager {

    /**
     * Constructor.
     */
    private StrategyManager() {
    }

    /**
     * @param strategyShip Strategy.
     * @param ship         Ship.
     * @param ocean        Ocean.
     */
    static void strategyHorizontal(final StrategyShip strategyShip, final Ship ship, final Ocean ocean) {
        for (int j = ship.getBowColumn(); j < ship.getBowColumn() + ship.getLength(); j++) {
            strategyShip.action(ship, ocean, j);
        }
    }

    /**
     * @param strategyShip Strategy.
     * @param ship         Ship.
     * @param ocean        Ocean.
     */
    static void strategyVertical(final StrategyShip strategyShip, final Ship ship, final Ocean ocean) {
        for (int i = ship.getBowRow(); i < ship.getBowRow() + ship.getLength(); i++) {
            strategyShip.action(ship, ocean, i);
        }
    }

    /**
     * @param strategyShip Strategy.
     * @param ship         Ship.
     * @param ocean        Ocean.
     */
    static void strategyValidPosition(final StrategyShip strategyShip, final Ship ship, final Ocean ocean) {
        if (ship.isHorizontal() && ship.getBowColumn() + ship.getLength() - 1 < ocean.getShipArray().length) {
            strategyHorizontal(strategyShip, ship, ocean);
        } else if (!ship.isHorizontal() && ship.getBowRow() + ship.getLength() - 1 < ocean.getShipArray().length) {
            strategyVertical(strategyShip, ship, ocean);
        } else {
            ShipHelper.setValidPosition(false);
        }
    }
}

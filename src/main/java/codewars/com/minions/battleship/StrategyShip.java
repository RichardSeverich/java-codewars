package codewars.com.minions.battleship;

/**
 * Interface.
 */
public interface StrategyShip {

    /**
     * @param ship  ship.
     * @param ocean ocean.
     * @param ind   ind.
     */
    void action(Ship ship, Ocean ocean, int ind);
}

package codewars.com.minions.battleship;

/**
 * Class.
 */
public class BattleCruiser extends Ship {

    private static final int SHIP_NUM = 1;
    private static final String SHIP_TYPE = "battlecruiser";
    private static final int SHIP_LENGTH = 7;

    /**
     * Constructor.
     */
    BattleCruiser() {
        super.setLength(SHIP_LENGTH);
        super.setHit(new boolean[SHIP_LENGTH]);
        super.setNumber(SHIP_NUM);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public String getShipType() {
        return SHIP_TYPE;
    }
}

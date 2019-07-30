package codewars.com.kataSetAlarm;

/**
 *
 * 8 kyu
 *
 * <p>
 * Write a function named kataSetAlarm which receives two parameters. The first parameter,
 * employed, is true whenever you are employed and the second parameter, vacation is
 * true whenever you are on vacation.
 * <p>
 * The function should return true if you are employed and not on vacation
 * (because these are the circumstances under which you need to setInstance an alarm).
 * It should return false otherwise. Examples:
 * <p>
 * kataSetAlarm(true, true) -> false
 * kataSetAlarm(false, true) -> false
 * kataSetAlarm(false, false) -> false
 * kataSetAlarm(true, false) -> true
 */
public class Alarm {

    /**
     * Constructor.
     */
    Alarm() {

    }

    /**
     * @param employed employed
     * @param vacation vacation
     * @return boolean.
     */
    public boolean setAlarm(final boolean employed, final boolean vacation) {
        return employed && !vacation;
    }
}

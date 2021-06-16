package codewars.com.richard.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.GregorianCalendar;
import java.util.Map;

/**
 * Test.
 */
public class AlertServiceTest {

    private AlertService alertService;
    private IAlertDAO alertDao;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        this.alertDao = new MapAlertDAO();
        this.alertService = new AlertService(this.alertDao);
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        this.alertService.raiseAlert();
        MapAlertDAO mapAlertDAO = (MapAlertDAO) this.alertDao;
        Map.Entry<UUID,Date> entry = mapAlertDAO.alerts.entrySet().iterator().next();
        UUID key = entry.getKey();
        Date value = entry.getValue();
        Assert.assertEquals(value, this.alertService.getAlertTime(key));
    }
}

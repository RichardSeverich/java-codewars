package codewars.com.richard.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class MapAlertDAO implements IAlertDAO {

    // public for unit tests
    public final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    @Override
    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    @Override
    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
}

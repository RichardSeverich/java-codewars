package codewars.com.richard.dao;

import java.util.Date;
import java.util.UUID;

class AlertService {

    private final IAlertDAO storage;

    AlertService(IAlertDAO storage){
       this.storage = storage;
    }

    public UUID raiseAlert() {
        return this.storage.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.storage.getAlert(id);
    }
}

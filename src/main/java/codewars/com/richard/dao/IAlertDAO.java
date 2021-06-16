package codewars.com.richard.dao;

import java.util.Date;
import java.util.UUID;

interface IAlertDAO {
    public UUID addAlert(Date time);
    public Date getAlert(UUID id);
}

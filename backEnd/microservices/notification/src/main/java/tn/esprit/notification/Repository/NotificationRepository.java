package tn.esprit.notification.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.notification.Entities.notifaction;
@Repository
public interface NotificationRepository extends CrudRepository<notifaction, Integer> {
}

package tn.esprit.notification.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.notification.Repository.NotificationRepository;

@Service
public class NotificationService {
@Autowired
    private NotificationRepository notificationRepository;
}

package tn.esprit.notification.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class notifaction {
@Id
    @GeneratedValue
    private int idNotification;

}

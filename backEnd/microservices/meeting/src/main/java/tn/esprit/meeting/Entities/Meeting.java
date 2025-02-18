package tn.esprit.meeting.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Meeting {
    @Id
    @GeneratedValue
    private int idMeeting;
    private int reference;
    private String link;
    private boolean Status;

}

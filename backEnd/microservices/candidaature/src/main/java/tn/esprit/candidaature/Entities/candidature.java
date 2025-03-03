package tn.esprit.candidaature.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class candidature {
    @Id
    @GeneratedValue
    private int idApplication;
    private Date applicationDate;
    private String link;
    private String motivation;

    public candidature() {}
    public candidature(String motivation, String link, Date applicationDate, int idApplication) {
        this.motivation = motivation;
        this.link = link;
        this.applicationDate = applicationDate;
        this.idApplication = idApplication;
    }
}
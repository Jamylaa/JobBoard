package tn.esprit.meeting.Repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.meeting.Entities.Meeting;
@Repository
public interface MeetingRepository  extends CrudRepository<Meeting, Integer> {
}

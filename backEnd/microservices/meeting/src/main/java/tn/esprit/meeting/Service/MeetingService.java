package tn.esprit.meeting.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.meeting.Repositories.MeetingRepository;

@Service
public class MeetingService {

@Autowired
    private MeetingRepository meetingRepository;
}

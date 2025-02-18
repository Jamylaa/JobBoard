package tn.esprit.meeting.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MeetingController {

    @RequestMapping("/Mic5/meeting")
    public String sayHello() {return " Welcome to Mic5_Meeting";}

}

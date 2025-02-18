package tn.esprit.notification.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class NotificationController {
    @GetMapping("/ Mic4/Notification ")
    public String sayHello() {return "Welcome to Notification";}

}


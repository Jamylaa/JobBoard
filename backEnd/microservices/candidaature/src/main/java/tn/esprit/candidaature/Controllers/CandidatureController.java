package tn.esprit.candidaature.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.candidaature.Entities.candidature;
import tn.esprit.candidaature.Service.CandidatureService;

import java.util.List;

@RestController
@RequestMapping
        //("/mic3/candidature")
public class CandidatureController {

    @GetMapping("/Mic3/Candidature ")
    public String sayHello() {return " Welcome to Mic3_Candidature ";}

    @Autowired
    private CandidatureService candidatureService;


//    public ResponseEntity<List<candidature>> listAllCandidature() {
//        return new ResponseEntity<>(candidatureService.findAll(),
//                HttpStatus.OK);
//    }

}

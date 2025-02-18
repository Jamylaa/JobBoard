package tn.esprit.candidaature.Service;
import tn.esprit.candidaature.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.candidaature.Entities.candidature;
import tn.esprit.candidaature.Repositories.CandidatureRepository;

import java.util.List;

@Service
public class CandidatureService {

    @Autowired
    private CandidatureRepository candidatureRepository;

  //  public List<candidature> findAll() {return candidatureRepository.findAll();}
}

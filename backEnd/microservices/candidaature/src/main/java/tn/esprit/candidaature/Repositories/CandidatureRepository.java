package tn.esprit.candidaature.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.candidaature.Entities.candidature;

public interface CandidatureRepository extends CrudRepository<candidature, Integer> {
}

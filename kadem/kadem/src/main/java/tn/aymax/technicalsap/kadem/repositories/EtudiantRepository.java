package tn.aymax.technicalsap.kadem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.aymax.technicalsap.kadem.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
}

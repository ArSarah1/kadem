package tn.aymax.technicalsap.kadem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.aymax.technicalsap.kadem.entities.Equipe;
import tn.aymax.technicalsap.kadem.entities.Option;
import tn.aymax.technicalsap.kadem.entities.Specialite;

import java.util.List;

public interface EquipeRepository extends JpaRepository<Equipe , Integer> {

     List<Equipe> findTopByEtudiantsOptionAndEtudiantsContratsSpecialite(Option o , Specialite s);
}

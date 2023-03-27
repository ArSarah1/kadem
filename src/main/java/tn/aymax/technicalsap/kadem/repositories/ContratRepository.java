package tn.aymax.technicalsap.kadem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.aymax.technicalsap.kadem.entities.Contrat;

import java.time.LocalDate;
import java.util.List;

public interface ContratRepository extends JpaRepository<Contrat,Integer> {
    Integer countContratByArchiveIsFalseAndEtudiant_NomEAndEtudiant_PrenomE(String nomE , String prenomE );

    @Query("SELECT c FROM Contrat c WHERE c.idUniv = ?1 AND c.dateDebutContrat >= ?2 AND c.dateFinContrat <= ?3 ")
    List<Contrat> findByUniversiteIdAndDateRange(Integer idUniversite, LocalDate dateDebutContrat, LocalDate dateFinContrat);


}

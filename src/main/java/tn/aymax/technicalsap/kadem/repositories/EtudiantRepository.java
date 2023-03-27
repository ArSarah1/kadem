package tn.aymax.technicalsap.kadem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.aymax.technicalsap.kadem.entities.Etudiant;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

    Etudiant findByNomEAndPrenomE(String nomE , String prenomE );

    @Query("SELECT e FROM Etudiant e WHERE e.idDepart = ?1")
    List<Etudiant> findByDepartementId(Integer idDepart);

}
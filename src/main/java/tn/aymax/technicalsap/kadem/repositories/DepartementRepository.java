package tn.aymax.technicalsap.kadem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.aymax.technicalsap.kadem.entities.Department;

import java.util.List;

public interface DepartementRepository extends JpaRepository<Department, Integer> {

    @Query("SELECT d FROM Department d WHERE d.idUniv = ?1")
    List<Department> findByUniversiteId(Integer idUniversite);

}

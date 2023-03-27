package tn.aymax.technicalsap.kadem.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.aymax.technicalsap.kadem.entities.Department;
import tn.aymax.technicalsap.kadem.entities.University;
import tn.aymax.technicalsap.kadem.repositories.DepartementRepository;
import tn.aymax.technicalsap.kadem.repositories.UniversityRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IDepartmentServicesImp implements IDepartmentServices{


    private final DepartementRepository departementRepository;
    private final UniversityRepository universityRepository;
    @Override
    public void AddDepart(Department d) {
        departementRepository.save(d);

    }

    @Override
    public void UpdateDepart(Department d) {
        departementRepository.save(d);

    }

    @Override
    public void DeleteDepart(Integer idDepart) {
        departementRepository.deleteById(idDepart);

    }

    @Override
    public List<Department> GetAll() {
        return departementRepository.findAll();

    }

    @Override
    public Department GetById(Integer idDepart) {
        return departementRepository.findById(idDepart).get();
    }

    @Override
    public void assignUniversiteToDepartement(Integer idUniv, Integer idDepart) {

        University university = universityRepository.findById(idUniv).orElseThrow(() -> new EntityNotFoundException("University not found"));
        Department department = departementRepository.findById(idDepart).orElseThrow(() -> new EntityNotFoundException("Department not found"));

        // Associate the university with the department
        department.setUniversity(university);
        departementRepository.save(department);
    }

    @Override
    public List<Department> retrieveDepartementsByUniversite(Integer idUniv) {
        return departementRepository.findByUniversiteId(idUniv);
    }


}

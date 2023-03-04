package tn.aymax.technicalsap.kadem.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.aymax.technicalsap.kadem.entities.Department;
import tn.aymax.technicalsap.kadem.entities.University;
import tn.aymax.technicalsap.kadem.repositories.DepartementRepository;
import tn.aymax.technicalsap.kadem.repositories.UniversityRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IUniversityServiceImp implements IUniversityServices {


    private final UniversityRepository universityRepository;
    private final DepartementRepository departementRepository;

    @Override
    public void AddUniv(University u) {
        universityRepository.save(u);

    }

    @Override
    public void UpdateUniv(University u) {
        universityRepository.save(u);

    }

    @Override
    public void DeleteUniv(Integer idUniv) {
        universityRepository.deleteById(idUniv);
    }

    @Override
    public University GetById(Integer idUniv) {
        return universityRepository.findById(idUniv).get();
    }

    @Override
    public List<University> GetAll() {
        return universityRepository.findAll();
    }

    @Override
    public void assignUnivToDepartment(Integer idUniv, Integer idDepart) {
        // récuperation des objets
        // Etudiant etudiant = this.getById(idEtudiant);

        University university = universityRepository.findById(idUniv).orElse(null);
        Department department = departementRepository.findById(idDepart).orElse(null);

        Assert.notNull(university,"University not Null");
        Assert.notNull(department,"Department Not Null");

        university.getDepartments().add(department);
            universityRepository.save(university);
        }
    }


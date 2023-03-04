package tn.aymax.technicalsap.kadem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.aymax.technicalsap.kadem.entities.University;
import tn.aymax.technicalsap.kadem.repositories.UniversityRepository;

import java.util.List;

@Service
public class IUniversityServiceImp implements IUniversityServices {

    @Autowired
    private UniversityRepository universityRepository;

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
        universityRepository.deleteById( idUniv );
    }

    @Override
    public University GetById(Integer idUniv) {
        return universityRepository.findById(idUniv).get();
    }

    @Override
    public List<University> GetAll() {
        return universityRepository.findAll();
    }
}

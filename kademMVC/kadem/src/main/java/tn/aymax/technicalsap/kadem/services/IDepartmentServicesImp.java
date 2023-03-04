package tn.aymax.technicalsap.kadem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.aymax.technicalsap.kadem.entities.Department;
import tn.aymax.technicalsap.kadem.repositories.DepartementRepository;

import java.util.List;

@Service
public class IDepartmentServicesImp implements IDepartmentServices{

    @Autowired
    private DepartementRepository departementRepository;
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
}

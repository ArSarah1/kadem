package tn.aymax.technicalsap.kadem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.aymax.technicalsap.kadem.entities.Etudiant;
import tn.aymax.technicalsap.kadem.repositories.EtudiantRepository;

import java.util.List;

@Service
public class IEtudiantServiceImp implements IEtudiantServices {

    @Autowired
    private EtudiantRepository etudiantRepiository;

    @Override
    public void addEtudiant(Etudiant e) {
        etudiantRepiository.save(e);
    }

    @Override
    public void updateEtudiant(Etudiant e) {
        etudiantRepiository.save(e);
    }

    @Override
    public void deleteEtudiant(Integer idEtudiant) {
        etudiantRepiository.deleteById(idEtudiant);

    }

    @Override
    public List<Etudiant> getAll() {
        return etudiantRepiository.findAll();
    }

    @Override
    public Etudiant getById(Integer idEtudiant) {
        return etudiantRepiository.findById(idEtudiant).get();
    }

}

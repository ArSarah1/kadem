package tn.aymax.technicalsap.kadem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.aymax.technicalsap.kadem.entities.Etudiant;

import java.util.List;

@Service
public class IContratServiceImp implements IContractServices {

    @Autowired
    private ContratRepository contratRepository;

    @Override
    public void addContrat(Contrat c) {
        contratRepiository.save(c);
    }

    @Override
    public void updateContrat(Contrat c) {
        contratRepiository.save(e);
    }

    @Override
    public void deleteContrat(Integer idContrat) {
        contratRepiository.deleteById(idContrat);

    }

    @Override
    public List<Contrat>getAll() {
        return contratRepiository.findAll();
    }

    @Override
    public Contrat getById(Integer idcontrat) {
        return contratRepiository.findById(idcontrat).get();
    }
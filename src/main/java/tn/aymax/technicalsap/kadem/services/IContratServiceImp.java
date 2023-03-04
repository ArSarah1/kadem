package tn.aymax.technicalsap.kadem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.aymax.technicalsap.kadem.entities.Contrat;
import tn.aymax.technicalsap.kadem.repositories.ContratRepository;

import java.util.List;
@Service
public class IContratServiceImp implements IContractServices {

    @Autowired
    private ContratRepository contratRepository;

    @Override
    public void addContrat(Contrat c) {
        contratRepository.save(c);
    }

    @Override
    public void updateContart(Contrat c) {
        contratRepository.save(c);
    }

    @Override
    public void deleteContrat(Integer idContrat) {
        contratRepository.deleteById(idContrat);

    }

    @Override
    public List<Contrat>getAll() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat getById(Integer idcontrat) {
        return contratRepository.findById(idcontrat).get();
    }
    }
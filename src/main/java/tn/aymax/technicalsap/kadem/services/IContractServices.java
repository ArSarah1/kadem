package tn.aymax.technicalsap.kadem.services;

import tn.aymax.technicalsap.kadem.entities.Contrat;

import java.util.List;

public interface IContractServices {
    void addContrat(Contrat c);
    void updateContart(Contrat c);
        void deleteContrat(Integer idContrat);
    Contrat getById(Integer idContrat);
    List<Contrat> getAll();

}

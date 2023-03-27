package tn.aymax.technicalsap.kadem.services;

import tn.aymax.technicalsap.kadem.entities.Contrat;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface IContractServices {
    void addContrat(Contrat c);
    void updateContart(Contrat c);
        void deleteContrat(Integer idContrat);
    Contrat getById(Integer idContrat);
    List<Contrat> getAll();

    Contrat affectContratToEtudiant(Contrat ce , String nomE, String prenomE) ;
    public Map<String, Float> getMontantContratEntreDeuxDates(int idUniv, LocalDate dateDebutContrat, LocalDate dateFinContrat)

}

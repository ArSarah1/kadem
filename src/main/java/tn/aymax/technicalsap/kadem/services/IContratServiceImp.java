package tn.aymax.technicalsap.kadem.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.aymax.technicalsap.kadem.entities.Contrat;
import tn.aymax.technicalsap.kadem.entities.Etudiant;
import tn.aymax.technicalsap.kadem.repositories.ContratRepository;
import tn.aymax.technicalsap.kadem.repositories.EtudiantRepository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class IContratServiceImp implements IContractServices {


    private final ContratRepository contratRepository;
    private final EtudiantRepository etudiantRepository;


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
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {
        Etudiant e = etudiantRepository.findByNomEAndPrenomE( nomE , prenomE );
        if (e.getContrats().size() < 5 ){
        ce.setEtudiant(e);
        contratRepository.save(ce);
        return ce;
        }
        else {
            return null;
        }
    }

    @Override
    public Map<String, Float> getMontantContratEntreDeuxDates(int idUniv, LocalDate dateDebutContrat, LocalDate dateFinContrat) {
        List<Contrat> contrats = contratRepository.findByUniversiteIdAndDateRange(idUniv, dateDebutContrat, dateFinContrat);
        Map<String, Float> montantContrats = new HashMap<>();

        for (Contrat contrat : contrats) {
            montantContrats.put(contrat.getNomContart(),contrat.getMontantContart());
        }
        return montantContrats;
    }


    @Override
    public Contrat getById(Integer idcontrat) {
        return contratRepository.findById(idcontrat).get();
    }
    }
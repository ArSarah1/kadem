package tn.aymax.technicalsap.kadem.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.aymax.technicalsap.kadem.entities.Contrat;
import tn.aymax.technicalsap.kadem.entities.Department;
import tn.aymax.technicalsap.kadem.entities.Equipe;
import tn.aymax.technicalsap.kadem.entities.Etudiant;
import tn.aymax.technicalsap.kadem.repositories.ContratRepository;
import tn.aymax.technicalsap.kadem.repositories.DepartementRepository;
import tn.aymax.technicalsap.kadem.repositories.EquipeRepository;
import tn.aymax.technicalsap.kadem.repositories.EtudiantRepository;

import java.util.IdentityHashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IEtudiantServiceImp implements IEtudiantServices {


    private final EtudiantRepository etudiantRepiository;
    private final DepartementRepository departementRepository;
    private final ContratRepository contratRepository;
    private final EquipeRepository equipeRepository;

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
    public void assignEtudiantToDepartment(Integer idEtudiant , Integer idDepart) {
        // récuperation des objets
        // Etudiant etudiant = this.getById(idEtudiant);

        Etudiant etudiant = etudiantRepiository.findById(idEtudiant).orElse(null);
        Department department = departementRepository.findById(idDepart).orElse(null);

        // vérification des objets
         if ((etudiant != null) && (department != null) ) {
             // traitement
              etudiant.setDepartment(department);
            // department.getEtudiants().add(etudiant);
             // saving
             etudiantRepiository.save(etudiant);
        }
    }

    @Override
    public Etudiant addAssignEtudiantToEquipeAndContrat(Etudiant e, Integer idContart, Integer idEquipe) {
        Contrat contrat = contratRepository.findById(idContart).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);

        Assert.notNull(contrat , "Contrat Not Null");
        Assert.notNull(equipe, "Equipe Not Null");

        e.getEquipes().add(equipe);
        // on a une lsite vide => on utilise SetEtudiant non pas GETEtudiant
        contrat.setEtudiant(e);


        contratRepository.save(contrat);
        return etudiantRepiository.save(e);

    }

    @Override
    public Etudiant getById(Integer idEtudiant) {

         return etudiantRepiository.findById(idEtudiant).get();

    }

}

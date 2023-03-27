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

import javax.transaction.Transactional;
import java.util.ArrayList;
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
    @Transactional
    public Etudiant addAssignEtudiantToEquipeAndContrat(Etudiant e, Integer idContart, Integer idEquipe) {
        Contrat contrat = contratRepository.findById(idContart).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);

        Assert.notNull(contrat , "Contrat is Null");
        Assert.notNull(equipe, "Equipe is Null");
        Assert.notNull(e, "Equipe is Null");

        etudiantRepiository.saveAndFlush(e);
        List<Equipe> equipes = new ArrayList<>();
        equipes.add(equipe);
        e.setEquipes(equipes);
        contrat.setEtudiant(e);
        return e;

    }
    private List<Etudiant> etudiants = new ArrayList<>();
    @Override
    public List<Etudiant> getEtudiantsByDepartement(Integer idDepart) {
        List<Etudiant> etudiantsByDepartement = new ArrayList<>();

        for (Etudiant etudiant : etudiants) {
            if (etudiant.getIdDepart().equals(idDepart)) {
                etudiantsByDepartement.add(etudiant);
            }
        }
        return etudiantsByDepartement;
    }

    @Override
    public Etudiant getById(Integer idEtudiant) {

         return etudiantRepiository.findById(idEtudiant).get();

    }


}

package tn.aymax.technicalsap.kadem.services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.aymax.technicalsap.kadem.entities.Equipe;
import tn.aymax.technicalsap.kadem.entities.Etudiant;
import tn.aymax.technicalsap.kadem.repositories.EquipeRepository;


import java.util.List;

public interface IEquipeServices {
    void addEquipe(Equipe e);
    void updateEquipe(Equipe e);
    void deleteEquipe(Integer idEquipe);
    Equipe getById(Integer idEquipe);
    List<Equipe> getAll();

}

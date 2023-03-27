package tn.aymax.technicalsap.kadem.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.aymax.technicalsap.kadem.entities.Equipe;
import tn.aymax.technicalsap.kadem.repositories.EquipeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IEquipeServiceImp  implements  IEquipeServices {

    private final EquipeRepository equipeRepository;

    @Override
    public void addEquipe(Equipe e) {

        equipeRepository.save(e);
    }

    @Override
    public void updateEquipe(Equipe e) {

        equipeRepository.save(e);
    }

  @Override
    public void deleteEquipe(Integer idEtudiant) {
        equipeRepository.deleteById(idEtudiant);

    }

    @Override
    public List<Equipe> getAll() {

        return equipeRepository.findAll();
    }


    @Override
    public Equipe getById(Integer idEquipe){
         return equipeRepository.findById(idEquipe).get();
    }
}

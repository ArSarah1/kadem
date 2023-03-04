package tn.aymax.technicalsap.kadem.services;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import tn.aymax.technicalsap.kadem.entities.DetailEquipe;
        import tn.aymax.technicalsap.kadem.repositories.DetailEquRepository;

        import java.util.List;

@Service
public class IDetailEquServicesImpl implements IDetailEquService{

    @Autowired
    private DetailEquRepository detailEquRepository;

    @Override
    public void AddDetail(DetailEquipe de) {
        detailEquRepository.save(de);

    }

    @Override
    public void UpdateDetail(DetailEquipe de) {
        detailEquRepository.save(de);

    }

    @Override
    public void DeleteDetail(Integer idDetailEquipe) {
        detailEquRepository.deleteById(idDetailEquipe);

    }

    @Override
    public List<DetailEquipe> GetAll() {
        return detailEquRepository.findAll();

    }

    @Override
    public DetailEquipe GetById(Integer idDetialEquipe) {
        return detailEquRepository.findById(idDetialEquipe).get();
    }
}
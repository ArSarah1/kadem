package tn.aymax.technicalsap.kadem.services;

import tn.aymax.technicalsap.kadem.entities.Etudiant;
import tn.aymax.technicalsap.kadem.entities.University;

import java.util.List;

public interface IUniversityServices {
    void AddUniv(University u);
    void UpdateUniv(University u);
    void DeleteUniv(Integer idUniv);
    University GetById(Integer idUniv);
    List<University> GetAll();

    void assignUnivToDepartment(Integer idUniv , Integer IdDepart);
}


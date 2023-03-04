package tn.aymax.technicalsap.kadem.services;

import tn.aymax.technicalsap.kadem.entities.Etudiant;

import java.util.List;

public interface IEtudiantServices {

    void addEtudiant(Etudiant e);
    void updateEtudiant(Etudiant e);
    void deleteEtudiant(Integer idEtudiant);
    Etudiant getById(Integer idEtudiant);
    List<Etudiant> getAll();

    void assignEtudiantToDepartment(Integer idEtudiant , Integer IdDepart);
    Etudiant addAssignEtudiantToEquipeAndContrat(Etudiant e , Integer idContart , Integer idEquipe);
}

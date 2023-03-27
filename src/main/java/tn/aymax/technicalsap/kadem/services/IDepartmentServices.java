package tn.aymax.technicalsap.kadem.services;

import tn.aymax.technicalsap.kadem.entities.Department;

import java.util.List;

public interface IDepartmentServices {

    void AddDepart(Department d);
    void UpdateDepart(Department d);
    void DeleteDepart(Integer idDepart);
    List<Department> GetAll();
    Department GetById(Integer idDepart);
    public void assignUniversiteToDepartement(Integer idUniv, Integer idDepart);
     List<Department> retrieveDepartementsByUniversite(Integer idUniv);
}

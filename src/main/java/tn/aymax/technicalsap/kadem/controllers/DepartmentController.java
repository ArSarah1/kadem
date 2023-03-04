package tn.aymax.technicalsap.kadem.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.aymax.technicalsap.kadem.entities.Department;
import tn.aymax.technicalsap.kadem.entities.Etudiant;
import tn.aymax.technicalsap.kadem.services.IDepartmentServices;
import tn.aymax.technicalsap.kadem.services.IEtudiantServices;

import java.util.List;

@RestController
@RequestMapping("Department")
@RequiredArgsConstructor
public class DepartmentController {

    private final IDepartmentServices iDepartmentServices;
    @PostMapping("AddDepart")
    public void AddDepart(@RequestBody Department department){
        iDepartmentServices.AddDepart(department);

    }

    @DeleteMapping("/UpdateDepart")
    public void UpdateDepart(@RequestBody Department department){
        iDepartmentServices.AddDepart(department);
    }


    @GetMapping("/getAll")
    public List<Department> GetAll() {
        return iDepartmentServices.GetAll();

    }

    @GetMapping("GetById")
    public Department GetById(@PathVariable int idDeaprt){
        return iDepartmentServices.GetById(idDeaprt);
    }


}

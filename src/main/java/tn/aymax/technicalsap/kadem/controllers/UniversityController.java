package tn.aymax.technicalsap.kadem.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.aymax.technicalsap.kadem.entities.Etudiant;
import tn.aymax.technicalsap.kadem.entities.University;
import tn.aymax.technicalsap.kadem.services.IEtudiantServiceImp;
import tn.aymax.technicalsap.kadem.services.IUniversityServices;

import java.util.List;

@RequestMapping
@RestController("University")
@RequiredArgsConstructor
public class UniversityController {

private final IUniversityServices iUniversityServices ;

@GetMapping("{idUniv}")
    public University GetById (@PathVariable int idUniv){
            return iUniversityServices.GetById(idUniv);
}

@GetMapping("{idUniv}")
    public List<University> GetAll(){
        return iUniversityServices.GetAll();
}
@PostMapping("{/AddUniv}")
    public void AddUniv (@RequestBody University university){
           iUniversityServices.AddUniv(university);

}
@PostMapping("/UpdateUniv")
    private University UpdateUniv(@RequestBody University university){
        iUniversityServices.UpdateUniv(university);
        return university;

}

    @PutMapping("{idUniv}/{idDepart}")
    public void assignUnivToDepartment(@PathVariable Integer idUniv, @PathVariable Integer idDepart) {
        iUniversityServices.assignUnivToDepartment(idUniv , idDepart);
    }



}

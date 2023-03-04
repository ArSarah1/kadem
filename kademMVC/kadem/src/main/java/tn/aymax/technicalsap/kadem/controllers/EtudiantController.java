package tn.aymax.technicalsap.kadem.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.aymax.technicalsap.kadem.entities.Etudiant;
import tn.aymax.technicalsap.kadem.services.IEtudiantServices;

import java.util.List;

@RestController
@RequestMapping("etudiant")
@RequiredArgsConstructor
    public class EtudiantController {

        private final IEtudiantServices iEtudiantServices ;
        @GetMapping("/SayHello")
        public String SayHello() {
        return "Hello";

    }

    @GetMapping("/getAll")
    public List<Etudiant> getAll() {
        return iEtudiantServices.getAll();

    }

    @GetMapping("{idEtudiant}")
    public Etudiant getById(@PathVariable int idEtudiant) {
        return iEtudiantServices.getById(idEtudiant);
    }

    @PostMapping("{/addEtudiant}")
    public void addEtudiant(@RequestBody Etudiant etudiant) {

         iEtudiantServices.addEtudiant(etudiant);
    }

    @DeleteMapping("/updateEtudaint")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
        iEtudiantServices.updateEtudiant(etudiant);
        return etudiant;
    }
}


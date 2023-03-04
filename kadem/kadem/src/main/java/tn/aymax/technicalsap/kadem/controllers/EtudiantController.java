package tn.aymax.technicalsap.kadem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.aymax.technicalsap.kadem.entities.Etudiant;
import tn.aymax.technicalsap.kadem.services.IEtudiantServices;

import java.util.List;

@RestController
    public class EtudiantController {
        @Autowired
        IEtudiantServices iEtudiantServices ;
        @GetMapping("/SayHello")
        public String SayHello() {
        return "Hello";

    }

    @GetMapping("/getAll")
    public List<Etudiant> getAll() {
        return iEtudiantServices.getAll();

    }

    @GetMapping("/getById/{idEtudiant}")
    public Etudiant getById(@PathVariable int idEtudiant) {
        return iEtudiantServices.getById(idEtudiant);
    }

    @PostMapping("/getById/{addEtudiant}")
    public void addEtudiant(@RequestBody Etudiant etudiant) {

         iEtudiantServices.addEtudiant(etudiant);
    }

    @DeleteMapping("/updateEtudaint")
    private Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
        iEtudiantServices.updateEtudiant(etudiant);
        return etudiant;
    }
}


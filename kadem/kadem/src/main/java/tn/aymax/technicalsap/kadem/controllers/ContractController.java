package tn.aymax.technicalsap.kadem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.aymax.technicalsap.kadem.entities.Contart;
import tn.aymax.technicalsap.kadem.entities.Etudiant;
import tn.aymax.technicalsap.kadem.services.IContractServices;
import tn.aymax.technicalsap.kadem.services.IEtudiantServices;

import java.util.List;
@RestController
public class ContractController {
    @Autowired
    IContractServices icontractServices ;

    @GetMapping("/getAll")
    public List<Contart> getAll() {
        return icontractServices.getAll();

    }

    @GetMapping("/getById/{idContrat}")
    public Contart getById(@PathVariable int idContrat) {
        return icontractServices.getById(idContrat);
    }

    @PostMapping("/getById/{addContrat}")
    public void addContrat(@RequestBody Contart contrat) {

        icontractServices.addContart(contrat);
    }

    @DeleteMapping("/updateContrat")
        private Contart updateContrat(@RequestBody Contart contart){
        icontractServices.updateContart(contart);
        return contart;
    }

}

package tn.aymax.technicalsap.kadem.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.aymax.technicalsap.kadem.entities.Contrat;
import tn.aymax.technicalsap.kadem.entities.Department;
import tn.aymax.technicalsap.kadem.entities.Etudiant;
import tn.aymax.technicalsap.kadem.services.IContractServices;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("contrat")
@RequiredArgsConstructor
public class ContractController {

    private final IContractServices icontractServices ;

    @GetMapping("{idContrat}")
    public Contrat getById(@PathVariable int idContrat) {
        return icontractServices.getById(idContrat);
    }


    @GetMapping("/getAll")
    public List<Contrat> getAll() {
        return icontractServices.getAll();

    }
    @PostMapping("/addContrat")
    public void addContrat(@RequestBody Contrat contrat) {

        icontractServices.addContrat(contrat);
    }

    @DeleteMapping("/updateContrat")
        private Contrat updateContrat(@RequestBody Contrat contart){
        icontractServices.updateContart(contart);
        return contart;
    }

    @GetMapping("/universite/{idUniv}")
    public ResponseEntity<Map<String, Float>> getMontantContratEntreDeuxDates(
            @PathVariable("idUniv") int idUniv,
            @RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateDebutContrat,
            @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateFinContrat) {
        Map<String, Float> montantContrats = icontractServices.getMontantContratEntreDeuxDates(idUniv, dateDebutContrat,dateFinContrat);
        return ResponseEntity.ok(montantContrats);
    }

}

package tn.aymax.technicalsap.kadem.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.aymax.technicalsap.kadem.entities.DetailEquipe;
import tn.aymax.technicalsap.kadem.entities.Etudiant;
import tn.aymax.technicalsap.kadem.services.IDepartmentServices;
import tn.aymax.technicalsap.kadem.services.IDetailEquService;
import tn.aymax.technicalsap.kadem.services.IDetailEquServicesImpl;

import java.util.List;

@RestController
@RequestMapping("DetailEquipe")
@RequiredArgsConstructor
public class DetailEquController {

  private final IDetailEquService iDetailEquServices;

  @PostMapping("/AddDetail")
    public void AddDetail(@RequestBody DetailEquipe detailEquipe){
      IDetailEquService.AddDetail(detailEquipe);

  }

  @DeleteMapping("/UpdateDetail")
    public void UpdateDetail(@RequestBody DetailEquipe detailEquipe){
       IDetailEquService.UpdateDetail(detailEquipe);

  }

    @GetMapping("/GetAll")
    public List<DetailEquipe> GetAll() {
        return iDetailEquServices.GetAll();

    }

    @GetMapping("{idDetailEquipe}")
    public DetailEquipe GetById(@PathVariable int idDetailEquipe) {

      return iDetailEquServices.GetById(idDetailEquipe);
    }

}

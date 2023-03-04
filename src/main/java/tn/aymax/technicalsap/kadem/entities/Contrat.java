package tn.aymax.technicalsap.kadem.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contrat {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idContart;
    private LocalDate dateDebutContrat ;
    private LocalDate dateFinContrat ;
    @Enumerated(EnumType.STRING)
    private  Specialite specialite ;
    private Boolean archive ;
    private int montantContart ;
    @ManyToOne
    private Etudiant etudiant;
}



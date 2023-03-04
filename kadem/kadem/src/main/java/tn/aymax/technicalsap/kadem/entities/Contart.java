package tn.aymax.technicalsap.kadem.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Contart {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idContart;
    private LocalDate dateDebutContrat ;
    private LocalDate dateFinContrat ;

    @Enumerated(EnumType.STRING)
    private  Specialite specialite ;
    private Boolean archive ;
    @OneToMany
    private int montantContart ;





}

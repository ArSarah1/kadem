package tn.aymax.technicalsap.kadem.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idDepart;
    private String nomDepart;
    @OneToMany(mappedBy = "department")
    private List<Etudiant> etudiants ;

}

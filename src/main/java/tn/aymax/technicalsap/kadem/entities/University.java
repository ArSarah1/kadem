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

public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter( AccessLevel.NONE)
    private int idUniv ;
    private String nomUniv;
    @OneToMany(mappedBy = "university")
    List<Department> departments;


}

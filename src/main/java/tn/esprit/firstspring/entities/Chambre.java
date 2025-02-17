package tn.esprit.firstspring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Chambre implements Serializable {
    @Id
    private int idChambre;
    private long numeroChambre;
    private TypeChambre TypeChambre;
    @ManyToOne
    private Bloc bloc;

}

package tn.esprit.firstspring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Etudiant implements Serializable {
    @Id
    private int idEtudiant;
    private String nomEt;
    private String prenomEt;
    private String cin ;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @ManyToMany
    @JsonIgnore
    private List<Reservation> Reservations;

}

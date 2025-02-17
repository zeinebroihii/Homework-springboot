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
public class Reservation implements Serializable {
    @Id
    private int idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private Boolean estValide;
   @ManyToMany
    private List<Chambre>  chambres ;

}

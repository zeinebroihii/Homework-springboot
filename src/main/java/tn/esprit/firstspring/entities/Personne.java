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
public class Personne implements Serializable {
    @Id
    private int id;
    private String nom;
    private String prenom;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date dateofbirth;
    @Enumerated(EnumType.STRING)
    private Gender gender;

}

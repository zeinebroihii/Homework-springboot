package tn.esprit.firstspring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;
import java.util.List;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Entreprise implements Serializable {
    @Id
    private int idEntreprise;
    private String nom;
    @OneToMany
    private List<Equipe> Equipes;
}

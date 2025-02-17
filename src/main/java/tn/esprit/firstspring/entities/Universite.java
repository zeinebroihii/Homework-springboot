package tn.esprit.firstspring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Universite implements Serializable {
   @Id
   private int idUniversite;
   private String nomUniversite;
   private String adresse;
   @OneToOne
   private Foyer Foyer;
}

package tn.esprit.firstspring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Foyer implements Serializable {
    @Id
    private int idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;
    @OneToMany
    @JsonIgnore
    private List<Chambre> chambres;
    @OneToOne(mappedBy = "Foyer")
    @JsonIgnore
    private Universite Universite;

    public void setId(Integer id) {

    }
}

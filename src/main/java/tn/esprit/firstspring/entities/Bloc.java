package tn.esprit.firstspring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bloc implements Serializable {
    @Id
    private int idBloc;
    private String nomBloc;
    private long capaciteBloc;
    @ManyToOne
    @JsonIgnore
    private Foyer foyer;
    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambres;


}

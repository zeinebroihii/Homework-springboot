package tn.esprit.firstspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspring.entities.Foyer;

@Repository
public interface IFoyerRepository extends JpaRepository<Foyer, Integer> {

    public Foyer findByNomFoyerAndCapaciteFoyer(String nomFoyer, Long capaciteFoyer);

}
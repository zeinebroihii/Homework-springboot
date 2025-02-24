package tn.esprit.firstspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspring.entities.Foyer;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Integer> {
    // Additional custom query methods if necessary
}

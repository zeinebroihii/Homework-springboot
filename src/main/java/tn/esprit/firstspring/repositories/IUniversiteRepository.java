package tn.esprit.firstspring.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspring.entities.Universite;

@Repository
public interface IUniversiteRepository extends JpaRepository<Universite, Long> {
}
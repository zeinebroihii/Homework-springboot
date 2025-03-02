package tn.esprit.firstspring.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspring.entities.Chambre;

@Repository
public interface IChambreReposirtory extends CrudRepository<Chambre, Long> {
}
package tn.esprit.tpfoyer.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.TypeChambre;

import java.util.List;

@Repository
public interface IChambreReposirtory extends CrudRepository<Chambre, Long> {

    // Récupérer les chambres non réservées d'une université par type
    @Query("SELECT c FROM Chambre c WHERE c.foyer.nom = :nomUniversite ")
    List<Chambre> findNonReservedChambresByUniversityAndType(String nomUniversite);

    // Récupérer les chambres d'un bloc par type (JPQL)
    @Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :idBloc AND c.typeChambre = :typeC")
    List<Chambre> findChambresByBlocAndTypeJPQL(long idBloc, TypeChambre typeC);

    // Récupérer les chambres d'un bloc par type (Keywords)
    List<Chambre> findByBlocIdBlocAndTypeChambre(long idBloc, TypeChambre typeC);
}
